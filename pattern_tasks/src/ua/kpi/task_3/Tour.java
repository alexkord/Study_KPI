package ua.kpi.task_3;

public class Tour {
    private String direction;
    private boolean hasTransferToAirport;
    private boolean hasTransferFromAirport;
    private boolean hasFligthThere;
    private boolean hasFligthBack;
    private boolean isBookingHotel;
    private boolean hasInsurance;

    public String getDirection() {
        return direction;
    }

    public boolean isHasTransferToAirport() {
        return hasTransferToAirport;
    }

    public boolean isHasTransferFromAirport() {
        return hasTransferFromAirport;
    }

    public boolean isHasFligthThere() {
        return hasFligthThere;
    }

    public boolean isHasFligthBack() {
        return hasFligthBack;
    }

    public boolean isBookingHotel() {
        return isBookingHotel;
    }

    public boolean isHasInsurance() {
        return hasInsurance;
    }

    private Tour(TourBuilder builder) {
        this.direction = builder.direction;
        this.hasTransferToAirport = builder.hasTransferToAirport;
        this.hasTransferFromAirport = builder.hasTransferFromAirport;
        this.hasFligthThere = builder.hasFligthThere;
        this.hasFligthBack = builder.hasFligthBack;
        this.isBookingHotel = builder.isBookingHotel;
        this.hasInsurance = builder.hasInsurance;
    }

    public static class TourBuilder {
        private String direction;
        private boolean hasTransferToAirport;
        private boolean hasTransferFromAirport;
        private boolean hasFligthThere;
        private boolean hasFligthBack;
        private boolean isBookingHotel;
        private boolean hasInsurance;

        public TourBuilder(String direction) {
            this.direction = direction;
        }

        public TourBuilder transferToAirport(boolean hasTransferToAirport) {
            this.hasTransferToAirport = hasTransferToAirport;
            return this;
        }

        public TourBuilder transferfromAirport(boolean hasTransferFromAirport) {
            this.hasTransferFromAirport = hasTransferFromAirport;
            return this;
        }

        public TourBuilder flightThere(boolean hasFligthThere) {
            this.hasFligthThere = hasFligthThere;
            return this;
        }

        public TourBuilder flightBack(boolean hasFligthBack) {
            this.hasFligthBack = hasFligthBack;
            return this;
        }

        public TourBuilder bookingHotel(boolean isBookingHotel) {
            this.isBookingHotel = isBookingHotel;
            return this;
        }

        public TourBuilder insurance(boolean hasInsurance) {
            this.hasInsurance = hasInsurance;
            return this;
        }

        Tour build() {
            return new Tour(this);
        }

    }

    @Override
    public String toString() {
        return "Tour{" +
                "direction='" + direction + '\'' +
                ", hasTransferToAirport=" + hasTransferToAirport +
                ", hasTransferFromAirport=" + hasTransferFromAirport +
                ", hasFligthThere=" + hasFligthThere +
                ", hasFligthBack=" + hasFligthBack +
                ", isBookingHotel=" + isBookingHotel +
                ", hasInsurance=" + hasInsurance +
                '}';
    }
}
