package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс описывает работу банковской системы.
 *
 * @author Sergei Gerbov
 * @version 1.0
 */
public class BankService {
    /**
     * Поле содержащее в себе коллекцию Map, в которой Юзер представляет собой ключ.
     * Список аккаунтов представляет собой Коллекцию типа List.
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод добавляет юзера.
     * Метод принимает на вход {@param user} и добавляет объект класса User, если его еще нет.
     */

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    /**
     * Метод добавляет {@link Account} для определенного юзера.
     * Метод принимает на вход {@param passport} по которому нужно добавить аккаунт,
     * а так же {@param account} в него будем добавлять юзера.
     * Юзер будет добавлен, если юзер существует и у него нет данного аккаунта.
     */

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accounts = users.get(user);
            if (!accounts.contains(account)) {
                accounts.add(account);
            }
        }
    }

    /**
     * Метод ищет юзера по паспорту.
     *
     * @param passport паспорт Юзера, которого необходимо найти
     * @return если данный юзер найден, то метод возвращает его, если данный пользователь не найден,
     * то метод возвращает null
     */

    public User findByPassport(String passport) {
        for (User key : users.keySet()) {
            if (key.getPassport().equals(passport)) {
                return key;
            }
        }
        return null;
    }

    /**
     * Метод ищет аккаунт по реквизитам.
     * Вначале находит юзера по паспорту, потом по паспорту находит аккаунт, если юзер существует.
     *
     * @param passport  паспорт юзера которого необходимо найти.
     * @param requisite реквизиты аккаунта который необходимо найти.
     * @return Вернет нам аккаунт юзера с паспортом и реквизитами если они есть.
     * Если нет юзера или аккаунта, то вернет null.
     */

    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accounts = users.get(user);
            for (Account acc : accounts) {
                if (acc.getRequisite().equals(requisite)) {
                    return acc;
                }
            }
        }
        return null;
    }

    /**
     * Метод позволяет перевести деньги с баланса одного аккаунта на другой.
     *
     * @param srcPassport   паспорт юзера который переводит.
     * @param srcRequisite  реквизиты аккаунта с которого юзер переводит.
     * @param destPassport  паспорт юзера кому будет переведены деньги.
     * @param destRequisite реквизиты аккаунта по которому будет принят перевод.
     * @param amount        сумма которую нужно списать с одного баланса на другой.
     * @return если перевод прошел успешно и балансы аккаунтом изменились, то вернет true, если
     * на балансе меньше чем сумма перевода или один из аккаунтов не существует, то вернет false.
     */

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        Account accountGive = findByRequisite(srcPassport, srcRequisite);
        Account accountGet = findByRequisite(destPassport, destRequisite);
        if (accountGet != null && accountGive != null && accountGive.getBalance() >= amount) {
            double balance1 = accountGive.getBalance();
            double balance2 = accountGet.getBalance();
            accountGet.setBalance(balance2 + amount);
            accountGive.setBalance(balance1 - amount);
            return true;
        }
        return false;
    }
}

