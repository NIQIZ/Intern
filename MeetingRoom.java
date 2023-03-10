public class MeetingRoom implements Facility {
    String code;
    String name;

    public MeetingRoom(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public void print() {
        System.out.println(getCode() + ": " + getName());
    }
}
