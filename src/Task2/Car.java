package Task2;

public class Car  extends Vehicle {

    @Override
    public String description() {
        return "This is a car";
    }

    @Deprecated(since = "1.0", forRemoval = true)
    public void oldMethod() {
        super.oldMethod();
    }

    public void newMethod() {
        System.out.println("Something something new");
    }
}
