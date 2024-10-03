class KadenAlgo{

    public static void main(String[] args){

        int arr[] = new int[]{1,2,3,-2,5};
        int sum =0;
        int maxSum = 0;

        for(int i=0; i<arr.length; i++){

            sum = sum +arr[i];

            if(sum > maxSum){

                maxSum = sum;
            }

            if(sum < 0){

                sum = 0;
            }
        }

        System.out.println(maxSum);

        /*for(int i=1;i<arr.length; i++){
        
        sum = Math.max(arr[i], sum+arr[i]);
        
        maxSum = Math.max(sum,maxSum);
        
    }
     return maxSum;
    } */
    }
}