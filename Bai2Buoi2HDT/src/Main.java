public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.setName("Miuu");
        cat.setAge(10);
        cat.setFood("fish");
        cat.setHairColor("yellow");
        cat.printInfo();
        cat.call();
        cat.playWithHuman();
        cat.petisFriend(true);
        System.out.println("---------------------");

        Dog  dog = new Dog();
        dog.setName("Kiii");
        dog.setAge(10);
        dog.setFood("Rice");
        dog.setHairColor("Black");
        dog.printInfo();
        dog.call();
        dog.playWithHuman();
        dog.petisFriend(true);
        System.out.println("---------------------");

        Tiger tiger = new Tiger();
        tiger.setName("Chuuuu");
        tiger.setAge(10);
        tiger.setFood("meat");
        tiger.setHairColor("Black and yellow and red");
        tiger.printInfo();
        tiger.call();
        System.out.println("---------------------");

        Wolf wolf = new Wolf();
        tiger.setName("Moaaaaaa");
        tiger.setAge(10);
        tiger.setFood("meat");
        tiger.setHairColor("White and black ");
        tiger.printInfo();
        tiger.call();
        System.out.println("---------------------");

        DogRobot  dogRobot = new DogRobot();
        dogRobot.setMetal("Fe");
        dogRobot.power();
        dogRobot.playWithHuman();
        dogRobot.petisFriend(false);
        System.out.println("---------------------");
    }
}