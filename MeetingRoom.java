import java.util.ArrayList;
import java.util.List;

public class MeetingRoom implements Facility {
    public void getCode() {
        List<Facility> fList = new ArrayList<Facility>();
        MeetingRoom myRoom = new MeetingRoom();
        fList.add(myRoom);
    }

    public void getName() {

    }
}
