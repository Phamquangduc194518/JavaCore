public class Bai39 {
    void tinhBai39(int n){

        int count=0;
        if(n==0){
            count=1;
        }
        while(n!=0){
            count = n%10;
         n=n/10;
        }
        System.out.println(count);
    }
}
