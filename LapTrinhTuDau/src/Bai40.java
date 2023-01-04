public class Bai40 {
    void tinhBai40(int n){
        int count=0;
        if(n==0){
            count=1;
        }
        while(n!=0){
            count = count *10 +n%10;
            n=n/10;
        }
        System.out.println(count);
    }
}
