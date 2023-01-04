import static java.lang.Math.pow;

public class Bai13 {
    void tinhBai13(int x, int n){
        int Sum =0;
        int Fn =1;
        for(int i=1; i<= n; i++){
            Fn = (int) pow(x,(2*(i)));
            Sum = Sum+Fn;
        }
        System.out.println(Sum);
    }
}
