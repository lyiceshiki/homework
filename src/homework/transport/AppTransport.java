package homework.transport;

import homework.transport.trans.Car;

public class AppTransport {
    public static void main(String[] args) {
        
        Car car1 = new Car();
        car1.setName( "Toyota");
        car1.run();

        Car car2 = new Car("Nissan");
        car2.run();

        car2.place("Sunshine Street");
        
    }
}
