package ma.cigma.Config.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	
	
	@Autowired
	PasswordEncoder passwordEncoder;
	
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {

		auth.inMemoryAuthentication().passwordEncoder(passwordEncoder)
									.withUser("user")
									.password(passwordEncoder.encode("123456"))
									.roles("USER")
									 .and()
									 .withUser("admin")
									 .password(passwordEncoder.encode("123456"))
									 .roles("ADMIN");
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().and()
				   .authorizeRequests()
				   .antMatchers("/add/**").hasRole("ADMIN")
				   .antMatchers("/delete/**","/update/**/**").hasRole("ADMIN")
				   .antMatchers("/","/all").hasAnyRole("ADMIN","USER")
				   .anyRequest()
				   .authenticated()
				   .and()
				   .formLogin()
				   .defaultSuccessUrl("/");
				   
	}
	
	
	

}
