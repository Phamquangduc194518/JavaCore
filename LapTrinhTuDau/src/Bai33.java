public class Bai33 {
    void tinhBai33(int n){
        int count =0;
        if(n==0){
            count =1;
        }
        while (n !=0){
            count =count+1;
            n=n/10;
        }
        System.out.println(count);

    }
}
