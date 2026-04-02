package Tasks;

import java.util.Locale;
import java.util.Scanner;

public class RockPaperScissors {


    public static char computerPick(){
        int pick =  (int)(Math.random()*10%3);
        System.out.println(pick);
        switch (pick){
            case 0:
                return 'r';
            case 1:
                return 'p';
            case 2:
                return 's';
        }

        //if there was an error we'd return n
        return 'n';

    }


    static void main(String[] args) {
        int computerWins = 0;
        int playerWins = 0;
        //Loop for player picking what they want


        while(true) {

            System.out.println("The standings are player: computer: " + playerWins + " : " + computerWins);

            Scanner reader = new Scanner(System.in);
            System.out.println("Enter your choice (r/p/s) ");
            String pick = (reader.next().toLowerCase(Locale.ROOT));
            char choice = pick.charAt(0);
            while(true){

                if(choice == 'r' || choice == 'p' || choice == 's'){

                    break;
                }else{
                    System.out.println("Not valid, please try again");
                    System.out.println("Enter your choice (r/p/s) ");
                    pick = reader.next().toLowerCase(Locale.ROOT);
                    System.out.println(pick);
                }
            }
            //computer picks at random
            char computer = computerPick();


            switch (computer) {
                case 'r':
                    System.out.println("computer picked rock");
                    break;
                case 'p':
                    System.out.println("computer picked paper");
                    break;
                case 's':
                    System.out.println("computer picked scissors");
                    break;
                case 'n':
                    System.out.println("ERROR");
            }

            if(choice== computer){
                System.out.println("DRAW");
            }
            else {


                boolean win = choice == 'p' && computer == 'r' || choice == 'r' && computer == 's' || choice == 's' && computer == 'p';

                if(win){playerWins+=1;}else{ computerWins+=1;}
                System.out.println((win ? "You won" : "You lost"));
            }

        }


    }
}
