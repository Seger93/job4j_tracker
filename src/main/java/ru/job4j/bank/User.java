package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс описывает Юзера.
 * Каждый Юзер будет иметь собственный паспорт и имя.
 */

public class User {
    /**
     * Поле содержащие данные паспорта
     */
    private String passport;
    /**
     * Поле содержащее имя
     */
    private String username;

    /**
     * Конструктор, который позволяет нам задать имя и паспорт каждому экземпляру класса
     *
     * @param passport имя паспорта необходимое задать Юзеру
     * @param username имя Юзера, которое ему необходимо задать
     */
    public User(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }

    /**
     * Метод возвращающий паспорт
     *
     * @return возвращает строковое представление номера паспорта для экземпляра класса
     */
    public String getPassport() {
        return passport;
    }

    /**
     * Метод позволяющий задать строковое представление паспорта
     *
     * @param passport паспорт, который задается Юзеру
     */
    public void setPassport(String passport) {
        this.passport = passport;
    }

    /**
     * Метод возвращающий имя Юзера
     *
     * @return возвращает имя для экземпляра класса
     */
    public String getUsername() {
        return username;
    }

    /**
     * Метод позволяющий задать имя Юзеру
     *
     * @param username имя, которое задается Юзеру
     */
    public void setUsername(String username) {
        this.username = username;
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
        User user = (User) o;
        return Objects.equals(passport, user.passport);
    }

    /**
     * Переопределяет метод hashCode
     *
     * @return возвращает hash code для ненулевого аргумента, возвращает 0 для нулевого аргумента
     */
    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }
}

