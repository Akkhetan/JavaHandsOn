package J_Stream.terminal;

import J_Stream.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public class Reduce {
    public static void main(String[] args) {

        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("The Fellowship of the Ring", 1954, "0395489318",300));
        bookList.add(new Book("The Two Towers", 1954, "0345339711",150));
        bookList.add(new Book("The Return of the King", 1955, "0618129111",500));

        reduceForSum(bookList);
        reduceForConcat(bookList);
        reduceWithInitialValue(bookList);
    }

    public static void reduceForSum(List<Book> bookList){
        System.out.println("Inside reduceForSum ");
        OptionalInt totalBookPrice = bookList.stream().mapToInt(Book::getPrice).reduce(Integer::sum);

        System.out.println("totalBookPrice :"+ totalBookPrice.getAsInt());
    }

    public static void reduceWithInitialValue(List<Book> bookList){
        System.out.println("Inside reduceWithInitialValue ");
        int totalBookPriceAddingOne = bookList.stream().mapToInt(Book::getPrice).reduce(1, Integer::sum);

        System.out.println("totalBookPriceAddingOne :"+ totalBookPriceAddingOne);
    }

    public static void reduceForConcat(List<Book> bookList){
        System.out.println("Inside reduceForConcat ");
        Optional<String> allBookNames = bookList.stream().map(Book::getName).reduce((a, b) -> a + " | " + b);

        System.out.println("allBookNames :"+ allBookNames.get());
    }
}
