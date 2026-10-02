package com.springRevision.TriProblem;

import java.util.List;

public class PriceTri implements ITri{
    @Override
    public void trier(List<Produit> list) {
        list.sort((c, p) -> Double.compare(c.getPrice(), p.getPrice()));
    }
}
