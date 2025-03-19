//Demonstrate private accessibility
package G_OOPS.A_Class_Defination;

import java.time.LocalDate;

public class BuildMe {
    private String name;
    private LocalDate date;

    private BuildMe(){}  //private constructor

    public static Builder builder(){
        return new Builder();  //able to access private constructor
    }

    public static class Builder{
        private BuildMe template = new BuildMe();   //able to access private constructor

        private Builder(){}

        public Builder name(String name){
            template.name = name;  //able to acces private variable 'template.name'
            return this;
        }

        public Builder date(LocalDate date){
            template.date = date; //able to acces private variable 'template.date'
            return this;
        }

        public BuildMe build(){
            BuildMe rv = template;
            template = null;  //don't modify later
            return rv;
        }
    }

    @Override
    public String toString() {
        return "BuildMe{" +
                "name='" + name + '\'' +
                ", date=" + date +
                '}';
    }
}

class TryBuilder{
    public static void main(String[] args) {
        BuildMe bm = BuildMe.builder()
                .name("Ank")
                .date(LocalDate.now())
                .build();
        System.out.println(bm);
    }
        }
