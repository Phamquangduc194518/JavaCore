public class Bai15 {
    void tinhBai15(int n){
        int Fn = 1;
        for(int i=1; i <= n; i++){
            Fn = Fn *i;
        }
        System.out.println(Fn);
    }
}
