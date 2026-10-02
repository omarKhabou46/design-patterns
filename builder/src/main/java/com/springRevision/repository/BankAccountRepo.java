package com.springRevision.repository;

import com.springRevision.model.BankAccount;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public interface BankAccountRepo {
    BankAccount save(BankAccount bankAccount);
    List<BankAccount> findAll();
    Optional<BankAccount> findById(Long id);
    List<BankAccount> searchAccount(Predicate<BankAccount> predicate);
    BankAccount update(BankAccount account);
    void deleteById(Long id);
    void populateData();

}
