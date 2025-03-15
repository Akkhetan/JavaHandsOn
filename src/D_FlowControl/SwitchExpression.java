package D_FlowControl;

enum Suit{
    HEART,SPADE,DIAMOND,CLUB
}

public class SwitchExpression {
    public static void main(String[] args) {
        int x = 0;
        var result = switch(x){
            case 0 ->{
                System.out.println("Calculating for Zero");
                yield "Zero";   //for multiline need to return using 'yield' and not 'return'
            }
            case 1 -> "One";
            default -> throw new IllegalStateException("Unexpected value: " + x);
        };
        System.out.println("Result : "+ result);

        System.out.println("------------------'default' not needed as compiler knows range of values---------------------------------------------");

        Suit suit = Suit.HEART;
        switch(suit){
            case HEART -> System.out.println("Heart");
            case SPADE -> System.out.println("Spade");
            case DIAMOND -> System.out.println("Diamond");
            case CLUB -> System.out.println("Club");
        }

        System.out.println("---------------------------------------------------------");
        int y = 0;
        System.out.println(
                switch (y){
                    case 0 :
                        System.out.println("Zero");
                    case -1:
                       yield "Small negative";
                    case 1 :
                        yield "Small positive";
                    default: throw new RuntimeException();
                }
        );
    }
}
