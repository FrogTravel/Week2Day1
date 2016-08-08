import java.util.Scanner;

/**
 * Created by ekaterina on 08.08.16.
 */
public class Launcher {
    public static void main(String[] args){
        Reader reader = new Reader("input.txt");
        String language = reader.nextLine();

        String[] languages = language.split(" ");

        Translator translator = new Translator(languages[0], languages[1]);

        String result = "";
        String str = "";

        Writer writer = new Writer("output.txt");

        while((str = reader.nextLine()) != null) {
            result = translator.translate(str +  " ") + "\n";
            System.out.println(result);
            writer.write(result);
        }

        writer.close();


        System.out.print(result);
    }
}
