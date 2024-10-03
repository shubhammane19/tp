class ArmStrongNum{

    public static void main(String[] args){

        int n = 153;

        int temp1 = n;
        int temp2 = n;

        int count = 0;

        while(temp1 !=0){

            count++;
            temp1 = temp1/10;
        }

        int sum = 0;

        while(temp2 != 0){

            int rem = temp2%10;
            int mult = 1;
            int p= 1;

            while(p<= count){

                mult = mult*rem;
                p++;
            }

            sum = sum + mult;
            temp2 = temp2/10;
        }

        if(sum == n){

            System.out.println(sum + " is a ArmStrong Number");
        }else{

            System.out.println(sum + " is not a ArmStrong Number");
        }
    }
}