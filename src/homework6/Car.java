package homework6;

public class Car {
    private String name;


    private int Speed;
    private String Model;

    public Car() {
    }


    public void setSpeed(int Speed) {
        this.Speed = Speed;
    }

    public int getSpeed() {
        return Speed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setModel(String Model) {
        this.Model = Model;
    }

    public String getModel() {
        return Model;

    }

    public static void main(String[] args) {
        Car mercedes = new Car();
        mercedes.setSpeed(200);
        mercedes.setName("Mercedes");
        mercedes.setModel("Benz-GLS");

        System.out.println(mercedes.getName());
        System.out.println(mercedes.getSpeed());
        System.out.println(mercedes.getModel());
    }


}

