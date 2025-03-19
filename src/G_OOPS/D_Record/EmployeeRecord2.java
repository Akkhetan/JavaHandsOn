/*
# For a record, there are two general types of constructors that you can explicitly create: canonical and non-canonical, and there are some differences between the two.
# It is important to emphasize that for the canonical constructor, the types and parameter names must be the same as those specified by the record declaration.
# Furthermore, each component must be fully initialized upon completion of the constructor.
# The following restrictions also apply: the constructor must be at least as accessible as its record declaration Thus, if the access modifier for the record is public, the constructor must also be specified public.
# A constructor cannot be generic, and it cannot include a throws clause. It also cannot invoke another constructor defined for the record.
# A compact record constructor is declared by specifying the name of the record, but without parameters.
# The compact constructor implicitly has parameters that are the same as the record’s components,
#and its components are automatically assigned the values of the arguments passed to the constructor.
# Within the compact constructor you can, however, alter one or more of the arguments prior to their value being assigned to the record.
 */


package G_OOPS.D_Record;

public record EmployeeRecord2(String name, int idNum) {
    /* Canonical constructor
    public EmployeeRecord2(String name, int idNum) {
        this.name = name.trim();
        this.idNum = idNum;
    }
     */

    //compact Canonical constructor
    public EmployeeRecord2 {
        name = name.toUpperCase();
    }
}
