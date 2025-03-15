package D_FlowControl;

import java.util.List;
import java.util.Map;

public class ForEachLoop {
    public static void main(String[] args) {
        Map<String,String> names = Map.of("Fred","Jones", "Sheila","Smith");
        for(String f : names.keySet()){
            System.out.println("Key: "+f);
        }
        for(String f : names.values()){
            System.out.println("Value: "+f);
        }
        System.out.println("------------------print index---------------------------------");

        List<String> stringList = List.of("Fred","Jones", "Sheila","Smith");
        int index = 0;
        for (String s : stringList){
            System.out.println((index++) + " : "+s);  //index is manged separately and not by the loop
        }

        System.out.println("-------------------test break--------------------------------");

        for (String s : stringList){
            if("Jones".equals(s))
                break;
            System.out.println(s);
        }

        System.out.println("----------------------test continue-----------------------------");

        for (String s : stringList){
            if("Jones".equals(s))
                continue;
            System.out.println(s);
        }



    }
}
