package com.gla.Library;
import com.gla.Library.Book;
import com.gla.Library.Members;
public class Transaction {
    public static void issueBook(Book b, Members m) {
        System.out.println("Book '" + b.title + "' issued to " + m.name);
    }

}
