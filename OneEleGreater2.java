class OneEleGreater2{

    public static void main(String[] args){

        int arr[] = new int[]{2,5,1,4,8};
        int maxEle = arr[0];
        int N = 5;
        int count = 0;

       /* for(int i = 1; i<N; i++){
            if(arr[i] > maxEle){
                arr[i] = maxEle;
            }else{
                count++;
                break;
            }
        }*/
        for(int i =0; i<N; i++){

            if(arr[i]>maxEle){
                maxEle = arr[i];
            }
        }

        System.out.println(maxEle);

        for(int i = 0; i<N; i++){

            if(arr[i] == maxEle){

                break;
            }
                count++;
        }

        System.out.println(count);
    }
}