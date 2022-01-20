package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book cleanCode = new Book("Clean code", 10);
        Book book1 = new Book("Algebra", 12);
        Book book2 = new Book("Mymy", 50);
        Book book3 = new Book("Hhildt", 80);
        Book[] books = new Book[4];
        books[0] = cleanCode;
        books[1] = book1;
        books[2] = book2;
        books[3] = book3;
        for (Book br : books) {
            System.out.println(br.getBook() + " - " + br.getPages());
        }
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (Book br : books) {
            System.out.println(br.getBook() + " - " + br.getPages());
        }
        for (Book br : books) {
            if ("Clean code".equals(br.getBook())) {
                System.out.println(br.getBook() + " - " + br.getPages());
            }
        }
    }
}
