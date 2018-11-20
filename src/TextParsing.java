import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextParsing {
    public static void main(String[] args) throws IOException {
        System.out.print("Input: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] pathAndText = reader.readLine().strip().split(" ");

        Path path = Paths.get(pathAndText[0]);
        String text = pathAndText[1];

        String input = Files.readString(path);
        Pattern pattern = Pattern.compile(text + "(\\w*)");
        Matcher matcher = pattern.matcher(input);
        int count = 0;
        while(matcher.find()) {
            count++;
        }

//        System.out.println(input);
        System.out.println("Output: " + count);
    }
}
