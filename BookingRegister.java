import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookingRegister {
    Map<Facility, List<Booking>> bookings;

    public BookingRegister() {
        bookings = new HashMap<>();
    }

    // doBooking method
    public Booking doBooking(Facility facility, LocalDateTime startAt, LocalDateTime endAt, Employee owner)
            throws BadBookingException {

        // INTERN CANNOT BOOK
        if (owner.getStatus() == Employee.EmploymentType.INTERN) {
            throw new BadBookingException("Intern not allowed");
        }

        // FACILITY BOOKING per PERIOD
        List<Booking> facilityBookings = bookings.get(facility);
        if (facilityBookings != null) {
            facilityBookings = new ArrayList<Booking>();
            bookings.put(facility, facilityBookings);
        }

        // If checked
        Booking booking = new Booking(owner, startAt, endAt);
        facilityBookings.add(booking);
        return booking;
    }

    public void print() {
        for (Facility facility : bookings.keySet()) {
            System.out.println(facility.getName() + ": ");
            List<Booking> facilityBookings = bookings.get(facility);
            for (Booking booking : facilityBookings) {
                booking.print();
            }
        }
    }
}
