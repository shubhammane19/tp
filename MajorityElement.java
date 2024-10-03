class MajorityElement{

    public static int majorityEle(int[] arr, int N){

        int num = findCandidate(arr,N);

        if(isMajorityElement(arr,N,num)){

            return num;
        }else{

            return -1;
        }
    }

    public static int findCandidate(int[] arr, int N){

        int candidate = 0;
        int count = 0;

        for(int i : arr){

            if(count == 0){

                candidate = i;
                count = 1;
            }else if( i == candidate){

                count++;
            }else{

                count--;
            }
        }

        return candidate;
    }

    public static boolean isMajorityElement(int[] arr, int N, int num){

        int count = 0;

        for(int x : arr){

            if(x == num){

                count++;
            }
        }

        return count > N/2;
    }
    public static void main(String[] args){

        int arr[] = new int[]{3,1,3,3,2};
        int N = arr.length;

        int ret = majorityEle(arr,N);
        System.out.println(ret);
    }
}