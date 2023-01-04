public class Bai23 {
    void tinhBai23(int n){
        int Dem=0;
        for(int i=1; i<=n; i++){
            if(n%i==0){
                if(i%2 !=0){
                    Dem = Dem +1;
                }
            }
        }
        System.out.println(Dem);
    }
}
