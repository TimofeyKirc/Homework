package homework8;

public class Car {
    private int age;
    private double speed;
    private int weight;
    private String color;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Car() {
        this.age = 13;
        this.speed = 250;
        this.weight = 1300;
        this.color = "black";
    }
    public Car(int age){
        this.age = age;
        this.speed = 280;
        this.weight = 1100;
        this.color = "yellow";
    }
    public Car(int age, double speed){
        this.age = age;
        this.speed = speed;
        this.weight = 1050;
        this.color = "orange";
    }
    public Car(int age, double speed, int weight){
        this.age = age;
        this.speed = speed;
        this.weight = weight;
        this.color = "white";
    }
    public Car(int age, double speed, int weight, String color) {
        this.age = age;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }

    public static void main(String[] args) {
        Car carbmw = new Car();
        Car carmercedes = new Car(15);
        Car carvolkswagen = new Car(7, 215);
        Car carhonda = new Car(8, 240, 1455);
        Car carlamborghini = new Car (3, 330, 1030, "green");
        System.out.println("Age: " + carbmw.getAge() + "; speed: " + carbmw.getSpeed() + "; weight: " + carbmw.getWeight() + "; color:" + carbmw.getColor());
        System.out.println("Age: " + carmercedes.getAge() + "; speed: " + carmercedes.getSpeed() + "; weight: " + carmercedes.getWeight() + "; color:" + carmercedes.getColor());
        System.out.println("Age: " + carvolkswagen.getAge() + "; speed: " + carvolkswagen.getSpeed() + "; weight: " + carvolkswagen.getWeight() + "; color:" + carvolkswagen.getColor());
        System.out.println("Age: " + carhonda.getAge() + "; speed: " + carhonda.getSpeed() + "; weight: " + carhonda.getWeight() + "; color:" + carhonda.getColor());
        System.out.println("Age: " + carlamborghini.getAge() + "; speed: " + carlamborghini.getSpeed() + "; weight: " + carlamborghini.getWeight() + "; color:" + carlamborghini.getColor());
    }
}


