package homework6;

public class Home {
    private String material;


    private int floors;
    private int quantityOfWindows;

    public Home() {
    }


    public void setFloors(int floors) {
        this.floors = floors;
    }

    public int getFloors() {
        return floors;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setQuantityOfWindows(int quantityOfWindows) {
        this.quantityOfWindows = quantityOfWindows;
    }

    public int getQuantityOfWindows() {
        return quantityOfWindows;
    }


    public static void main(String[] args) {
        Home home = new Home();
        home.setFloors(2);
        home.setMaterial("Wood");
        home.setQuantityOfWindows(8);

        System.out.println(home.getMaterial());
        System.out.println(home.getFloors());
        System.out.println(home.getQuantityOfWindows());
    }


}

