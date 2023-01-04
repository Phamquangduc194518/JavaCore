public class Bai61 {
    void tinhBai61(int n){
        int hangDonVi = n%10;
        int hangChuc = (n/10)%10;
        int hangTram = n/100;
        switch (hangTram){
            case 1:
                System.out.print("tram");
                break;
            case 2:
                System.out.print(" hai tram");
                break;
            case 3:
                System.out.print(" ba tram");
                break;
            case 4:
                System.out.print(" bon tram");
                break;
            case 5:
                System.out.print(" nam tram");
                break;
            case 6:
                System.out.print(" sau tram");
                break;
            case 7:
                System.out.print(" bay tram");
                break;
            case 8:
                System.out.print(" tam tram");
                break;
            case 9:
                System.out.print(" chin tram");
                break;
        }
        if(hangChuc ==0 && hangDonVi !=0){
            System.out.print(" le");
        }
        switch (hangChuc){
            case 1:
                System.out.print("muoi");
                break;
            case 2:
                System.out.print(" hai muoi");
                break;
            case 3:
                System.out.print(" ba muoi");
                break;
            case 4:
                System.out.print(" bon muoi");
                break;
            case 5:
                System.out.print(" nam muoi");
                break;
            case 6:
                System.out.print(" sau muoi");
                break;
            case 7:
                System.out.print(" bay muoi");
                break;
            case 8:
                System.out.print(" tam muoi");
                break;
            case 9:
                System.out.print(" chin muoi");
                break;

        }
        switch (hangDonVi) {
            case 1:
                System.out.println("mot");
                break;
            case 2:
                System.out.println(" hai ");
                break;
            case 3:
                System.out.println(" ba ");
                break;
            case 4:
                System.out.println(" bon ");
                break;
            case 5:
                System.out.println(" nam ");
                break;
            case 6:
                System.out.println(" sau ");
                break;
            case 7:
                System.out.println(" bay ");
                break;
            case 8:
                System.out.println(" tam ");
                break;
            case 9:
                System.out.println(" chin ");
                break;
        }
    }
}
