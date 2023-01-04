public class Bai22 {
    void tinhBai22(int n){
        int Fn=1;
        for(int i=1; i<=n; i++){
            if(n%i==0){
                if(i%2 ==0){
                    Fn = Fn *i;
                }
            }
        }
        System.out.println(Fn);
    }
}
