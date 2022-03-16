package com.example.demo.annotations;

public class TestReflectionAnnotation {

	public static void main(String[] args) {
		Class c = Calculatrice.class;
		Programmer programmer = (Programmer)
				 
		c.getDeclaredAnnotation(Programmer.class);
		System.out.println(programmer.id()+":"+programmer.name());

	}
	
}

