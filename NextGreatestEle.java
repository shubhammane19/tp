import java.util.*;

class NextGreatestEle{

    public static void main(String[] args){

        int arr[] = new int[]{4,5,2,25};
        int n = arr.length;

        int res[] = new int[n];
        Stack<Integer> s = new Stack<>();

        for(int i=n-1; i>=0; i--){

            if(!s.isEmpty() && s.peek() < arr[i]){

                s.pop();
            }

            if(!s.isEmpty()){

                res[i] = s.peek();
            }else{

                res[i] = -1;
            }
            s.push(arr[i]);
        }

        for(int i=0; i<n; i++){

            System.out.print(res[i] + " ");
        }
    }
}