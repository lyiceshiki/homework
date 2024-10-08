package homework.transport.trans;

import homework.item.Print;

public class Ecar extends Car {
    
    private String name = new String();
    private String carColor = new String();
    
    

    public Ecar(){
        //System.out.println();
       super("Tesla","White");
       this.carColor = "Black";
       this.name = "Tesla2";
       //this.name = name;
    }

    
    
    
  

    @Override
    public void run() {
        //System.out.println(String.format("Car %s %s is running.",carColor, getName()));
        System.out.println(String.format("Car %s %s is running.", carColor ,this.name));

        Print.printColored(String.format("Car %s %s is running.",carColor, getName()), Print.BLUE);
    }

    public String getName(){
        return name;
    }

}
