public class Bai37 {
    void tinhBai37(int n){
        int Sum =0;

        while (n!=0){
            if(n%2!=0){ // gan so le
                Sum =Sum+n%10;// bien tang len %10
            }
            n=n/10; // bien chia cho 10

        }
        System.out.println(Sum);
    }
}
