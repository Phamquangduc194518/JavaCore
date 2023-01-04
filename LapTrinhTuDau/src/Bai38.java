public class Bai38 {
    void tinhBai38(int n){
        int Fn =1;
        while(n!=0){
            if(n%2==0){
                Fn = Fn * (n%10);
            }
            n = n/10;
        }
        System.out.println(Fn);
    }
}
