import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by ekaterina on 08.08.16.
 */
public class Translator {

    String[] languages = {"en", "eo", "es"};
    String[][] dict = {
            {"tiger", "tigro", "tigre"},
            {"in", "en", "en"},
            {"the", "la", "la"},
            {"house", "domo", "casa"},
            {"I", "Mi", "Me" },
            {"want","volas", "quiero" },
            {"to", "al", "a"},
            {"sea", "maro", "mar"},
            {"you", "vi", "tu"},
            {"old", "malnova", "antiguo" }
    };


    int columnSource = 0;
    int columnDestination = 0;
    String source;
    String destination;

    public Translator(String source, String destination){
        this.source = source;
        this.destination = destination;


        switch (source){
            case "en":
                columnSource = 0;
                break;
            case "eo":
                columnSource = 1;
                break;
            case "es":
                columnSource = 2;
                break;
        }

        switch (destination){
            case "en":
                columnDestination = 0;
                break;
            case "eo":
                columnDestination = 1;
                break;
            case "es":
                columnDestination = 2;
                break;
        }
    }

    public String translate(String src) {
        String result = "";
        Pattern p = Pattern.compile("(\\w+)(\\W+)");
        Matcher m = p.matcher(src);
        while (m.find())
            result += translateWord(m.group(1)) + m.group(2);
        return result;
    }

    private String translateWord(String s){


        String result = "";

        for(int i = 0; i < dict.length; i++){
            if(s.equals(dict[i][columnSource])){
                result = dict[i][columnDestination];
            }
        }

        if(!result.equals(""))
            return result;
        else
            return s;
    }
}
