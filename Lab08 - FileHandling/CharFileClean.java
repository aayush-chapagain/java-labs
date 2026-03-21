import java.io.*;

public class CharFileClean {

    public static void main(String[] args) {

        try {
            FileReader fr = new FileReader("input.txt");
            FileWriter fw = new FileWriter("output_char.txt");

            int ch;

            while ((ch = fr.read()) != -1) {
                char c = (char) ch;

                if (Character.isLetterOrDigit(c) || Character.isWhitespace(c)) {
                    fw.write(c);
                }
            }

            fr.close();
            fw.close();

            System.out.println("File cleaned and written using Character Stream.");

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}