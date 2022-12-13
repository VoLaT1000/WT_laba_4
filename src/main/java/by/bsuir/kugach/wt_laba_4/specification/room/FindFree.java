package by.bsuir.kugach.wt_laba_4.specification.room;

import by.bsuir.kugach.wt_laba_4.specification.Specification;

import java.util.Collections;
import java.util.List;

public class FindFree implements Specification {

    public FindFree() {
    }

    @Override
    public String toSql() {
        return "WHERE occupied = 'false'";
    }

    @Override
    public List<Object> getParameters() {
        return Collections.emptyList();
    }
}
