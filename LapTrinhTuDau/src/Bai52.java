public class Bai52 {
    void tinhBai52(float a, float b){
        float x;
        if(a==0){
            System.out.println("phuong trinh vo so nghiem");
        } else if (b==0) {
            System.out.println("phuong trinh vo nghiem");
        }else {
            x=-b/a;
            System.out.println("phuong trinh co nghiem la "+x);
        }
    }
}
