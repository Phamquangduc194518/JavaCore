public class Bai26 {
    void tinhBai26(int n){
        int Sum =0;
        for(int i=1; i<n; i++){
            if(n%i==0){
                Sum =Sum + i;
            }
        }
        if (Sum == n){
            System.out.println(n + " la so hoan hao");
        }
        else {
            System.out.println(n + " khong la so hoan hao");
        }
    }
}
