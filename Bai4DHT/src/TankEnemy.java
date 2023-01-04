public class TankEnemy  extends  Tank{
    String ranger;
    @Override
    String getMove() {
        return "43km/h";
    }

    @Override
    String getShoot() {
        return "4v/p";
    }

    @Override
    String getTestgun() {
        return "tan xa 0.3";
    }
    public int killBase(){
        return 3;
    }

    @Override
    public String move() {
        return "bay thang";
    }

    @Override
    public String explosion() {
        return "no xuyen pha";
    }
}
