package ExceptionHandling;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        MyCalculator calculator = new MyCalculator();

        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()){
            int num1 = scan.nextInt();
            int num2 = scan.nextInt();

            try {
                System.out.println(calculator.power(num1, num2));
            }catch (Exception e){
                System.out.println(e.toString());
            }
        }
    }
}
