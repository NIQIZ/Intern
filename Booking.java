import java.time.LocalDateTime;

public class Booking {
    Employee owner;
    LocalDateTime startAt;
    LocalDateTime endAt;

    public Booking(Employee owner, LocalDateTime startAt, LocalDateTime endAt) {
        this.owner = owner;
        this.startAt = startAt;
        this.endAt = endAt;
    }

    public void print() {
        System.out.println("- " + startAt + " to " + endAt + "|" + owner);
    }
}
