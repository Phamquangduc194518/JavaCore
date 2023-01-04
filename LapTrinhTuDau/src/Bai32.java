public class Bai32 {
    void tinhBai32(int n){
        int Sum =0;
        int i =0;
        while (Sum + i < n-1){
            i++;
            Sum =Sum+i;
        }
        System.out.println(i);
    }
}
