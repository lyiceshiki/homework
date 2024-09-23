package homework.transport.trans;

public class Car {

    public static String classname = Car.class.getSimpleName();
    private String name;
    private String carColor;

    public Car(){
        super();
    }

    public Car(String name, String carColor){
        this.name = name;
        this.carColor = carColor;
    }

    public void run(){
        System.out.println(this.carColor + " " + this.name + " is running.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void place(String street) {
        System.out.println(this.name + " is running at " + street);
    }
}
