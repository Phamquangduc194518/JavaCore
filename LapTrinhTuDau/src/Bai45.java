public class Bai45 {
    void tinhBai45(int n) {
        boolean Check = true;
        while (n !=0) {
            if ((n % 10) % 2 == 0)//neu (N%10) % 2 = 0, check = false và ket thuc vong lap
            {
                Check = false;
                break;
            }
            n=n/10;
        }
        if (Check == true) // neu check = true thì in ra
        {
            System.out.println("Duoc tao nen boi cac so le !");
        } else//nguoc lai in ra
        {
            System.out.println("Khong duoc tao nen boi cac so le!");

        }
    }
}
