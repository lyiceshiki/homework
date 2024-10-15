package homework.lambda;



public class LambdaCat {
    public static void main(String[] args) {
        Cat myCat = new Cat("Meow", "female", 3, "blue");
        myCat.createNamePlate(a -> "Name: " + a.getName() + " Sex: " + a.getSex() + " Age: " + a.getAge() + " Color: " + a.getColor() );

        myCat.breakTime();

        myCat.setTime("10:00");
        myCat.eatBreakfast(a -> a.getName() + "'s breakfast are Fish and milk.\nBreakfast time is at " + a.getTime() + ".");
        myCat.emotionGood();

        myCat.setTime("11:30");
        myCat.timeToSleep(a -> a.getName() + " sleep at " + a.getTime() + ".");

        myCat.setTime("13:00");
        myCat.timeToPlay(a -> a.getName() + " is playing with " +a.getRandomItem() + " at " + a.getTime());

        myCat.setTime("13:30");
        myCat.eatLunch(a -> a.getName() + "'s lunch are cat food and chicken soup.\nLunch time is at " + a.getTime() + ".");

        myCat.setTime("14:00");
        myCat.timeToSleep(a -> a.getName() + " sleep at " + a.getTime() + ".");

        myCat.setTime("15:00");
        myCat.timeToPlay(a -> a.getName() + " is playing with " +a.getRandomItem() + " at " + a.getTime());

        myCat.setTime("16:00");
        myCat.timeToSleep(a -> a.getName() + " sleep at " + a.getTime() + ".");
        myCat.emotionBad();

        myCat.setTime("18:00");
        myCat.eatDinner(a -> a.getName() + "'s dinner are cat food and water.\nDinner time is at " + a.getTime() + ".");

        myCat.setTime("18:30");
        myCat.timeToPlay(a -> a.getName() + " is playing with " +a.getRandomItem() + " at " + a.getTime());

        myCat.setTime("20:00");
        myCat.timeToSnack(a -> a.getName() + " is eating " + a.getRandomTreat() + " at " + a.getTime());
        myCat.emotionGood();

        myCat.setTime("21:00");
        myCat.timeToSleep(a -> a.getName() + " sleep at " + a.getTime() + ".");

        myCat.setTime("00:00");
        myCat.timeToSnack(a -> a.getName() + " is eating " + a.getRandomTreat() + " at " + a.getTime());

        myCat.setTime("00:30");
        myCat.timeToPlay(a -> a.getName() + " is playing with " +a.getRandomItem() + " at " + a.getTime());

        myCat.setTime("02:00");
        myCat.timeToSleep(a -> a.getName() + " sleep at " + a.getTime() + ".");
        
    }

    

}
