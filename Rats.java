import java.util.*;
class Rats{

    public static int solve(int r, int unit,int[]arr, int n){

        int sum = 0;
        int count = 0;
        int res = r*unit;

        if(arr == null){

            return -1;
        }

        for(int i=0; i<n; i++){

            count++;
            sum = sum + arr[i];
            if(sum>=res){

                break;
            }
        }

        if(sum < res){

            return 0;
        }

        return count;
    }
    public static void  main(String[] args){

        Scanner sc = new Scanner (System.in);
        int r = sc.nextInt ();
        int unit = sc.nextInt ();
        int n = sc.nextInt ();
        int arr[] = new int[n];
    
        for (int i = 0; i < n; i++)
          arr[i] = sc.nextInt ();
        System.out.println (solve (r, unit, arr, n));
    }
}