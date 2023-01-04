public class Bai43 {
    void tinhbai43(int n){
        int count =1;
         int max =0;
         while (n!=0){
             int i=n%10;
             if(i==max){
                 count=count+1;
             }if (i>max){
                 max = i;
             }
             n=n/10;
         }
        System.out.println(count);
    }
}
