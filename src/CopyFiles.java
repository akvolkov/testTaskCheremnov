import java.io.*;

public class CopyFiles {
    public static void main(String[] args) throws IOException {
        long start = System.nanoTime();
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(new File(args[0]));
            os = new FileOutputStream(new File(args[1]));
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        } finally {
            is.close();
            os.close();
        }
        System.out.println(System.nanoTime() - start);

    }
}