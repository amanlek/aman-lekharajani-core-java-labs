package com.aman.lab4.ex3;
public class LibraryTest {

    public static void main(String[] args) {

        Book book =
                new Book(101,
                        "Java Programming",
                        5,
                        "James Gosling");

        JournalPaper journal =
                new JournalPaper(102,
                        "AI Research",
                        3,
                        "John Smith",
                        2024);

        Video video =
                new Video(103,
                        "Java Tutorial",
                        2,
                        120,
                        "Robert Martin",
                        "Education",
                        2023);

        CD cd =
                new CD(104,
                        "Greatest Hits",
                        4,
                        60,
                        "Arijit Singh",
                        "Music");

        book.print();
        journal.print();
        video.print();
        cd.print();

        System.out.println("\nChecking Out Book...");
        book.checkOut();
        book.print();

        System.out.println("\nChecking In Book...");
        book.checkIn();
        book.print();

        System.out.println("\nAdding Copies...");
        cd.addItem(5);
        cd.print();
    }
}