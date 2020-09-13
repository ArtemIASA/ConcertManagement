package visitor;

final public class Visitor {
    final public String name;
    private String phoneNumber;


    public Visitor(String name, String phoneNumber) {
        this.name = name;
        validatePhoneNumber(phoneNumber);
        this.phoneNumber = phoneNumber;
    }

    private static void validatePhoneNumber(String phoneNumber){
        String regex = "\\d{3}-\\d{3}-\\d{4}";
        if (!phoneNumber.matches(regex))
            throw new IllegalArgumentException("Number must match pattern: ddd-ddd-dddd: " + phoneNumber);
    }

    public void setPhoneNumber(String phoneNumber){
        validatePhoneNumber(phoneNumber);
        this.phoneNumber = phoneNumber;
    }
}