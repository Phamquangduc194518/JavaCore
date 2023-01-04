public class Bai34 {
        void tinhBai34(int n){
            int count =0;

            if(n==0){
                count =1;
            }
            while (n !=0){
                count =count+n%10;
                n=n/10;

            }
            System.out.println(count);

        }
}
