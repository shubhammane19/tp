class TotalCount{

    public static int totalCount(int arr[], int k){

        int count = 0;
       
        for(int i=0; i<arr.length; i++){

            if(arr[i]%k == 0){

                count = count+arr[i]/k;
            }else{

                count = count+arr[i]/k+1;
            }
        }
        return count;
    }
    public static void main(String[] args){

        int arr[] = new int[]{5,8,10,13};
        int k = 3;

        int ret = totalCount(arr,k);
        System.out.println(ret);
    }
}