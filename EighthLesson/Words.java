import java.util.Random;
import java.util.Scanner;

public class Words {

    private String word;
   private String[] words = {"apple", "orange", "lemon", "banana",
            "apricot", "avocado", "broccoli", "carrot", "cherry",
            "garlic", "grape", "melon", "leak", "kiwi", "mango",
            "mushroom", "nut", "olive", "pea", "peanut", "pear",
            "pepper", "pineapple", "pumpkin", "potato"};

//private String[] words = {"apple", "apricot", "lemon"};
   public Words(){
       this.word = word;
       this.words = words;

   }

   public String returnWord() {

        Random random = new Random();
        int index = random.nextInt(words.length);
        //System.out.println(words[index]);
        return words[index];
    }


    public boolean equalsWord(String secondWord){

        String firstWord= returnWord();

        if (firstWord.equals(secondWord)){
            System.out.println("Верно!");
            return true;
        }
        else {
            System.out.println("Не верно!");
            compareWords(firstWord, secondWord);
            return false;
        }

    }

    public void compareWords(String firstWord, String secondWord) {


        firstWord=addGrid(firstWord);
        secondWord=addGrid(secondWord);


            String str = "";
            for (int i = 0; i < 15; i++) {
                if (firstWord.charAt(i) == secondWord.charAt(i)) {
                    str = str + Character.toString(firstWord.charAt(i));
                } else str = str + '#';
            }
            System.out.println(str);


    }
    public String addGrid(String word){

            for (int i=word.length();i<15;i++){
                word = word+'#';
            }

        return word;
    }
}
