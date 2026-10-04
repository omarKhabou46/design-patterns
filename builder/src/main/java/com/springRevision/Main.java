package com.springRevision;

import com.springRevision.model.BankAccount;
import com.springRevision.repository.BankAccountRepo;
import com.springRevision.repository.BankAccountRepoImpl;
import com.springRevision.utils.JsonSerialized;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static void main() {

       BankAccountRepo bankAccountRepo = new BankAccountRepoImpl();
       bankAccountRepo.populateData();
       bankAccountRepo.findAll().stream().map(JsonSerialized::toXml).forEach(System.out::println);
    }
}
