package pojo;

public class bookingdatesPojo {
    private String checkinBookingdates;
    private String checkoutBookingdates;
    public bookingdatesPojo(String checkinBookingdates, String checkoutBookingdates) {
        this.checkinBookingdates = checkinBookingdates;
        this.checkoutBookingdates = checkoutBookingdates;
    }
    public String getCheckinBookingdates() {
        return checkinBookingdates;
    }

    public void setCheckinBookingdates(String checkinBookingdates) {
        this.checkinBookingdates = checkinBookingdates;
    }

    public String getCheckoutBookingdates() {
        return checkoutBookingdates;
    }

    public void setCheckoutBookingdates(String checkoutBookingdates) {
        this.checkoutBookingdates = checkoutBookingdates;
    }
}
