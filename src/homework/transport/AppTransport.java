package homework.transport;

import homework.transport.trans.Car;
import homework.transport.trans.Ecar;

public class AppTransport {
    public static void main(String[] args) {
        /* 
        Car car1 = new Car();
        car1.setName( "Toyota");
        car1.run();

        Car car2 = new Car("Nissan");
        car2.run();

        car2.place("Sunshine Street");
        */

        Ecar ecar1 = new Ecar();
        ecar1.setName("Honda");
        ecar1.run();

        Ecar ecar2 = new Ecar();
        ecar2.run();

        Car c3 = new Ecar();
        c3.run();
        Ecar e1 = (Ecar)c3;
        e1.run();
        


        

    }
}
