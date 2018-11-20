import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String expression = reader.readLine();
        int index = 0;
        if (expression.contains("+")) {
            index = expression.indexOf("+");
            int a = Integer.parseInt(expression.substring(0, index));
            int b = Integer.parseInt(expression.substring(index + 1, expression.length()));
            System.out.println(a);
            System.out.println(b);
            System.out.println("Output: " + (a+b));
        }
        else {
            if (expression.contains("-")) {
                index = expression.indexOf("-");
                int a = Integer.parseInt(expression.substring(0, index));
                int b = Integer.parseInt(expression.substring(index + 1, expression.length()));
                System.out.println(a);
                System.out.println(b);
                System.out.println("Output: " + (a-b));
            }
            else {
                if (expression.contains("*")){
                    index = expression.indexOf("*");
                    int a = Integer.parseInt(expression.substring(0, index));
                    int b = Integer.parseInt(expression.substring(index + 1, expression.length()));
                    System.out.println("Output: " + (a*b));
                }
                else {
                    if (expression.contains("/")) {
                        index = expression.indexOf("/");
                        int a = Integer.parseInt(expression.substring(0, index));
                        int b = Integer.parseInt(expression.substring(index + 1, expression.length()));
                        System.out.println("Output: " + (a/b) + " ost - " + (a % b));

                    }
                    else {
                        System.out.println("выражение не содержит математических знаков: + - * /");
                    }
                }
            }
        }
    }
}
