public class Bai55 {
    void tinhBai55(int a, int b, int c){
        int max =a;
       if(max <b) {
           b = max;
       } else if (max<c) {
           max=c;
       }
        System.out.println(max);
    }
}
