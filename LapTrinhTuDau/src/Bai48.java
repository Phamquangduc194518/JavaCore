public class Bai48 {
    void tinhBai48(int n) {
        boolean check = true;
        int chuSoCuoi = n%10;
        while(n!=0){
            int chuSoKeCuoi = n%10;
            if(chuSoCuoi<chuSoKeCuoi){
                check = false;
                break;
            }else {
                chuSoCuoi=chuSoKeCuoi;
            }
            n=n/10;

        }if(check==true){
            System.out.println("dung");
        }else {

            System.out.println("sai");
        }
    }
}
