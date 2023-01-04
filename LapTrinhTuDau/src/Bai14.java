import static java.lang.Math.pow;

public class Bai14 {
        void tinhBai14(int x, int n){
            int Sum =0;
            int Fn =1;
            for(int i=1; i<= n; i++){
                Fn = (int) pow(x,(2*i+1));
                Sum = Sum+Fn;
            }
            System.out.println(Sum);
        }
    }


