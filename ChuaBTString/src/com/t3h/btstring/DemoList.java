package com.t3h.btstring;

import java.util.ArrayList;
import java.util.List;

public class DemoList {
    private List<Integer> numbers;
    public DemoList(){
        numbers = new ArrayList<>();
    }

    /***
     * them phan tu vao cuoi danh sach
     * @param value
     */
    public void testAdd(Integer value){
        numbers.add(value);
    }

    /***
     * them phan tu value vao vi tri thu index
     * @param index
     * @param value
     */
    public void testAdd(int index, Integer value){
        numbers.add(index, value);
    }


    public void sortIncrease(){
        for ( int i = 0; i < numbers.size()-1; i++){
            for ( int j = i+1; j < numbers.size(); j++){
                int numberOne = numbers.get(i);
                int numberTwo = numbers.get(j);
                if ( numberOne > numberTwo){
                    numbers.set(i, numberTwo);
                    numbers.set(j, numberOne);
                }
            }
        }
    }

    public void printAllNumber(){
        System.out.println("numbers: "+ numbers.toString());
    }

}
