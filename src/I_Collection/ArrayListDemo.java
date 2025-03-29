package I_Collection;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

class Employee {
    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "', salary=" + salary + '}';
    }
}

public class ArrayListDemo {
    public static void main(String[] args) {
        // Creating an ArrayList with Custom Objects
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "Alice", 75000));
        employees.add(new Employee(102, "Bob", 65000));
        employees.add(new Employee(103, "Charlie", 80000));
        employees.add(new Employee(104, "David", 72000));

        System.out.println("Original Employee List:");
        employees.forEach(System.out::println);

        // Sorting using Comparator and Lambda (Sort by Salary)
        employees.sort(Comparator.comparingDouble(emp -> emp.salary));
        System.out.println("\nSorted by Salary (Ascending):");
        employees.forEach(System.out::println);

        // Filtering using Streams (Employees with salary > 70000)
        List<Employee> highSalaryEmployees = employees.stream()
                .filter(emp -> emp.salary > 70000)
                .collect(Collectors.toList());

        System.out.println("\nEmployees with salary > 70000:");
        highSalaryEmployees.forEach(System.out::println);

        // Transforming List to a Map (ID -> Name)
        Map<Integer, String> employeeMap = employees.stream()
                .collect(Collectors.toMap(emp -> emp.id, emp -> emp.name));

        System.out.println("\nEmployee Map (ID -> Name): " + employeeMap);

        // Using removeIf() to remove employees with salary < 70000
        employees.removeIf(emp -> emp.salary < 70000);
        System.out.println("\nAfter removing employees with salary < 70000:");
        employees.forEach(System.out::println);

        // Converting List to Set (Removing duplicates)
        Set<Employee> employeeSet = new HashSet<>(employees);
        System.out.println("\nConverted to Set (Unique Employees):");
        employeeSet.forEach(System.out::println);

        //  Handling Concurrent Modification
        ListIterator<Employee> listIterator = employees.listIterator();
        while(listIterator.hasNext()){
            if (listIterator.next().salary > 75000) {
                listIterator.remove();  // Safe removal
            }
        }
        System.out.println("\nAfter Safe Removal:");
        employees.forEach(System.out::println);

        // Converting List to an Array
        Employee[] employeeArray = employees.toArray(new Employee[0]);
        System.out.println("\nConverted to Array:");
        System.out.println(Arrays.toString(employeeArray));
    }
}