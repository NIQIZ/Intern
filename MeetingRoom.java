import java.util.ArrayList;
import java.util.List;

public class MeetingRoom implements Facility {
    String code;
    String name;

    public MeetingRoom(String code, String name){
        this.code = code;
        this.name = name;
    }

    public List getCode() {
        return code;
    }

    public void getName() {
        return name;
    }
}
