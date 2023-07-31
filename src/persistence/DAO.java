package persistence;

import java.util.List;

public interface DAO<T> {

    int add(T t);

    int update(T t);

    int delete(T t);

    List<T> selectAll();
}
