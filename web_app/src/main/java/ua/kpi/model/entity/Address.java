package ua.kpi.model.entity;

public class Address {
    private String index, numberOfBuilding, apartmentNumber;
    private String city, street;

    public Address(String index, String numberOfBuilding, String apartmentNumber, String city, String street) {
        this.index = index;
        this.numberOfBuilding = numberOfBuilding;
        this.apartmentNumber = apartmentNumber;
        this.city = city;
        this.street = street;
    }

    public Address getAddress() {
        return this;
    }

    @Override
    public String toString() {
        return "Address{" +
                "index=" + index +
                ", numberOfBuilding=" + numberOfBuilding +
                ", apartmentNumber=" + apartmentNumber +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}
