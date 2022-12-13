package by.bsuir.kugach.wt_laba_4.specification.common;

import by.bsuir.kugach.wt_laba_4.specification.Specification;

import java.util.Collections;
import java.util.List;

public class FindById implements Specification {

    private final Integer id;

    public FindById(Integer id) {
        this.id = id;
    }

    @Override
    public String toSql() {
        return "where id = ?";
    }

    @Override
    public List<Object> getParameters() {
        return Collections.singletonList(id);
    }
}
