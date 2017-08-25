package entity.driver_model;

public class Driver {
    private String name;
    private DriversLicense driversLicense;

    public void setName(String name) {
        this.name = name;
    }

    public void setDriversLicense(DriversLicense driversLicense) {
        this.driversLicense = driversLicense;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", driversLicense=" + driversLicense +
                '}';
    }
}
