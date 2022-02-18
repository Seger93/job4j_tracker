package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс описывает банковский аккаунт.
 * Каждый аккаунт будет иметь свои реквизиты и счет.
 */

public class Account {
    /**
     * Поле хранит в себе реквизиты аккаунта.
     */
    private String requisite;
    /**
     * Поле хранит в себе баланс аккаунта.
     */
    private double balance;

    /**
     * Конструктор класса который позволяет задать значения экземпляру при инициализации объекта этого класса.
     *
     * @param requisite Реквизиты которые необходимо задать.
     * @param balance   Баланс который необходимо задать.
     */

    public Account(String requisite, double balance) {
        this.requisite = requisite;
        this.balance = balance;
    }

    /**
     * Метод возвращающий реквизиты
     *
     * @return возвращает строковое представление реквизитов аккаунта
     */

    public String getRequisite() {
        return requisite;
    }

    /**
     * Метод позволяющий задать реквизиты аккаунту
     *
     * @param requisite номер реквизитов, которые необходимо задать аккаунту
     */

    public void setRequisite(String requisite) {
        this.requisite = requisite;
    }

    /**
     * Метод возвращающий баланс аккаунта
     *
     * @return возвращает число представляющее собой количество денег на балансе
     */

    public double getBalance() {
        return balance;
    }

    /**
     * Метод позволяющий задать баланс аккаунту
     *
     * @param balance число представляющее собой количество денег, которые необходимо задать балансу аккаунта
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Переопределяет метод equals
     *
     * @param o объект с которым будет сравниваться текущий объект
     * @return возвращает true, если аргументы равны, false, если аргументы не равны
     */

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Account account = (Account) o;
        return Objects.equals(requisite, account.requisite);
    }

    /**
     * Переопределяет метод hashCode
     *
     * @return возвращает hash code для ненулевого аргумента, возвращает 0 для нулевого аргумента
     */

    @Override
    public int hashCode() {
        return Objects.hash(requisite);
    }
}

