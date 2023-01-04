public class Bai16 {
    void tinhBai16(int n){
        int Sum =0;
        for(int i=1; i<= n; i++){
            if(n%i ==0){
                Sum = Sum +i;
            }
        }
        System.out.println(Sum);
    }
}
