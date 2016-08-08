import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by ekaterina on 08.08.16.
 */
public class Reader {
    //Implement

    Scanner scanner;

    public Reader(String fileName){
        try {
            scanner = new Scanner(new File(fileName));
        }catch (FileNotFoundException e){

        }
    }


    public String nextLine(){
        if(scanner.hasNextLine())
            return scanner.nextLine();
        else
            return null;
    }



    private static String readString() {
        try {
            return new Scanner(new File("input.txt")).nextLine();
        } catch (FileNotFoundException ex) {
            return null;
        }
    }
}
