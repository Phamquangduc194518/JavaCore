public class Bai3 {
    void tinhBai3(int n){
        int Sum=0;
        for(int i=1; i<= n; i++){
            Sum = Sum+ (1/i);
        }
        System.out.println(Sum);
    }
}
