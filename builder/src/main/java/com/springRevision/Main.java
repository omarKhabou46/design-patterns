package com.springRevision;

import com.springRevision.repository.BankAccountRepo;
import com.springRevision.repository.BankAccountRepoImpl;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static String test() {
        try {
            return "A";
        }finally {
            System.out.println("B");
            return "C";
        }
    }

    static void main() {
        int x = 5;
        System.out.println(++x);
        System.out.println(test());
    }
}
