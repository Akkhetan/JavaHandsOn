package I_Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Employee2 {
    int id;
    String name;
    double salary;

    public Employee2(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Ensuring uniqueness using equals() and hashCode()
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee2 employee = (Employee2) obj;
        return id == employee.id; // Unique based on ID
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Employee2{id=" + id + ", name='" + name + "', salary=" + salary + '}';
    }
}

public class HashSetDemo {
    public static void main(String[] args) {
        //  Creating HashSet of Employees
        Set<Employee2> employeeSet = new HashSet<>();
        employeeSet.add(new Employee2(101, "Alice", 75000));
        employeeSet.add(new Employee2(102, "Bob", 65000));
        employeeSet.add(new Employee2(103, "Charlie", 80000));
        employeeSet.add(new Employee2(101, "Alice", 90000)); // Duplicate ID, won't be added

        System.out.println("HashSet of Employees (Unique by ID):");
        employeeSet.forEach(System.out::println);

        //  Removing Employees with Salary < 70,000
        employeeSet.removeIf(emp -> emp.salary < 70000);
        System.out.println("\nAfter removing employees with salary < 70,000:");
        employeeSet.forEach(System.out::println);

        //  Converting Set to List using Streams
        System.out.println("\nConverting HashSet to List:");
        var employeeList = new ArrayList<>(employeeSet);
        System.out.println(employeeList);
    }
}