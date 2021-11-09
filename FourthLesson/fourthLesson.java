import com.sun.java.swing.plaf.windows.WindowsInternalFrameTitlePane;

import java.util.Random;
import java.util.Scanner;

public class fourthLesson {
    public static char[][] map;
    public static char DOT_EMPTY = '.';
    public static char DOT_X ='X';
   // public static char DOT_O ='O';
   // public static char DOT_V ='V';
   // public static char DOT_A ='A';
    public static char[] DOT ={'O','V','A'};


    public static int SIZE=5;
    public static void main(String[] args){

        initMap();
        showMap();

        while (true){
            humanTurn();
            showMap();
            if (isWinner(DOT_X)){
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()){
                System.out.println("Ничья!");
                break;
            }
           for (int i=0;i<3;i++)
            {
                playerTurn(DOT[i],i+1);
                showMap();
                if (isWinner(DOT[i])) {
                    System.out.println("Победил игрок"+ i+1);
                    break;
                }
                if (isMapFull()) {
                    System.out.println("Ничья!");
                    break;
                }
            }
        }
    }

    public static void initMap(){
  map =new char[SIZE][SIZE];
  for (int i=0;i<SIZE;i++){
      for (int j=0;j<SIZE;j++){
          map[i][j]=DOT_EMPTY;
      }
  }
    }
    public static void showMap(){
        for (int i=0;i<=SIZE;i++){
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println();

        for (int i=0;i<SIZE;i++){
            System.out.print(i+1);
            System.out.print((" "));
            for (int j=0;j<SIZE;j++){
                System.out.print(map[i][j]);
                System.out.print((" "));
            }
            System.out.println();
        }
    }
    public static void humanTurn(){
        int x;
        int y;
        Scanner scanner = new Scanner(System.in);
       do {
           System.out.println("Введите координаты X и Y");
           x = scanner.nextInt()-1;
           y = scanner.nextInt()-1;
       } while (!isCellValid(x,y));
        map[y][x] = DOT_X;
    }
    public static boolean isCellValid(int x,int y){
        if(x<0||x>SIZE||y<0||y>=SIZE){
            return false;
        }
        if(map[y][x]==DOT_EMPTY){
            return true;
        }
        return false;
    }
   /* public static void aiTurn(){
        int x;
        int y;
        Random myRandom= new Random();
        do {
            x = myRandom.nextInt(SIZE);
            y = myRandom.nextInt(SIZE);
        } while (!isCellValid(x,y));

        System.out.println("Компьютер сходил в точки: ");
        System.out.println("X-"+(x+1));
        System.out.println("Y-"+(y+1));
        map[y][x] = DOT_O;
    }*/

    public static void playerTurn(char DOT, int player){
        int x;
        int y;
        Random myRandom= new Random();
        do {
            x = myRandom.nextInt(SIZE);
            y = myRandom.nextInt(SIZE);
        } while (!isCellValid(x,y));

        System.out.println("Игрок "+player+" сходил в точки: ");
        System.out.println("X-"+(x+1));
        System.out.println("Y-"+(y+1));
        map[y][x] = DOT;
    }
    public static boolean isWinner(char symb){
       /* if (map[0][0]==symb && map[0][1]==symb && map[0][2]==symb){
            return true;
        }
        if (map[1][0]==symb && map[1][1]==symb && map[1][2]==symb){
            return true;
        }
        if (map[2][0]==symb && map[2][1]==symb && map[2][2]==symb){
            return true;
        }
        if (map[0][0]==symb && map[1][0]==symb && map[2][0]==symb){
            return true;
        }
        if (map[0][1]==symb && map[1][1]==symb && map[2][1]==symb){
            return true;
        }
        if (map[0][2]==symb && map[1][2]==symb && map[2][2]==symb){
            return true;
        }
        if (map[0][0]==symb && map[1][1]==symb && map[2][2]==symb){
            return true;
        }
        if (map[0][2]==symb && map[1][1]==symb && map[2][0]==symb){
            return true;
        }*/
       if (checkDiagonal(symb)){
           return true;
       }
       if (checkSecondaryDiagonal(symb)){
           return true;
       }

       for (int j=0;j<SIZE;j++) {
           if (checkRow(j, symb)) {
               return true;
           }
       }
          for (int i=0;i<SIZE;i++){
              if (checkColumn(i,symb)){
                  return true;
              }
          }
        return false;

    }
    public static boolean isMapFull(){
        for (int i=0;i<SIZE;i++){
            for (int j=0;j<SIZE;j++){
                if (map[i][j]==DOT_EMPTY){
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean checkColumn(int i, char symb){

        for (int j=0;j<SIZE;j++){
            if (map[i][j]!=symb){
                return false;
            }
        }
        return true;

    }
    public static boolean checkRow(int j, char symb){

        for (int i=0;i<SIZE;i++){
            if(map[i][j] != symb){
                return false;
            }
        }
        return true;
    }
    public static boolean checkDiagonal(char symb){
        for(int i=0;i<SIZE;i++){
            if (map[i][i]!=symb){
                    return false;
                }

        }
        return true;
    }
    public static boolean checkSecondaryDiagonal(char symb){
        for(int i=0;i<SIZE;i++){
            if (map[i][SIZE-i-1]!=symb){
                return false;
            }

        }
        return true;
    }

}
