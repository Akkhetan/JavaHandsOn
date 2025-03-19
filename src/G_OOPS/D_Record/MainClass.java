package G_OOPS.D_Record;

public class MainClass {
    public static void main(String[] args) {
        EmployeeRecord1[] empList1 = new EmployeeRecord1[3];
        empList1[0] = new EmployeeRecord1("Ank", 1);
        empList1[1] = new EmployeeRecord1(" Ram", 2);
        empList1[2] = new EmployeeRecord1("Ank", 1);
        for(EmployeeRecord1 e : empList1){
            System.out.println(e.idNum() + " : " + e.name());
            System.out.println(e.toString());
        }
        System.out.println("empList1[0].equals(empList1[1])? "+empList1[0].equals(empList1[1]));
        System.out.println("empList1[0].equals(empList1[2])? "+empList1[0].equals(empList1[2]));

        System.out.println("empList1[0] : "+empList1[0].hashCode());
        System.out.println("empList1[1] : "+empList1[1].hashCode());
        System.out.println("empList1[2] : "+empList1[2].hashCode());

        System.out.println("----------------------Canonical Constructor Example------------------------------------------------");

        EmployeeRecord2[] empList2 = new EmployeeRecord2[2];
        empList2[0] = new EmployeeRecord2("Ank", 1);
        empList2[1] = new EmployeeRecord2("Ram",2);
        for(EmployeeRecord2 e : empList2){
            System.out.println(e.idNum() + " : " + e.name());
        }

        System.out.println("----------------------Non Canonical Constructor Example------------------------------------------------");

        EmployeeRecord3[] empList3 = new EmployeeRecord3[2];
        empList3[0] = new EmployeeRecord3("Ank", 1);  //Canonical Constructor is called
        empList3[1] = new EmployeeRecord3("Ram");  // Here id is not passed. Non-Canonical Constructor is called
        //empList3[2] = new EmployeeRecord3("Sam,,");  // This will throw exception : IllegalArgumentException: Multiple Commas found
        for(EmployeeRecord3 e : empList3){
            System.out.println(e.idNum() + " : " + e.name());
            System.out.println(e.toString());
        }


    }
}

