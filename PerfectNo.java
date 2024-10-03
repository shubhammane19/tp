class PerfectNo{

    public static boolean isPerfectNo(int num){

        if(num == 1){

            return false;
        }

        long sum = 1;

        for(int i =2; i*i < num; i++){

            if(num % i == 0){

                sum = sum + i;
            }
        }

        if(num % sum == 0 && sum != 0){

            return true;
        }

        return false;
    }
    public static void main(String[] args){

        int num = 24;

        boolean ret = isPerfectNo(num);
        System.out.println(ret);
    }
}