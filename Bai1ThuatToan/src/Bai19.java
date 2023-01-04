public class Bai19 {
    void tinhBai19(int n){
        if(n<2){
            System.out.println("n khong phai la so nguyen to");
        }
        for (int i=2; i<n/2; i++) {
            if (n % i == 0) {
                System.out.println("n khong phai la so nguyen to");
            }else{
                System.out.println("n la so nguyen to");
            }
        }
    }

}
