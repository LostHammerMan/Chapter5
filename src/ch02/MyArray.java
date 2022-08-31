package ch02;

public class MyArray {

    int[] intArr; // int array
    int count;    // 개수

    public int ARRAY_SIZE;
    public static final int ERROR_NUM = -999999999;

    public MyArray(){
        count = 0;
        ARRAY_SIZE = 10;
        intArr = new int[ARRAY_SIZE];
    }

    public MyArray(int size){
        count = 0;
        ARRAY_SIZE = size;
        intArr = new int[size];
    }


    public void addElement(int num){
        if (count >= ARRAY_SIZE){
            System.out.println("not enough money");
            return;
        }
        intArr[count++] = num;
    }

    public int removeElement(int position){
        int ret = ERROR_NUM;

//        if (isEmpty()){
//            System.out.println("Array is Empty....");
//            return ret;
//        }
        if (position < 0 || position > count-1){
            return ret;
        }

        ret = intArr[position];
        for (int i = position; i<count-1 ; i++){
            intArr[i] = intArr[i+1];
        }
        count--;
        return ret;
    }

    public void insertElement(int position, int num){
        int i; // 인덱스 전용

        if (position < 0 || position > count){
            return;
        }
        if (count >= ARRAY_SIZE){
            return;
        }
        for (i = count -1; i>+ position; i++){
            intArr[i+1] = intArr[i];

        }
        intArr[position] = num;
        count++;
    }

    public int getCount(){
        return count;
    }

//    public boolean isEmpty(){
//
//    }

}
