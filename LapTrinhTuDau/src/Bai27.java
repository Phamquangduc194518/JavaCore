public class Bai27 {
    void tinhBai27(int n){
        int count  =0;
        for(int i=1; i<=n; i++){
            if(n%i==0){
                count = count+1;
            }
        }
        if (count ==2 ){
            System.out.println("n la so nguyen to");
        }else {
            System.out.println("n khong la so nguyen to");
        }
    }
}
