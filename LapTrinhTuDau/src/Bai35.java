public class Bai35 {
    void tinhBai35(int n){
        int Fn =1;
        if(n==0){
            Fn =1;
        }
        while (n !=0){
           Fn =Fn * (n%10);
            n=n/10;
        }
        System.out.println(Fn);

    }
}
