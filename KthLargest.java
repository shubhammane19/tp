import java.util.*;

class KthLargest{

    public static int findLarge(int arr[], int k){

        PriorityQueue<Integer> q = new PriorityQueue<>();
        //int large = Integer.MIN_VALUE;

        for(int i=0; i<k; i++){

            q.add(arr[i]);
        }

        for(int i=k; i<arr.length; i++){

            if(arr[i] > q.peek()){

                q.poll();
                q.add(arr[i]);
            }
        }
        int res = q.peek();

        return res;
        
    }
    public static void main(String[] args){

        int arr[] = new int[]{3,5,1,8,2};
        int k = 2;

        int ret = findLarge(arr,k);
        System.out.println(ret);
    }
}