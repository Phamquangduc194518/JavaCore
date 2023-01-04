import static java.lang.Math.pow;

public class Bai15 {
    void tinhBai15(int n){
        for(int i=1; i<= n; i++){
            if(n%i ==0){
                System.out.println(i + " ");
            }
        }
    }
}
