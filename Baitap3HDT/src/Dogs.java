public abstract class Dogs extends Mammals {
    int scent;

    public Dogs(String species, String source, String colour, String name, int age, String s, String feature, String characteristic) {
        super(species, source, colour, name, age, feature, characteristic);
        this.scent = scent;
    }

    public void getInfoDog() {
        super.getInfo();
        System.out.println("Scent" + this.scent);
    }

    public abstract void call();

    public abstract void lock();

    public void compareto(Dogs dg){
        if(this.scent- dg.scent==0){
            System.out.println("danh hoi giong nhau");
        } else if (this.scent-dg.scent <0) {
            System.out.println("dog2 danh hoi hon dog1");
        }else {
            System.out.println("dog1 danh hoi hon dog2");
        }
    }
}
