import java.util.*;

class Leapyear{
    static boolean isLeapYear(int year){

        if(year %4 == 0){

            if(year % 100 == 0){

                if(year %400 == 0){

                    return true;
                }
            }else{

                return true;
            }
        }else{

            return false;
        }
        return false;
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        boolean ret = isLeapYear(year);

        if(ret == true){

            System.out.println(year + " is a leap year");
        }else{

            System.out.println(year + " is not a leap year");
        }
    }
}