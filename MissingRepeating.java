class MissingRepeating{

    public static void main(String[] args){

        int arr[] = new int[]{2,2};

        int result[] = new int[2];

        for(int i=0; i<arr.length; i++){

            int index = Math.abs(arr[i]) -1;

            if(arr[index] < 0){

                result[0] = Math.abs(arr[i]);
            }else{

                arr[index] = -arr[index];
            }
        }

        for(int i=0; i<arr.length; i++){
            
            if(arr[i] > 0){

                result[1] = i+1;
                break;
            }
        }

        for(int i=0; i<result.length; i++){

            System.out.print(result[i] + " ");
        }
    }
}