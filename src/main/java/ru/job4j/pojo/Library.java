package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Green book", 246);
        Book book2 = new Book("The sound and the fury", 325);
        Book book3 = new Book("Clean code", 440);
        Book book4 = new Book("CoderNet", 530);
        Book[] books = {book1, book2, book3, book4};

        for (Book book : books) {
            System.out.println("Title: " + book.getTitle() + ", " + book.getPages() + " pages");
        }
        Book bk = books[0];
        books[0] = books[3];
        books[3] = bk;
        for (Book book : books) {
            System.out.println("Title: " + book.getTitle() + ", " + book.getPages() + " pages");
        }
        System.out.println("Trying to find information about book \"Clean code\" ...");
        for (Book book : books) {
            if ("Clean code".equals(book.getTitle())) {
                System.out.println("Title: " + book.getTitle() + ", " + book.getPages() + " pages");
            }
        }
    }
}
