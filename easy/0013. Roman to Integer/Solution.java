import java.util.HashMap;
import java.util.Scanner;

class Solution{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a roman numeral: ");
        String s = sc.nextLine();
        int result = romanToInt(s);
        System.out.println(result);
    }

    public static int romanToInt(String s) {
        HashMap<Character, Integer> romanNumerals = new HashMap<>();
        romanNumerals.put('I', 1);
        romanNumerals.put('V', 5);
        romanNumerals.put('X', 10);
        romanNumerals.put('L', 50);
        romanNumerals.put('C', 100);
        romanNumerals.put('D', 500);
        romanNumerals.put('M', 1000);

        int num = 0;
        char prevChar = ' ';

        for (int i = 0; i < s.length(); i++){ 
            if (prevChar!=' ' && romanNumerals.get(s.charAt(i)) > romanNumerals.get(prevChar)){
                num += romanNumerals.get(s.charAt(i)) - 2*romanNumerals.get(prevChar);
            }else{
                num += romanNumerals.get(s.charAt(i));
            }
            prevChar = s.charAt(i);
        }

        return num;
    }
}

