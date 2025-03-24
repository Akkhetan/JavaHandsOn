package H_Generics.A_WildCard;

public class StatsWildCardMain {
    public static void main(String[] args) {
        Integer intArray[] = {1,2,3};
        Stats<Integer> iOb = new Stats<>(intArray);
        System.out.println("Integer avg : " +  iOb.calculateAvg());


        Double doubleArray[] = {1.0,2.0,3.0};
        Stats<Double> dOb = new Stats<>(doubleArray);
        System.out.println("Double avg : " +  dOb.calculateAvg());

        if(iOb.sameAvg(dOb)){
            System.out.println("Same Avg");
        }
        else{
            System.out.println("Diff Avg");
        }

    }
}