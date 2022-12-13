package by.bsuir.kugach.wt_laba_4.builder;

import by.bsuir.kugach.wt_laba_4.exception.RepositoryException;

import java.sql.ResultSet;

public interface Builder<T> {
    T build(ResultSet resultSet) throws RepositoryException;
}
