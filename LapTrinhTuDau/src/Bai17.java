public class Bai17 {
    void tinhBai17(int n){
        int Sum =0;
        for(int i=1; i<= n; i++){
            if(n%i ==0){
                Sum = Sum +1;
            }
        }
        System.out.println(Sum);
    }
}
