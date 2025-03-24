package H_Generics.A_WildCard;

public class Stats<T extends Number> {
    T[] nums;
    double sum = 0;

    public Stats(T[] nums) {
        this.nums = nums;
    }

    public double calculateAvg() {
        for(T num : nums){
            sum = sum + num.doubleValue();
        }
    return sum/nums.length;
    }
//    public boolean sameAvg(Stats<?> ob) { //This approach only works if both Stats objects have the same type. For example, Stats<Integer> cannot compare with Stats<Double> or Stats<Short> due to type mismatch.
    public boolean sameAvg(Stats<?> ob) {
        if(this.calculateAvg() == ob.calculateAvg()){
            return true;
        }
        else {
            return false;
        }

    }
}