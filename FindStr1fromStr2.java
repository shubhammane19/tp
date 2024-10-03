import java.util.*;

class FormStr1fromStr2{

    public static boolean findString(String str1, String str2){

        char arr1[] = str1.toCharArray();
        char arr2[] = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1,arr2);
    }
    public static void main(String[] args){

        String str1 = "shubham";
        String str2 = "amushbh";

        boolean ret = findString(str1, str2);

        System.out.println(ret);
    }
}