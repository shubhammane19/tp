class MergeSort2{
    
    public static void conquer(int[] arr, int l,int m, int r){

        int idx1 = l;
        int idx2 = m+1;
        int x = 0;

        int[] mergedArr = new int[r-l+1];

        while(idx1 <= m && idx2 <= r){

            if(arr[idx1] <= arr[idx2]){

                mergedArr[x] = arr[idx1];
                x++;
                idx1++;

            }else{

                mergedArr[x] = arr[idx2];
                x++;
                idx2++;
            }
        }

        while(idx1 <= m){

            mergedArr[x] = arr[idx1];
            x++;
            idx1++;
        }

        while(idx2 <= r){

            mergedArr[x] = arr[idx2];
            x++;
            idx2++;
        }

        for(int i=0, j=l; i<mergedArr.length; i++,j++){

            arr[j] = mergedArr[i];
        }
    }
    public static void divide(int[] arr, int l, int r){

        if(l>=r){

            return;
        }

        int m = l+(r-l)/2;

        divide(arr,l,m);
        divide(arr,m+1,r);

        conquer(arr,l,m,r);
    }
    public static void main(String[] args){

        int arr[] = new int[]{6,4,9,2,1,5};
        int r = arr.length;

        divide(arr,0,r-1);

        for(int i=0; i<r; i++){

            System.out.print(arr[i] + " ");
        }
    }
}