public class Bai18 {
    void tinhBai18(int n){
        int Fn =1;
        for(int i=1; i<= n; i++){
            if(n%i ==0){
                Fn = Fn *i;
            }
        }
        System.out.println(Fn);
    }
}
