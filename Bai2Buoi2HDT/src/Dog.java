public class Dog extends Animal implements Play{
    @Override
    void call() {
        System.out.println("gau gau");
    }

    @Override
    public boolean petisFriend(boolean check) {
        if(check == true){
            System.out.println("dog is friend of human");
        }else {
            System.out.println("dog is not friend");
        }
        return check;
    }

    @Override
    public void playWithHuman() {
        System.out.println("footBall");
    }
}
