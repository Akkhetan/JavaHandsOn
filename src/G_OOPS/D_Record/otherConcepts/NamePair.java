package G_OOPS.D_Record.otherConcepts;

//implements interface
// Component list is mutable (StringBuilder) although RECORD is intended to be immutable
public record NamePair(StringBuilder first, StringBuilder test) implements FirstName,LastName {

    // Need to implement all the methods of interface. method 'first()' is automatically implemented based on record definition as 'first' is passed as part of component
    @Override
    public StringBuilder last() {
        return null;
    }

}
