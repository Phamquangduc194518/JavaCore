public class Bai21 {
    void tinhBai21(int n){
        int Sum =0;
        for(int i=1; i<=n; i++){
            if(n%i==0){
                if(i%2 !=0){
                 Sum = Sum +i;
                }
            }
        }
        System.out.println(Sum);
    }
}
