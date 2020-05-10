package Java;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
//     Sorted Array in Ascending Order:
        System.out.println("Enter size of Array:");
        int arraySize=scanner.nextInt();
        int array[]=new int[arraySize];
        System.out.println("Enter values of Array:");
        for(int  i=0 ;i<arraySize;i++){
            array[i]=scanner.nextInt();
        }
        System.out.println("Before Ascending Order:");
        for(int element:array){
            System.out.println(element);
        }

        for(int i=0;i<arraySize;i++){
            for(int j=0;j<arraySize-i-1;j++){
                if(array[j] > array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }

            }

        }
        System.out.println("After sorted list in ascending order:");
        for(int element:array){
            System.out.println(element);
        }
//    Sorted Array in Descending Order:
        for(int i=0;i<arraySize;i++){
            for(int j=0;j<arraySize-i-1;j++){
                if(array[j] < array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }

            }

        }
        System.out.println("After Sorted array in Descending Order:");
        for(int element:array){
            System.out.println(element);
        }


    }
}
