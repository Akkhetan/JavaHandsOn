package J_Stream.terminal;

import J_Stream.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FindAndMatch {
    public static void main(String[] args) {

        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("The Fellowship of the Ring", 1954, "0395489318"));
        bookList.add(new Book("The Two Towers", 1954, "0345339711"));
        bookList.add(new Book("The Return of the King", 1955, "0618129111"));

        testFindFirst(bookList);
        testFindAny(bookList);
        testAnyMatch(bookList);
        testAllMatch(bookList);
        testNoneMatch(bookList);
    }

    public static void testFindFirst(List<Book> bookList){
        System.out.println("Inside testFindFirst ");
        Optional<Book> firstBook =  bookList.stream()
                .filter(book ->book.getReleaseYear()==1954)
                .findFirst();

        System.out.println("first book = "+ firstBook.get());

    }

    public static void testFindAny(List<Book> bookList){
        System.out.println("Inside testFindAny ");
        Optional<Book> anyBook =  bookList.stream()
                .filter(book ->book.getReleaseYear()==1954)
                .findAny();

        System.out.println("any book = "+ anyBook.get());

    }

    public static void testAnyMatch(List<Book> bookList){
        System.out.println("Inside testAnyMatch ");
        boolean anyMatchBook =  bookList.stream()
                        .anyMatch(book ->book.getReleaseYear()==1954);

        System.out.println("anyMatchBook = "+ anyMatchBook);

    }

    public static void testAllMatch(List<Book> bookList){
        System.out.println("Inside testAllMatch ");
        boolean allMatchBook =  bookList.stream()
                .allMatch(book ->book.getReleaseYear()==1954);

        System.out.println("allMatchBook = "+ allMatchBook);

    }

    public static void testNoneMatch(List<Book> bookList){
        System.out.println("Inside testNoneMatch ");
        boolean noneMatchBook =  bookList.stream()
                .noneMatch(book ->book.getReleaseYear()==19547);

        bookList.stream()
                .noneMatch(book ->book.getReleaseYear()==19547);

        System.out.println("noneMatchBook = "+ noneMatchBook);

    }
}
