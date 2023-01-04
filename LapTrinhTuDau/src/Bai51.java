public class Bai51 {
    void tinhBai51(int a, int b){
        int temp;
        int kq = 0;
        if(a>b){
            temp=a;
        }else {
            temp=b;
        }
        for(int i=temp; i<=a*b;i++){
            if(i%a ==0 && i%b==0){
                kq =i;
                break;
            }
        }
        System.out.println(kq);
    }
}
