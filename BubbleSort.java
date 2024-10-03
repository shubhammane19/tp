class BubbleSort{

    public static void main(String[] args){

        int arr[] = new int[]{9,2,7,3,8,4,1,6};

        int n = arr.length;
        boolean swapped;

        for(int i=0; i< n-1; i++){
            swapped = false;
            for(int j= 0; j<n-i-1; j++){

                if(arr[j] > arr[j+1]){

                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
        }

        for(int i=0; i<n; i++){

            System.out.print(arr[i] + " ");
        }
    }
}