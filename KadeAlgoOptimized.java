class KadeAlgoOptimized{

    public static void main(String[] args){

        int arr[] = new int[]{-1,-2,-3,-4};

        int sum = arr[0];
        int maxSum = arr[0];

        for(int i=0; i<arr.length; i++){

            sum = Math.max(sum+arr[i], arr[i]);
            maxSum = Math.max(sum, maxSum);
        }

        System.out.println(maxSum);
    }
}