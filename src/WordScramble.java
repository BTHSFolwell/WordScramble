import java.util.ArrayList;
import java.util.List;

public class WordScramble {
    private ArrayList<String> wordList;
    public WordScramble(String[] wordListArr)
    {
        wordList = new ArrayList<String>();
        for (int i = 0; i < wordListArr.length;i++)
        {
            wordList.add(i,wordListArr[i]);
        }
    }
    //Part (a)
    public static String scrambleWord(String word)
    {
        String scrambledWord = "";
        for(int i = 0; i < word.length()-2; i++)
        {
            if(word.substring(i,i+1).equals("A")&&(!word.substring(i+1,i+2).equals("A")))
               scrambledWord+=word.substring(i+1,i+2)+word.substring(i,i+1);
        }
    }
    //Part (b)
    public static void scrambleOrRemove(List<String> wordList)
    {
        
    }
}
