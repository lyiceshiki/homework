package homework.lambda;



public class LambdaCat {
    public static void main(String[] args) {
        Cat myCat = new Cat("Meow", "female", 3, "blue");
        myCat.createNamePlate(a -> "Name: " + a.getName() + " Sex: " + a.getSex() + " Age: " + a.getAge() + " Color: " + a.getColor() );

        myCat.breakTime();

        myCat.setTime("10:00 am");
        myCat.eatBreakfast(a -> a.getName() + "'s breakfast are Fish and milk at " + a.getTime() + ".");
        myCat.emotionGood();

        myCat.setTime("11:30 am");
        myCat.timeToSleep(a -> a.getName() + " sleep at " + a.getTime() + ".");

        
    }

    

}
