public class Bai21 {
    void tinhBai21(int a, int b){
        int Fn = 1;
        for(int i = 1; i <= a && i <= b; i++){
            if(a % i == 0 && b % i ==0){
                Fn = i;
            }
        }
        System.out.println(Fn);
    }
}
