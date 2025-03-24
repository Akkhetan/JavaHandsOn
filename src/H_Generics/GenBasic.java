package H_Generics;

class Gen<T>{
    T obj;

    Gen(T t){
        obj = t;
    }

    T getObj(){
        return obj;
    }

    void showType(){
        System.out.println("Type of T is : " + obj.getClass().getName());
    }

}


public class GenBasic {
    public static void main(String[] args) {
        Gen<Integer> integerGen = new Gen<>(1);
        integerGen.showType();

        Gen<String> stringGen = new Gen<>("1");
        stringGen.showType();
    }
}