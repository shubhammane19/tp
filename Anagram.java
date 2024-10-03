import java.util.Arrays;

class Anagram {
    
    public static boolean isAnagram(String a, String b){

        //int n = a.length();
        //int m = b.length();
        
        char A[] = a.toCharArray();
        char B[] = b.toCharArray();

        Arrays.sort(A);
        Arrays.sort(B);

        return Arrays.equals(A, B);
    }
    public static void main(String[] args){

        String a = "geeksforgeeks";
        String b = "forgeeksgeeks";

        boolean val = isAnagram(a,b);

        System.out.println(val);
    }
}
