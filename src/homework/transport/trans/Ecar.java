package homework.transport.trans;

public class Ecar extends Car {
    
    private String name = new String();
    
    public Ecar(){
        //System.out.println();
       super("Tesla");
       this.name = "Tesla2";
    }

    
    
    
  

    @Override
    public void run() {
        System.out.println(String.format("Car %s is running.", getName()));
        System.out.println(String.format("Car %s is running.", this.name));
    }

}
