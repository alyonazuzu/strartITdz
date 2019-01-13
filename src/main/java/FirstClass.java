public class FirstClass {

    public FirstClass(String name) {
        this.name = name;
    }

    public FirstClass() {
        // silence
    }

    private String name;
    public static String staticVar = "I'm static variable";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
