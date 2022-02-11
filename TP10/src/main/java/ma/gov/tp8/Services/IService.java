package ma.gov.tp8.Services;

import java.util.List;

public interface IService<T> {
	T save(T t);
	List<T> findAll();
	void update(T t);
	T findById(Long id);
	void remove(Long id);
}
