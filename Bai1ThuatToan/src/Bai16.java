public class Bai16 {
        void tinhBai16(int n){
            int count =0;
        for(int i=1; i<= n; i++){
            if(n%i ==0) {
                System.out.print(i + " ");
                count = count + i;
            }
    //        System.out.println(count + " ");
        }
        }
}
