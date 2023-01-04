public class Bai12 {
    void tinhBai12(int x, int n){
        int Fn =1;
        int Sum =0;
        for(int i=1; i<= n; i++){
            Fn =Fn *x;
            Sum = Sum +Fn;
        }
        System.out.println(Sum);
    }
}
