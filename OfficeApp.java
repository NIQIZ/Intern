public class OfficeApp {
    public static void main(String[] args) {
        Office o = new Office("Shaw HQ", "1 Scotts Road, #13-00, Singapore 228208");

        System.out.println("Name: " + o.getName());
        System.out.println("Address: " + o.getAddress());
    }
}
