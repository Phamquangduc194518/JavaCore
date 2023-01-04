public class Bai11 {
    void tinhBai11(int n){
        int Fn =1;
        int Sum =0;
        for(int i=1; i<=n;i++){
            Fn = Fn *i;
            Sum = Sum + Fn;
        }
        System.out.println(Sum);
    }
}
