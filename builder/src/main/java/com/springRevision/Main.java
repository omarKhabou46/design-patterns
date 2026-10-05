package com.springRevision;

import com.springRevision.model.AccountStatus;
import com.springRevision.model.AccountType;
import com.springRevision.model.BankAccount;
import com.springRevision.model.Customer;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static void main() {

        BankAccount account1 = new BankAccount();
        account1.setId(1L);
        account1.setBalance(10000);
        account1.setStatus(AccountStatus.ACTIVATED);
        account1.setType(AccountType.SAVING_ACCOUNT);
        account1.setCurrency("MAD");
        account1.setCustomer(new Customer(2L, "omar"));

        System.out.println(account1);

        BankAccount account2 = account1.clone();

        System.out.println(account2.getCustomer() == account1.getCustomer());
    }
}
