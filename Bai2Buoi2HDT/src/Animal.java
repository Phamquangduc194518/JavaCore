public  abstract class Animal {
    private  String name;
    private int age;
    private String food;
    private String hairColor;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    void printInfo(){
        System.out.println("name  is : " + name);
        System.out.println("age  is : " + age);
        System.out.println("food  is : " + food);
        System.out.println("hairColor  is : " + hairColor);

    }
   abstract void  call();
}
