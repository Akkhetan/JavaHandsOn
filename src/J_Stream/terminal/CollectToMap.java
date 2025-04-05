package J_Stream.terminal;

import J_Stream.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class CollectToMap {
    public static void main(String[] args) {
        // Collector<T, ?, Map<K,U>> toMap(Function<? super T, ? extends K> keyMapper,Function<? super T, ? extends U> valueMapper)

        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("The Fellowship of the Ring", 1954, "0395489318"));
        bookList.add(new Book("The Two Towers", 1954, "0345339711"));
        bookList.add(new Book("The Return of the King", 1955, "0618129111"));

        System.out.println("\n" + "******Create list of an attribute values from object list******");
        List<String> collect = bookList.stream().map(Book::getName).toList();
        for(String entry : collect){
            System.out.println(entry);
        }

        System.out.println("\n" + "******Create a map from a List******");
        Map<String, Book> collect1 = bookList.stream().collect(Collectors.toMap(Book::getIsbn, c->c));
        for(Map.Entry<String,Book> entry : collect1.entrySet()){
            System.out.println(entry);
        }

        System.out.println("\n" + "******Create a map by avoiding key collison from a List****** ");
        Map<Integer, String> collect2 = bookList.stream().collect(Collectors.toMap(Book::getReleaseYear, Book::getName,
                (existing, replacement) -> existing));
        for(Map.Entry<Integer,String> entry : collect2.entrySet()){
            System.out.println(entry);
        }

        Map<String, Book> collect3 = bookList.stream().collect(Collectors.toMap(Book::getIsbn, c->c,(o1, o2) -> o1, TreeMap::new));
        System.out.println("\n");
        for(Map.Entry<String,Book> entry : collect3.entrySet()){
            System.out.println(entry);
        }
    }
}
