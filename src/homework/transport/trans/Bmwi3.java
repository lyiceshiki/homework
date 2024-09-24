package homework.transport.trans;

import homework.item.Print;

public class Bmwi3 extends Ecar{
    String color;
    public Bmwi3 (String name, String color){
        super();
        this.color = color;
    }

    @Override
    public void run(){
        
        //System.out.println(String.format("%s %s is running.", color, getName()));
        Print.printColored(String.format("%s %s is running.", color, getName()), Print.GREEN);
    }

}
