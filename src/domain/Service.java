package domain;

import java.util.List;

public interface Service<T> {
    int add(T t);

    int update(T t);

    int delete(T t);

    List<T> selectAll();
}
