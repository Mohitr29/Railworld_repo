public class Address {
    private String State;
    private String street;
    private String city;
    private int pin;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity() {
        this.city = city;
    }

    public String getState() {
        return State;
    }

    public void setState(String state)
    {
        this.State = state;
    }

    public void setpin(int pin) {
        this.pin = pin;
    }

    public Address(String city, String state, String street, int pin) {
        this.street = street;
        this.city = city;
        this.State = state;
        this.pin = pin;
    }
}
