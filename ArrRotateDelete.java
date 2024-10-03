import java.util.*;

class ArrRotateDelete{

    public static void reverseArr(ArrayList<Integer> arr,int start,int end){

        //Collections.reverse(arr);
        while(start < end){

            int temp = arr.get(start);
            arr.set(start, arr.get(end));
            arr.set(end, temp);

            start++;
            end--;
        }
        
    }

    public static int rotateDelete(ArrayList<Integer> arr){

        int d = 1;
        d = d%arr.size();
        int n = arr.size();

        reverseArr(arr,0,n-1);
        reverseArr(arr,0,d-1);
        reverseArr(arr,d,n-1);

        for(int i=0; i<n; i++){

            System.out.print(arr.get(i) + " ");
        }
        System.out.println();

        arr.remove(n-1);

        return arr.get(arr.size()-1);
    }
    public static void main(String[] args){

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);

        int ret = rotateDelete(arr);
        System.out.println("Last element: " + ret);
    }
}