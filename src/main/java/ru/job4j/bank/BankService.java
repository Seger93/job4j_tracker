package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private final Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        if (!users.containsKey(user)) {
            users.put(user, new ArrayList<Account>());
        }
    }

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (!(user == null)) {
            List<Account> accounts = users.get(user);
            if (!accounts.contains(account)) {
                accounts.add(account);
            }
        }
    }

    public User findByPassport(String passport) {
        for (User key : users.keySet()) {
            if (key.getPassport().equals(passport)) {
                return key;
            }
        }
        return null;
    }

    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (!(user == null)) {
            List<Account> accounts = users.get(user);
            for (Account acc : accounts) {
                if (acc.getRequisite().equals(requisite)) {
                    return acc;
                }
            }
        }
        return null;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        User givingUser = findByPassport(srcPassport);
        List<Account> accounts1 = users.get(givingUser);
        User acceptUser = findByPassport(destPassport);
        List<Account> accounts2 = users.get(acceptUser);
        Account accountGive = findByRequisite(srcPassport, srcRequisite);
        Account accountGet = findByRequisite(destPassport, destRequisite);
        if (accounts1.contains(accountGive) && accounts2.contains(accountGet)) {
            double balance1 = accountGive.getBalance();
           double balance2 = accountGet.getBalance();
           if (balance1 < amount) {
               return false;
           } else {
               accountGet.setBalance(balance2 + amount);
               accountGive.setBalance(balance1 - amount);
               return true;
           }
        }
        return false;
    }
}

