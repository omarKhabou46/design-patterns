package com.springRevision.repository;

import com.springRevision.Director;
import com.springRevision.builder.BankAccountBuilder;
import com.springRevision.model.AccountStatus;
import com.springRevision.model.AccountType;
import com.springRevision.model.BankAccount;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;

public class BankAccountRepoImpl implements BankAccountRepo {

    private static Map<Long, BankAccount> map = new HashMap<>();
    private static long accountsCount = 0;
    private static final BankAccountRepoImpl bankAaccount;


    static {
        bankAaccount = new BankAccountRepoImpl();
    }

    private BankAccountRepoImpl() {}

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
            BankAccountBuilder builder = Director.accoutBuilder()
                    .currency("MAD")
                    .balance(Math.random() * 100)
                    .status(AccountStatus.CREATED)
                    .type(Math.random() > 0.5 ? AccountType.CURRENT_ACCOUNT: AccountType.SAVING_ACCOUNT);
            save(builder.build());
        }
    }

    public static BankAccountRepoImpl getBankAaccount() {
        return bankAaccount;
    }
}
