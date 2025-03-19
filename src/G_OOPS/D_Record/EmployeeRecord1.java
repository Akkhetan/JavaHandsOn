/*
# Compiler will automatically create  canonical constructor
# A key point about a record is that its data is held in private final fields and only getter methods are provided(including equal(), hashcode() and toString().
Thus, the data that a record holds is immutable.
# getter methods are also called component methods and are - public, name same as component, zero argument, return component type and declare no exception
# a record cannot inherit another class
# A record type cannot be extended. Thus, all record declarations are considered final.
#  it can implement one or more interfaces.
# Aside from the fields associated with a record’s components, any other fields must be static.
#Finally, a record can be generic.
 */


package G_OOPS.D_Record;

public record EmployeeRecord1(String name, int idNum) {
}
