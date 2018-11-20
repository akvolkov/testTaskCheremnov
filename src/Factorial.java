import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Factorial {

    public static void main(String[] args) {
        var flag = true;
        var factorial = BigInteger.valueOf(1);
        try(var bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            while (flag) {
                System.out.print("input = ");
                String stringNumber = bufferedReader.readLine();
                if (stringNumber.equals("exit")) {
                    flag = false;
                }
                else {
                    for (int i = 2; i <= Integer.parseInt(stringNumber); i++) {
                        factorial = factorial.multiply(BigInteger.valueOf(i));
                    }
                    System.out.println("factorial = " + factorial);
                }
                factorial = BigInteger.valueOf(1);
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
        catch (NumberFormatException e) {
            System.out.println("Input Error, " + e.getMessage());
            e.printStackTrace();
        }
    }
}
