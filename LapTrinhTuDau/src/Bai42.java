public class Bai42 {
    void tinhBai42(int n){
        int min = n%10;
        if(n ==0){
            min =0;
        }
        while(n != 0)//Neu bien gan con khac 0 thuc hien vong lap
        {
           int i = n%10;//i = N chia lay du 10
            if (i<min)//Neu i<min thi gan gia tri cua min = i
            {
                min=i;
            }
            n = n / 10;//bien N chia 10
        }

        System.out.println(min);
    }
}
