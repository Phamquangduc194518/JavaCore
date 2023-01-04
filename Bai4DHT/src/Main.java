import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        TankAlli tankAlli1 = new TankAlli();
        tankAlli1.ammo = "5mm";
        tankAlli1.killer = "3";
        tankAlli1.getMove();
        tankAlli1.explosion();
        tankAlli1.speed = "30km/h";
        tankAlli1.getShoot();
        tankAlli1.getTestgun();
        tankAlli1.defBase();
        System.out.println(tankAlli1.move());

    }
}