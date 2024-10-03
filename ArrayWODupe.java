import java.util.*;

class ArrayWODupe{

    public static void removedupe(int arr[]){

        Arrays.sort(arr);
        int j=1;
        //arr[j] = arr[0];
        for(int i=1; i<arr.length; i++){

            if(arr[i] != arr[i-1]){

                arr[j] = arr[i];
                j++;
            }
        }

        for(int i=0; i<j; i++){

            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args){

        int arr[] = new int[]{2,3,1,2,3};
        removedupe(arr);
    }
}