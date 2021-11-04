
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        MyWindow window = new MyWindow();
        window.initWindow();

        Words guessWord = new Words();
        System.out.println("Я загадал слово, отгадай");

        while (true) {
            Scanner myScanner = new Scanner(System.in);
            if (guessWord.equalsWord(myScanner.nextLine())==true)
                break;
        }


    }
}
