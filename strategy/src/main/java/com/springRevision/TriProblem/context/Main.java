package com.springRevision.TriProblem.context;

import com.springRevision.TriProblem.DateTri;
import com.springRevision.TriProblem.ITri;
import com.springRevision.TriProblem.PriceTri;
import com.springRevision.TriProblem.Produit;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() {
        List<Produit> list = new ArrayList<>();
        list.add(new Produit(10, 10.23, "p1", LocalDate.of(2026, 9, 15)));
        list.add(new Produit(11, 25.50, "p2", LocalDate.of(2026, 3, 10)));
        list.add(new Produit(12, 15.75, "p3", LocalDate.of(2026, 8, 25)));
        list.add(new Produit(13, 99.99, "p4", LocalDate.of(2026, 1, 5)));
        Context context = new Context();
        ITri tri = new PriceTri();
        context.setTri(tri);

        list.forEach(System.out::println);
        System.out.println("....................");
        context.trier(list);
        list.forEach(System.out::println);
    }
}
