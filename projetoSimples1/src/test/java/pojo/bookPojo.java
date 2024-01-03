package pojo;

public class bookPojo {
    private String bookFirstname;
    private String bookLastname;
    private int bookTotalprice;
    private boolean bookDepositpaid;

    public bookPojo(String bookFirstname, String bookLastname, int bookTotalprice, boolean bookDepositpaid, bookingdatesPojo bookBookingdatesPojo, String bookAdditionalneeds) {
        this.bookFirstname = bookFirstname;
        this.bookLastname = bookLastname;
        this.bookTotalprice = bookTotalprice;
        this.bookDepositpaid = bookDepositpaid;
        this.bookBookingdatesPojo = bookBookingdatesPojo;
        this.bookAdditionalneeds = bookAdditionalneeds;
    }

    private bookingdatesPojo bookBookingdatesPojo;

    public String getBookFirstname() {
        return bookFirstname;
    }

    public void setBookFirstname(String bookFirstname) {
        this.bookFirstname = bookFirstname;
    }

    public String getBookLastname() {
        return bookLastname;
    }

    public void setBookLastname(String bookLastname) {
        this.bookLastname = bookLastname;
    }

    public int getBookTotalprice() {
        return bookTotalprice;
    }

    public void setBookTotalprice(int bookTotalprice) {
        this.bookTotalprice = bookTotalprice;
    }

    public boolean isBookDepositpaid() {
        return bookDepositpaid;
    }

    public void setBookDepositpaid(boolean bookDepositpaid) {
        this.bookDepositpaid = bookDepositpaid;
    }

    public bookingdatesPojo getBookBookingdatesPojo() {
        return bookBookingdatesPojo;
    }

    public void setBookBookingdatesPojo(bookingdatesPojo bookBookingdatesPojo) {
        this.bookBookingdatesPojo = bookBookingdatesPojo;
    }

    public String getBookAdditionalneeds() {
        return bookAdditionalneeds;
    }

    public void setBookAdditionalneeds(String bookAdditionalneeds) {
        this.bookAdditionalneeds = bookAdditionalneeds;
    }

    private String bookAdditionalneeds;
}
