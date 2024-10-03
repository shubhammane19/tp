class AddBinaryString{

    public static String addBinaryNo(String A, String B){

        if(A.equals("0") && B.equals("0"))
            return "0";

        int carry = 0;
        int n = A.length();
        int m = B.length();

        StringBuilder sb = new StringBuilder();

        while(n>0 || m> 0){

            int val1 = (n>0) ? A.charAt(n-1) - '0' : 0;
            int val2 = (m>0) ? B.charAt(m-1) - '0' : 0;

            int sum = val1 + val2 + carry;

            carry = sum/2;

            sb.append(sum % 2);

            m--;
            n--;
        }

        sb.reverse();

        while(sb.charAt(0) == '0')
            sb.deleteCharAt(0);

        return sb.toString();
    }
    public static void main(String[] args){

        String A = "0001";
        String B = "0101";

        String ret = addBinaryNo(A,B);

        System.out.println(ret);
    }
}