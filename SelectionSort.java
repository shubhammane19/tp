class SelectionSort{

    public static void main(String[] args){

    int arr[] = new int[]{9,4,7,2,1,6};

    int n = arr.length;
    for(int i=0; i<n-1; i++){

        int min = i;

        for(int j= i+1; j<n; j++){

            if(arr[j] < arr[min]){

                min = j;
            }
        }

                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
    
            
        }
    

    for(int x=0; x<n; x++){

        System.out.print(arr[x]+ " ");
    }
}
}

    