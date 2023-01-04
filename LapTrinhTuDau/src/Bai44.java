public class Bai44
{
    void tinhBai44(int n)
    {
        int min;
        int count =0;
        int i ;
        min = n%10;
        while(n != 0)//Neu biên gan con khac 0 thuc hien vong lap
        {
            i = n%10;//i = N chia lay du 10
            if(i==min)
            {
                count=count+1;
            }
            if (i<min)//Neu i<min thi gan gia tri cua min = i
            {
                min=i;
            }
            n = n / 10;//bien N chia 10
        }
        System.out.println(count);
    }
}
