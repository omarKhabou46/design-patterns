package com.springRevision;

import com.springRevision.repository.BankAccountRepo;
import com.springRevision.repository.BankAccountRepoImpl;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        BankAccountRepo bankAccountRepo = new BankAccountRepoImpl();
        bankAccountRepo.populateData();
        bankAccountRepo.findAll().forEach(System.out::println);
    }
}
