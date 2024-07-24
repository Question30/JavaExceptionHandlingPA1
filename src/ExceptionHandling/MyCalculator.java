package ExceptionHandling;

public class MyCalculator {

    public long power(int num1, int num2) throws Exception{
        if(num1 == 0 && num2 == 0){
            throw new Exception("n and p should not be zero.");
        }else if(num1 < 0 || num2 < 0){
            throw new Exception("n or p should not be negative.");
        }

        return (long) Math.pow(num1, num2);
    }
}
