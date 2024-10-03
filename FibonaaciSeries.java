class FibonaaciSeries{

    public static void fiboseries(int N){

        int b=1;
        int a =0;

        for(int i=0; i<N; i++){

            System.out.print(a + " ");

            int c = a+b;
            a = b;
            b = c;
        }
    }
    public static void main(String[] args){

        int N = 10;

        fiboseries(N);
    }
}