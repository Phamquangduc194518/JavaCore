public class Bai50 {
    void tinhBai50(int a, int b){
        if(a==0 || b ==0){
            System.out.println("ucln la a"+a+b);
        }
        while(a!=b){
            if(a>b){
                a=a-b;
            }else {
                b=b-a;
            }

        }
        System.out.println("uoc chung lon nhat la " +a);
    }
}
