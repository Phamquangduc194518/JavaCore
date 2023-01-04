public  class TankAlli extends Tank  {
        String killer;

    @Override
    String getMove() {
        return "33km/h";
    }

    @Override
    String getShoot() {
        return "3v/phut";
    }

    @Override
    String getTestgun() {
        return "nong sung on dinh";
    }

    public int defBase(){
        return 5;
    }

    @Override
    public String move() {
        return "bay vong cung";
    }

    @Override
    public String explosion() {
        return "no chong tank";
    }
}
