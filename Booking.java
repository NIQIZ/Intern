import java.time.LocalDateTime;

public class Booking {
    Employee owner;
    LocalDateTime startAt;
    LocalDateTime endAt;
}

public void print(){
    // if
    System.out.println("- " + startAt + " to " + endAt + "|" + owner);
}
