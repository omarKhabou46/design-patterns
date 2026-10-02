package com.springRevision.TriProblem;

import java.time.LocalDate;
import java.util.List;

public class DateTri implements ITri {
    @Override
    public void trier(List<Produit> list) {
        list.sort((c, p) -> c.getLocalDate().compareTo(p.getLocalDate()));
    }
}
