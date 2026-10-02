package com.springRevision.TriProblem.context;

import com.springRevision.TriProblem.ITri;
import com.springRevision.TriProblem.Produit;

import java.util.List;

public class Context {

    private ITri tri;

    public void trier(List<Produit> list) {
        tri.trier(list);
    }

    public void setTri(ITri tri) {
        this.tri = tri;
    }
}
