public class Bai6 {
    void tinhBai6(int n){
        float Sum=0;
        for(int  i=1; i<=n; i++){
            Sum = Sum + (float) 1/(i*(i+1));
        }
        System.out.println(Sum);
    }
}
