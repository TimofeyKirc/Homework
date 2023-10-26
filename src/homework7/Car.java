package homework7;

public class Car {
    private String DateOfIssue;
    private String Name;
    private String Model;
    private int Speed;
    private String Color;

    public Car() {
    }

    @Override
    public String toString() {
        return "Car{" +
                "DateOfIssue='" + DateOfIssue + '\'' +
                ", Name='" + Name + '\'' +
                ", Model='" + Model + '\'' +
                ", Speed=" + Speed +
                ", color='" + Color + '\'' +
                '}';
    }

    public String getDateOfIssue() {
        return DateOfIssue;
    }

    public void setDateOfIssue(String dateOfIssue) {
        DateOfIssue = dateOfIssue;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public int getSpeed() {
        return Speed;
    }

    public void setSpeed(int speed) {
        Speed = speed;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public Car(String dateOfIssue, String name, String model, int speed, String color) {
        DateOfIssue = dateOfIssue;
        Name = name;
        Model = model;
        Speed = speed;


    }

    public static void main(String[] args) {
        Car bmw = new Car();
        bmw.setName("BMW");
        bmw.setModel("X7");
        bmw.setDateOfIssue("March 2019");
        bmw.setSpeed(300);
        bmw.setColor("Yellow");
        System.out.println(bmw.getName());
        System.out.println(bmw.getModel());
        System.out.println(bmw.getDateOfIssue());
        System.out.println(bmw.getSpeed());
        System.out.println(bmw.getColor());
    }
}

