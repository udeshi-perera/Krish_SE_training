import java.io.*;

public class CapitalizationAssignment {

    public static void main(String args[]) throws IOException {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        FileWriter fileWriter = null;
        PrintWriter printWriter = null;

        try {
            fileReader = new FileReader("C:\\Users\\Hp\\Desktop\\projects\\H.txt");
            bufferedReader = new BufferedReader(fileReader);
            String sentence;
            String capitalizedSentence = null;
            fileWriter = new FileWriter("C:\\Users\\Hp\\Desktop\\projects\\L.txt");
            printWriter = new PrintWriter(fileWriter);
            while ((sentence = bufferedReader.readLine()) != null) {
                capitalizedSentence = sentence.toUpperCase();
                System.out.println(capitalizedSentence);
            }

            printWriter.write(capitalizedSentence + "\n");

        } finally {
            if (fileWriter != null) {
                fileWriter.close();
            }
            if (printWriter != null) {
                printWriter.close();
            }
            if (fileReader != null) {
                fileReader.close();
            }
            if (bufferedReader != null) {
                bufferedReader.close();
            }
        }
    }
}
