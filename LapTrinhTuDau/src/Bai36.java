public class Bai36 {
    void tinhBai36(int n){
        int count =0;
        if(n==0){
            count =1;
        }
        while (n!=0)
        {
            if (n % 2 == 0) {
                count = count+1;
            }
            n = n / 10;
        }
        System.out.println(count);
    }
}
