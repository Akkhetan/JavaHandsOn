package H_Generics;

// Generic interface with bounded type parameter
 interface MinMax<T extends Comparable<T>> {
    T min();
    T max();
}

// Implementation of the generic interface
class MyClass<T extends Comparable<T>> implements MinMax<T> {
    private final T[] values;

    public MyClass(T[] values) {
        this.values = values;
    }

    @Override
    public T min() {
        T minValue = values[0];
        for (T value : values) {
            if (value.compareTo(minValue) < 0) {
                minValue = value;
            }
        }
        return minValue;
    }

    @Override
    public T max() {
        T maxValue = values[0];
        for (T value : values) {
            if (value.compareTo(maxValue) > 0) {
                maxValue = value;
            }
        }
        return maxValue;
    }
}

public class GenInterface {
    public static void main(String[] args) {
        Integer[] intArray = {10, 5, 3, 20, 15};
        MyClass<Integer> intObj = new MyClass<>(intArray);
        System.out.println("Integer Min: " + intObj.min());
        System.out.println("Integer Max: " + intObj.max());

        Double[] doubleArray = {4.5, 2.1, 8.3, 1.9};
        MyClass<Double> doubleObj = new MyClass<>(doubleArray);
        System.out.println("Double Min: " + doubleObj.min());
        System.out.println("Double Max: " + doubleObj.max());
    }
}