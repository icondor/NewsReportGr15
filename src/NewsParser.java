import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class NewsParser {

    public Map<String, Integer> parseBasedOnOccurances(String source) {
        // Putin 1
        // Isr 1


        Map<String, Integer> myNews = new HashMap<>();

        // aici scriu algoritmul

        StringTokenizer st = new StringTokenizer(source);
        while(st.hasMoreTokens()) {
            String currentWord = st.nextToken();
            if(currentWord.length()>=4)  {
                if(!myNews.containsKey(currentWord))
                     myNews.put(currentWord,1);
                else
                    myNews.put(currentWord, myNews.get(currentWord)+1);



            }
        }

        // parcurg textul

        return myNews;

    }
}
