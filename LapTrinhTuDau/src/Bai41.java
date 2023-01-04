public class Bai41 {
    void tinhBai41(int n){
        int count=0;
        int max =1;
        if(n==0){
            count=1;
        }
        while(n!=0){
           int i =n%10;
           if(i>max){
               max =i;
           }
            n=n/10;

        }
        System.out.println(max);
    }
}
