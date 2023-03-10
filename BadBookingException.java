public class BadBookingException extends Exception {
    String reason;

    public BadBookingException(String reason) {
        this.reason = reason;
    }

    public String getReason() {
        return reason;
    }
}
