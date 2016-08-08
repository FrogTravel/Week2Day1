import java.io.*;

/**
 * Created by ekaterina on 08.08.16.
 */
public class Writer {
    //Implement constructor
    //Implement write(String s);
    //Implement close();

    PrintWriter printWriter;

    public Writer(String filename){
        try {
            printWriter = new PrintWriter(filename, "ascii");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    public void write(String s){
        printWriter.print(s);
    }

    public void close(){
        printWriter.close();
    }

    private static void writeString(String s) {
        try {
            try (java.io.Writer writer = new BufferedWriter(
                    new OutputStreamWriter(
                            new FileOutputStream("output.txt"), "ascii"))) {
                writer.write(s);
            }
        } catch (IOException ex) {
        }
    }
}
