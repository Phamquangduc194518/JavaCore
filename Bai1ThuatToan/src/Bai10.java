public class Bai10 {
    void tinhBai10(int x, int n){
        int Fn=1;
        for(int i=1; i<=n; i++){
            Fn = Fn * x;
        }
        System.out.println(Fn);
    }
}
