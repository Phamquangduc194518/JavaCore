public abstract class Cats extends  Mammals{
    String seetoDark;

    public Cats(String species, String source, String colour, String name, int age, String feature, String characteristic) {
        super(species, source, colour, name, age, feature, characteristic);
        this.seetoDark = seetoDark;
    }

    public void getInfoCat() {
        super.getInfo();
        System.out.println("Seetodark" + seetoDark);
    }

    public abstract int hunter();

    public void hunterMaus(Cats o){
        if(this.hunter() == o.hunter()){
            System.out.println("kha nang bat chuot nhu nhau");
        } else if (this.hunter() < o.hunter()) {
            System.out.println("cats1 bat chuot kem hon cats 2");
        }else {
            System.out.println("cats1 bat chuot tot hon cats 2");
        }
    }

}
