package com.springRevision.repository;

import com.springRevision.model.BankAccount;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;

public class BankAccountRepoImpl implements BankAccountRepo {

    private static Map<Long, BankAccount> map = new HashMap<>();
    private static long accountsCount = 0;

    @Override
    public BankAccount save(BankAccount bankAccount) {
        long id = ++accountsCount;
        bankAccount.setId(id);
        map.put(id, bankAccount);
        return bankAccount;
    }

    @Override
    public List<BankAccount> findAll() {
        return map.values().stream().toList();
    }

    @Override
    public Optional<BankAccount> findById(Long id) {
        BankAccount bankAccount = map.get(id);
        if (bankAccount == null) {
            return Optional.empty();
        }else {
            return Optional.of(bankAccount);
        }
    }

    @Override
    public List<BankAccount> searchAccount(Predicate<BankAccount> predicate) {
       return map.values().stream().filter(predicate).toList();
    }

    @Override
    public BankAccount update(BankAccount account) {
        map.put(account.getId(), account);
        return account;
    }

    @Override
    public void deleteById(Long id) {
      map.remove(id);
    }

    public void populateData() {
        for (int i = 0; i < 10; i++) {
            BankAccount bankAccount = BankAccount.builder()
                    .id()
                    .currency()
                    .build();
        }
    }
}
