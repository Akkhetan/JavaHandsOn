/*
# The key requirement is that any non-canonical constructor must first call another constructor in the record via this.
# The constructor invoked will often be the canonical constructor.
# Doing this ultimately ensures that all fields are assigned.
# Declaring a non-canonical constructor enables you to create special-case records.
#  record can define as many different constructors as its needs, as long as all adhere to the rules defined for record.
# Because a record is used to aggregate data, a common use of a record constructor is to verify the validity or applicability of an argument.
For example, before constructing the record, the constructor may need to determine if a value is out of range, in an improper format, or otherwise unsuitable for use.
If an invalid condition is found, the constructor could create a default or error instance.
However, often it would be better for the constructor to throw an exception. This way, the user of the record would immediately be aware of the error and could take steps to correct it.
 */



package G_OOPS.D_Record;

public record EmployeeRecord3(String name, int idNum) {
    static int pendingID = -1;

    //compact Canonical constructor
    public EmployeeRecord3 {
        name = name.toUpperCase();

        int i = name.indexOf(",");
        int j = name.lastIndexOf(",");
        if(i!=j)
            throw new IllegalArgumentException("Multiple Commas found");
    }

    //Non-Canonical Constructor
    public EmployeeRecord3(String name){
        this(name,pendingID);

    }

}
