public class Bai47 {
    void tinhBai47(int n){
        int soNghichDao=0;
        while (n!=0){
            soNghichDao = soNghichDao *10 + n%10;
            n=n/10;
        }
        if (soNghichDao == n){
            System.out.println("dung");
        }else {
            System.out.println("sai");
        }
    }
}
