class SelectionSort2{

    public static void main(String[] args){

        int arr[] = new int[]{64,25,12,22,11};

        int n = arr.length; 

        for(int i=0; i<n-1; i++){

            int minIdx = i;

            for(int j=i+1; j<n; j++){

                if(arr[j] <arr[minIdx]){

                    minIdx = j;
                }
            }

            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }

        for(int i=0; i<n; i++){

            System.out.print(arr[i] + " ");
        }
    }
}