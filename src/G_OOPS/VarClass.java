package G_OOPS;

public class VarClass {
    public static void main(String[] args) {
        String s = "Hello";
        Integer i = 99;

        var res = true? s : i; // here 'res 'has access to common methods of String and integer class

        int x = 1;

        var res2 = switch (x){
            case 1 -> i;
            default -> s;
        };
    }
}