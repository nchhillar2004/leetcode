import java.util.Scanner;
import java.util.LinkedHashMap;
import java.util.Map;

// Question source: https://www.hackerrank.com/challenges/java-output-formatting/problem?isFullScreen=true
// using LinkedHashMap to sort and print all the key-values in sequence unlike HashMap
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> myHashMap = new LinkedHashMap<>();

        for (int i = 1; i <=3; i++){
            String s = sc.next();
            int n = sc.nextInt();
            String num = "";
            if (n < 10){
                num = "00" + String.valueOf(n);
            }else if (n<100 && n>=10){
                num = "0" + String.valueOf(n);
            }else{
                num = String.valueOf(n);
            }
            myHashMap.put(s, num);
        }
        
        System.out.println("================================");
        for (Map.Entry<String, String> entry : myHashMap.entrySet()){
            System.out.printf("%-14s %s \n", entry.getKey(), entry.getValue());
        }
        System.out.println("================================");
    }
}
