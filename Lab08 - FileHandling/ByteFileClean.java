import java.io.*;

public class ByteFileClean {

    public static void main(String[] args) {

        try {
            FileInputStream fin = new FileInputStream("input.txt");
            FileOutputStream fout = new FileOutputStream("output_byte.txt");

            int ch;
            while ((ch = fin.read()) != -1) {
                char c = (char) ch;

                if (Character.isLetterOrDigit(c) || Character.isWhitespace(c)) {
                    fout.write(c);
                }
            }

            fin.close();
            fout.close();

            System.out.println("File cleaned and written using Byte Stream.");

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}