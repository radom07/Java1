public class Car {
    public static int COUNTER = 0;

    private String brand;
    private int yearOfProduction;

    public Car() {
        this("Unknown", 2000);
    }

    public Car(String brand, int yearOfProduction) {
        this.brand = brand;
        this.yearOfProduction = yearOfProduction;
        COUNTER++;
    }

    public void showDifference() {
        String brand = "Audi";

        System.out.println("this.brand = " + this.brand);
        System.out.println("local brand = " + brand);
    }

    public void changeBrand(String brand) {
        this.brand = brand;
    }

    public void introduceYourself() {
        System.out.println("I am a car of brand " + brand + " from year " + yearOfProduction);
    }

    public static void classDescription() {
        System.out.println("This class represents cars.");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Car: Brand = ")
                .append(brand)
                .append(", Year of production = ")
                .append(yearOfProduction);
        return sb.toString();
    }
}
