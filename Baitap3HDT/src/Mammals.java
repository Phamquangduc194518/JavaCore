public abstract class Mammals {
    String species;
    String source;
    String colour;
    String name;
    int age;
    String feature;
    String characteristic;

    public Mammals(String species, String source, String colour, String name, int age, String feature, String characteristic) {
        this.species = species;
        this.source = source;
        this.colour = colour;
        this.name = name;
        this.age = age;
        this.feature = feature;
        this.characteristic = characteristic;
    }
    public void setAge(int age) {
        if (age > 0 && age <= 20) {
            this.age = age;
        }
    }

    public void getInfo() {
        System.out.println("Species:" + this.species);
        System.out.println("Source:" + this.source);
        System.out.println("Colour:" + this.colour);
        System.out.println("Name:" + this.name);
        System.out.println("Age:" + this.age);
        System.out.println("Feature:" + this.feature);
        System.out.println("Characteristic:" + this.characteristic);
    }


}
