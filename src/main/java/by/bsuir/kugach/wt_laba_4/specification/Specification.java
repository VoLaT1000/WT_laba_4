package by.bsuir.kugach.wt_laba_4.specification;

import java.util.List;

public interface Specification {
    String toSql();

    List<Object> getParameters();
}
