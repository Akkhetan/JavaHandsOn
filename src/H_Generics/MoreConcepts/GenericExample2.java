package H_Generics.MoreConcepts;

class Box<E>{
    E value;

    private Box(){
        value = null;
    }

    private Box(E v){
        value = v;
    }

    public static <B, E extends B> Box<B> box(E e){
        return new Box<B>(e);
    }
}

public class GenericExample2 {
    public static void main(String[] args) {
        Box<CharSequence> bcs = Box.box("Hello");
        CharSequence value = bcs.value; // value is of type CharSequence
        System.out.println(bcs.value.getClass().getName());

    }
}