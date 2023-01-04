public class Bai46 {
    void tinhBai46(int n) {
        boolean check = true;
        while (n != 0) {
            if((n%10) %2 ==0){
                check =true;
                break;
            }
            n=n/10;
        }
        if(check== true){
            System.out.println("n la cac so chan");
        }else {
            System.out.println("n la cac so le");
        }
    }
}
