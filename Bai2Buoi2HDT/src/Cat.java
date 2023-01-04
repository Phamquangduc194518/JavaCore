public class Cat extends Animal implements Play{
    @Override
    void call() {
        System.out.println("meo meo");
    }

    @Override
    public boolean petisFriend(boolean check) {
        if(check == true){
            System.out.println("cat is friend of human");
        }else {
            System.out.println("cat is not friend");
        }
        return check;
    }

    @Override
    public void playWithHuman() {
        System.out.println("Hunter maus");
    }
}
