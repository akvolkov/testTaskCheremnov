import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextParsing {
    public static void main(String[] args) {
        System.out.print("Input: ");
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String string = reader.readLine();
            if (string == null) {
                System.out.println("введите строку по шаблону: c:\\some_text.txt test");
                return;
            }
            String[] pathAndText = string.strip().split(" ");
            Path path = Paths.get(pathAndText[0]);
            String text = pathAndText[1];
            String readString = Files.readString(path);
            Pattern pattern = Pattern.compile(text);
            Matcher matcher = pattern.matcher(readString);
            int count = 0;
            while(matcher.find()) {
                count++;
            }
            System.out.println("Output: " + count);
        }
        //некорректный адрес файла
        catch (NoSuchFileException e) {
            System.out.println("введите строку по шаблону: c:\\some_text.txt test" + e.getMessage());
            e.printStackTrace();
        }
        //произошло какое-либо исключение ввода-вывода
        catch (IOException e) {
            e.printStackTrace();
        }
        //некорректный text для поиска
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("введите строку по шаблону: c:\\some_text.txt test" + e.getMessage());
            e.printStackTrace();
        }
    }
}
