package by.bsuir.kugach.wt_laba_4.repository;

import by.bsuir.kugach.wt_laba_4.exception.RepositoryException;
import by.bsuir.kugach.wt_laba_4.specification.Specification;

import java.util.List;
import java.util.Map;
import java.util.Optional;


public interface Repository<T> {


    Optional<T> query(Specification specification) throws RepositoryException;


    List<T> queryAll(Specification specification) throws RepositoryException;


    void save(T item) throws RepositoryException;

    String getTableName();


    Map<String, Object> getFields(T item);
}
