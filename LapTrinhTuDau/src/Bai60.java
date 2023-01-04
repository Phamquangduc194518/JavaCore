public class Bai60 {
    void tinhBai60(int n){
        int hangchuc =n/10;
        int hangdonvi = n%10;
        switch (hangchuc){
            case 1:
                System.out.println("muoi");
                break;
            case 2:
                System.out.print(" hai muoi");
                break;
            case 3:
                System.out.print(" ba muoi");
                break;
            case 4:
                System.out.println(" bon muoi");
                break;
            case 5:
                System.out.println(" nam muoi");
                break;
            case 6:
                System.out.println(" sau muoi");
                break;
            case 7:
                System.out.println(" bay muoi");
                break;
            case 8:
                System.out.println(" tam muoi");
                break;
            case 9:
                System.out.println(" chin muoi");
                break;

        }
        switch (hangdonvi){
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
