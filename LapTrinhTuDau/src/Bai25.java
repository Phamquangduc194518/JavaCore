public class Bai25 {
    void tinhBai25(int n){
        int Sum = 0;
        int max =1;
        for(int i=1; i<n; i++ ){
            if(n%i ==0){
                if(i % 2 !=0) {
                    if (i > max) {
                        max = i;
                    }
                }
            }
        }
        System.out.println(max);
    }
}
