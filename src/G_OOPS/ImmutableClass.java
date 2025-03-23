package G_OOPS;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public final class ImmutableClass { //using final prevent inheritance
    private final String name; //Immutable
    private final int id;  //primitive
    private final List<String> courses; //Mutable
    private final ArrayList<StringBuilder>  hobbies; //Used array list inorder to use clone() method in the getter

    public ImmutableClass(String name, int id, List<String> courses, List<StringBuilder> hobbies) {
        this.name = name;
        this.id = id;
        this.courses = List.copyOf(courses); // copyOf will NOT duplicate a List.of, but will do so for an ArrayList or other regular mutable  list
        // this.hobbies = List.copyOf(hobbies); this will modify the object if content is modified the caller so need to perform deep copy
        this.hobbies = (ArrayList<StringBuilder>) hobbies.stream().map(StringBuilder::new).collect(Collectors.toList());  //deep copy
    }

    public List<String> getCourses() {
        return courses;  //returns immutable list
    }

    public ArrayList<StringBuilder> getHobbies() {
        return (ArrayList<StringBuilder>) hobbies.clone();
    }

    public static void main(String[] args) {
        List<String> courseList1 = new ArrayList<>();  //create a mutable list
        courseList1.add("Physics");
        courseList1.add("Maths");
        //courseList1.add(null); this will cause null pointer exception when calling constructor
        List<StringBuilder> hobbies1 = new ArrayList<>();  //create a mutable list
        hobbies1.add(new StringBuilder("Meditation"));
        hobbies1.add(new StringBuilder("Yoga"));

        ImmutableClass obj1 = new ImmutableClass("Ank", 1, courseList1, hobbies1);
        System.out.println("Before modifying callers list1 & hobbies1: " + obj1);
        courseList1.add("Chemistry");
        hobbies1.set(1,new StringBuilder("Trekking"));
        System.out.println("After modifying callers list1 & hobbies1: " + obj1);

        List<String> courseList2 = List.of("Hindi","English"); //create a immutable list
        List<StringBuilder> hobbies2 = List.of(new StringBuilder("Jogging"), new StringBuilder("Music"));
        ImmutableClass obj2 = new ImmutableClass("Sant", 2, courseList2, hobbies2);
        List<StringBuilder> obj2Hobbies = obj2.getHobbies();

        System.out.println("Before modifying callers hobbies2 : " + obj2);
       // courseList2.add("Chemistry"); this operation is not allowed
        //hobbies2.set(1,new StringBuilder("Cycling")); this operation is not allowed
        hobbies2.get(1).append(" & Cycling");
        obj2Hobbies.set(1,new StringBuilder("Dancing"));
        obj2Hobbies.remove(0);
        System.out.println("After modifying callers hobbies2 : " + obj2);

    }

    @Override
    public String toString() {
        return "ImmutableClass{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", courses=" + courses +
                ", hobbies=" + hobbies +
                '}';
    }
}