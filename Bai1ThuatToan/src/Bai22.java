public class Bai22 {
    void tinhBai22(int a, int b){
        int Fn = 1;
        int bcnn = 1;
        for(int i = 1; i <= a && i <= b; i++){
            if(a % i == 0 && b % i ==0){
                Fn = i;
                bcnn = (a*b)/i;
            }
        }
        System.out.println(bcnn);
    }
}
