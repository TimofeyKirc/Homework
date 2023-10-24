package Homework6;

public class Human {
    private String name;


    private int age;
    private int SchoolNumber;
    public Human() {
    }


    public void setAge(int age ) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSchoolNumber(int SchoolNumber) {
        this.SchoolNumber = SchoolNumber;
    }

    public int getSchoolNumber() {
        return SchoolNumber;

    }
    public static void main(String[] args) {
        Human tymothy = new Human();
        tymothy.setAge(14);
        tymothy.setName("Tymothy");
        tymothy.setSchoolNumber(256);

        System.out.println(tymothy.getAge());
        System.out.println(tymothy.getName());
        System.out.println(tymothy.getSchoolNumber());
    }


}

