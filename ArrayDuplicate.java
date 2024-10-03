import java.util.*;

class ArrayDupe{

    public static void removedupe(int arr[]){

        ArrayList<Integer> A = new ArrayList<>();
        Arrays.sort(arr);
        boolean hasDupe = false;

        for(int i=1; i<arr.length; i++){

            if(arr[i] == arr[i-1]){

                if(A.size() == 0 || A.get(A.size()-1) != arr[i]){

                    A.add(arr[i]);
                    hasDupe = true;
                }
            }
        }

        if(!hasDupe){

            A.add(-1);
        }

        for(int x : A){

            System.out.print(x + " ");
        }
    }
    public static void main(String[] args){

        int arr[] = new int[]{2,3,1,2,3};

        removedupe(arr);
    }
 }