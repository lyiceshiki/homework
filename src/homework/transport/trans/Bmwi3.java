package homework.transport.trans;

public class Bmwi3 extends Ecar{
    String color;
    public Bmwi3 (String name, String color){
        super();
        this.color = color;
    }

    @Override
    public void run(){
        
        System.out.println(String.format("%s %s is running.", color, getName()));
    }

}
