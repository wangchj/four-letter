import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class Lex
{
    /**
     * Reads a lexicon file and outputs all 4-letter words in the correct format to standard out.
     * All words in the output are lowercase.
     * A lexicon file has the format that each line holds a word.
     * @param args the first argument is the lexicon file.
     */
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner s = new Scanner(new File(args[0]));
        ArrayList<String> lexicon = new ArrayList<String>();
        while (s.hasNext())
        {
            String word = s.next().toLowerCase();
            if(word.length() == 4)
                lexicon.add(word);
            s.nextLine();
        }
        
        //System.out.printf("Lexicon size %d \n", lexicon.size());
        
        //Output all words
        System.out.print('[');
        for(String word : lexicon)
        {
            if(word != lexicon.get(0))
                System.out.print(',');
            System.out.print('\'' + word + '\'');
        }
        System.out.print(']');
    }
}