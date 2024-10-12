package homework.lambda;

import java.util.function.*;

public class Dog {
    private int id;
    private String name;
    private int age;
    

    public Dog(int id, String name , int age){
        this.id = id;
        this.name = name;
        this.age = age;

    }

    public void setId(int id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public String createNamePlate(Function<Dog, String> creater){
        String namePlate = creater.apply(this);
        System.out.println("Dog: " + this.name + " create nameplate");
        System.out.println(namePlate);
        return "";
    }
}
