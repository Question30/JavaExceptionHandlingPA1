package ExceptionHandlingTryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            int result = num1 / num2;
            System.out.println(result);
        }catch (InputMismatchException e){
            System.out.println("java.util.InputMismatchException");
        }catch (ArithmeticException e){
            System.out.println(e);
        }

    }
}
