public class Bai49 {
    void tinhBai49(int n){
        boolean check  = true;
        int soCuoi = n%10;

        while (n!=0){
            int sokeCuoi = n%10;
            if(soCuoi>sokeCuoi){
                check = false;
                break;
            }else {
                soCuoi=sokeCuoi;
            }
            n=n/10;
        }if (check==true){
            System.out.println("dung");

        }else {
            System.out.println("sai");
        }
    }
}
