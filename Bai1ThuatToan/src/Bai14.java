public class Bai14 {
    void tinhBai14(int x, int n){
        int Fn=1;
        int Sum =0;
        for(int i = 1; i<=n;i++){
            Fn = Fn *(x*x);
            Sum = Sum+ Fn*x;
        }
        System.out.println(Sum);
    }
}
