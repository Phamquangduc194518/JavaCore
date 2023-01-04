import java.util.Random;

public class MrgInt {
    private int array[];

    public void init(){
        array = new int[100];
        Random rd = new Random();
        for(int i =0; i<array.length ; i++){
            int value = rd.nextInt(198)+2;
            array[i]= value;
        }
        for(int i =0; i<array.length ; i++){
            System.out.println(array[i]);
        }
    }

    public void sum(){
        int sumValue =0;
        for(int i =0; i<array.length ; i++){
            sumValue +=array[i] ;
        }
        System.out.println(sumValue);
    }

    public void sum3(){
        int sumValue =0;
        for(int i =0; i<array.length ; i++){
            if(array[i]%2==1)
            sumValue +=array[i] ;
        }
        System.out.println(sumValue);
    }

    public void sum4(){ // so nguyen to

    }

    public void min(){
        int minx =array[0];
        for(int i =0; i<array.length ; i++){
            System.out.println(array[i]);
            if(minx>array[i]){
                minx =array[i];
                System.out.println(minx);
            }
        }
    }

    public void ascending(){
        int value = array[0];
        for (int i = 0 ; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    value = array[j];
                    array[j] = array[i];
                    array[i] = value;
                }
            }
        }
    }
}
