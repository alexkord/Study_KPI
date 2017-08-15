package ua.kpi.task_3;

public class Tour {
    private String direction;
    private boolean transfer;
    private boolean fligth;
    private boolean bookingHotel;
    private boolean insurance;

    public String getDirection() {
        return direction;
    }

    public boolean isTransfer() {
        return transfer;
    }

    public boolean isFligth() {
        return fligth;
    }

    public boolean isBookingHotel() {
        return bookingHotel;
    }

    public boolean isInsurance() {
        return insurance;
    }



    public static class Builder {

    }
}
