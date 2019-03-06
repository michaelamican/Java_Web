import java.util.ArrayList;

import jdk.nashorn.internal.runtime.Undefined;
public class Basics{
    //print 1 to x
    public void getInts(){   
        for(int i= 0; i < 256; i++){
            System.out.println(i);
        }
    }
    // print odd 1 to x; to print evens, i%2==0;
    public void getOdds(){   
        for (int i = 1; i <= 255; i++){
            if(i%2 == 1){
            System.out.println(i);
            }
        }
    };
    // //add all numbers from 1 to x;
    public void sumInts(int x){
        int sum = 0;
        for(int i = 1; i <= x; i++){
            sum += i;  
        }
        System.out.println(sum);
    };
    // // print all values within array
    public void printAll(int[] arr){   
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    };
    // //find max in array
    public void findMax(Integer[] arr){
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println(max);
    };
    // // find avg in array
    public void findAvg(Integer[] arr){
        int sum = 0;
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            sum +=  arr[i];
            count += 1;
        }
        double avg = sum/count;
        System.out.println(avg);
    };
    // //  create array of all odd numbers up to x
    public void oddArr(int x){
        ArrayList<Integer> anArray = new ArrayList<Integer>();
        for(int i = 1; i <= x; i++){
            if(i % 2 == 1){
                anArray.add(i);
            }
        }
    };
    // // Print new array of all items in arr over the value y
    public void overVal(int[] arr, int y){
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > y){
                myArray.add(arr[i]);
            }
        }
        System.out.println(myArray);
    };
    // // square all items in array
    public void squaredOff(int[] arr){
        for(int i = 0; i < arr.length; i++){
            arr[i] *= arr[i];
        }
        System.out.println(arr);
    }
    // // remove all negatives in array
    public void sliceEm(int[] arr){
        for(int i=0; i<arr.length; i++){
            if(arr[i] < 0){
                arr[i] = 0;
            }
        }
        System.out.println(arr);
    };
    // // find max min and average of array
    public void mainThree(int[] arr){ 
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        int max = arr[0];
        int min = arr[1];
        int count = 0;
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            count += 1;
            sum += arr[i];
            if(arr[i] < min){
                min = arr[i];
            };
            if(arr[i] > max){
                max = arr[i];
            }
        }
        int avg = sum/count;
        myArray.add(max);
        myArray.add(min);
        myArray.add(avg);
        System.out.println(myArray);
    };
    // //shift all items in array down by one index, end in 0.
    public void shiftDown(int[] arr){
        for(int i = 0; i < arr.length; i++){
            arr[i] = arr[i+1];
            if(arr[i+1] == arr.length){
                arr[i] = 0;
            }
        }
        System.out.println(arr);
    }
}
