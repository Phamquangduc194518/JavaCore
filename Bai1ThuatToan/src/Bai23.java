public class Bai23 {
    void tinhBai23(double a, double b){
        double x =1;
        if (a == 0) {
            if (b == 0) {
                System.out.println("phuong trinh co vo so nghiem");
            } else {
                System.out.println("phuong trinh vo nghiem.");
            }
        } else {
           x =  -b / a;
            System.out.println("Phương trình có nghiệm x = " + x);
        }
    }
}
