//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		    String s1 = "daxjheq";               //daxjheq
		    String s2 = "eqdaxjh";     //xcgv;   //eqdaxjh  //xjheqda
		    
		    Solution obj = new Solution();
		    
		    boolean flag = obj.isRotated(s1, s2);
		    
		    if(flag == true) System.out.println("1");
		    else System.out.println("0");
		    
	}
}
// } Driver Code Ends


class Solution
{
    //Function to check if a string can be obtained by rotating
    //another string by exactly 2 places.
    
    public static String rotateArrAntiClock(char[] A, int s, int n, int d){
        
        d = d%n;    
        
        reverseArr(A,0,d-1);
        reverseArr(A,d,n-1);
        reverseArr(A,0,n-1);
        
        StringBuilder sb = new StringBuilder();
        
        for(char c : A){

            sb.append(c);
        }
        
        String revString = sb.toString();

        System.out.println("Anti-clock: " + revString);
        
       return revString;
        
    }
    
    public static String rotateArrClock(char[] B, int s, int n, int d){
        
        d = d%n;    
        
        reverseArr(B,0,n-1);    //
        reverseArr(B,0,d-1);
        reverseArr(B,d,n-1);
        
        StringBuilder sb2 = new StringBuilder();
        
        for(char c : B){
            
            sb2.append(c);
        }
        
        String revString2 = sb2.toString();

        System.out.println("String Clock : " + revString2);
        
        return revString2;
        
    }
    
    public static void reverseArr(char A[], int s, int e){
        
        while(s<e){
            
            char temp = A[s];
            A[s] = A[e];
            A[e] = temp;
            
            s++;
            e--;
            
        }
    }
    
    public static boolean isRotated(String str1, String str2)
    {
        // Your code here
        int d = 2;
        char A[] = str1.toCharArray();
        char B[] = str1.toCharArray();
        
        String val1 = rotateArrAntiClock(A,0,A.length,d);
        String val2 = rotateArrClock(B,0,A.length,d);
        System.out.println(val2);
        
        if(val1.equals(str2) || val2.equals(str2)){
            

            return true;
        }
        
        return false;
    }
    
}