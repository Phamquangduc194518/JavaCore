public class Bai7 {
    void tinhBai7(int n){
        float Sum =0;
        for(int i=0; i<=n; i++){
            Sum = Sum +(float)(i/(i+1));
        }
        System.out.println(Sum);
    }
}
