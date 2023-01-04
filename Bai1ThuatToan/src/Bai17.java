public class Bai17 {
    void tinhBai17(int n){
        int count =0;
        int Fn=1;
        for(int i=1; i<= n; i++){
            if(n%i ==0) {
//                System.out.print(i + " ");
                count = count + i;
                Fn = Fn*i;
            }
        }
        System.out.print(count + " ");
        System.out.println(Fn + " ");
    }
}
