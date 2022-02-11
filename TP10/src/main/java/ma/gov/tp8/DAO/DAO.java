package ma.gov.tp8.DAO;

import java.util.List;

public interface DAO<T> {
	T save(T t);
	List<T> findAll();
	void update(T t);
	T findById(Long id);
	void remove(Long id);
}
