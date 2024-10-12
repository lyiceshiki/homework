package homework.lambda;

import java.util.function.*;
import homework.item.Print;



public class Cat {
    private String name;
    private String sex;
    private int age;
    private String color;
    private String time;

    public Cat(String name, String sex, int age, String color){
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.color = color;
    }

    public void setName(String name){
        this.name =name;
    }

    public void setSex(String sex){
        this.sex = sex;
    }

    public void setAge(int age){
        this.age =age;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setTime(String time){
        this.time = time;
    }

    public String getName(){
        return this.name;
    }

    public String getSex(){
        return this.sex;
    }

    public int getAge(){
        return this.age;
    }

    public String getColor(){
        return this.color;
    }

    public String getTime(){
        return this.time;
    }

    public String createNamePlate(Function<Cat,String> creater){
        String namePlate = creater.apply(this);
        System.out.println("My Cat: " + this.name + " create nameplate");
        Print.printColored(namePlate, Print.BLUE);
        System.out.println("-----Meow's one day-----");
        return "";
    }

    public void breakTime(){
        Supplier<Integer> breakHour = () -> 6 + (int) (Math.random() * 4);//get a number from 6 to 9,Math.random means get a number >=0 and < 1. 
        int hour = breakHour.get();
        Print.printColored("Today " + this.name + " got up at " + hour + ":00.", Print.GREEN);
        Predicate<Integer> isLongerThan8 = (h) -> h > 8;
        Print.printColored("she is a lazy cat? " + isLongerThan8.test(hour) + ".", Print.GREEN);
    }

    public String eatBreakfast(Function<Cat, String> eat){
        String breakfast = eat.apply(this);
        System.out.println();
        System.out.println("-----breakfast time-----");
        Print.printColored(breakfast, Print.YELLOW);

        return "";
    }

    public void emotionGood(){
        Consumer<String> happy = (h) -> System.out.println(h);
        System.out.println();
        happy.accept("Meow is very happy!");
    }

    public void emotionBad(){
        Consumer<String> sad = (s) -> System.out.println(s);
        System.out.println();
        sad.accept("Meow is very sad!");
    }

    public String timeToSleep(Function<Cat,String> sleep){
        String sleepTime = sleep.apply(this);
        System.out.println("-----sleepTime-----");
        Print.printColored(sleepTime, Print.PURPLE);
        return "";
    }

    
    


     







}
