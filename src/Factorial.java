import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Factorial {

    public static void main(String[] args) throws IOException {
        boolean flag = true;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        while (flag) {
            System.out.print("input = ");
            String stringNumber = null;
            try {
                stringNumber = bufferedReader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (stringNumber.equals("exit")) {
                flag = false;
            }
            else {
                BigInteger factorial = BigInteger.valueOf(1);
                for (int i = 2; i <= Integer.parseInt(stringNumber); i++) {
                    factorial = factorial.multiply(BigInteger.valueOf(i));
                }
                System.out.println("factorial = " + factorial);
            }
        }
        bufferedReader.close();
    }
}
