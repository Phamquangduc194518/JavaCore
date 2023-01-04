public class DogRobot implements Play{
    boolean check =true;
    private String metal;

    public String getMetal() {
        return metal;
    }

    public void setMetal(String metal) {
        this.metal = metal;
    }

    void power(){
        System.out.println("dang sac");
    }

    @Override
    public boolean petisFriend(boolean check) {
        if(check == true){
            System.out.println("dog robot is friend of human");
        }else {
            System.out.println("dog robot is not friend");
        }
        return check;
    }

    @Override
    public void playWithHuman() {
        System.out.println("sleep");
    }
}
