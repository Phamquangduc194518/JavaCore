public class Bai53 {
    void tinhBai53(int a, int b, int c){
        float x1; float x2;  float delta;
        delta = b*b -4*a*c;
        if(delta <0 ){
            System.out.println("phuong trinh vo nghiem");
        } else if (delta ==0) {
            x1 =x2  =  ((float)-b/2*a);
            System.out.println("phuong trinh co 1 nghiem");
        }else {

            System.out.println("phuong trinh co nghiem la");
        }
    }
}
