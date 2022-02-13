package pro.sky;

public class Main {

    public static void main(String[] args) {

//task 1
        Author author1 = new Author("Иван", "Иванов");
        Author author2 = new Author("Степан", "Петров");
        Book book1 = new Book("Детство", author1, 1964);
        Book book2 = new Book("Моря и океаны", author2, 1996);

//task3 (частично)
        System.out.println("book1 = " + book1.getPublishingYear());

        book1.setPublishingYear(2022);
        System.out.println("book1 new edition = " + book1.getPublishingYear());

        //task2
        String[] library = new String[2];

        Author author3 = new Author("Павел", "Кузнецов");
        Author author4 = new Author("Сергей", "Сергеев");
        Book book3 = new Book("Код", author3, 1964);
        Book book4 = new Book("Не работает", author4, 1996);

        library[0] = book3.getBookName() + book3.getAuthorName() + book3.getPublishingYear();
        library[1] = book4.getBookName() + book4.getAuthorName() + book4.getPublishingYear();

        System.out.println("Книга 3 " + library[0].toString());
    }
}
