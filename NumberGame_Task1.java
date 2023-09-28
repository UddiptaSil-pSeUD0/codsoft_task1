import java.util.*;

public class NumberGame_Task1 {
    
    
    public static void main(String []args){

        Scanner sc=new Scanner(System.in);
        int playAgain;
        do{
            play();
            System.out.printf("\nWould you like to play again? \n Enter '1' for YES or '0' for NO\n");
            playAgain=sc.nextInt();
        }while(playAgain==1);
    }
    public static void play(){
        int gen_number= (int)(100 * Math.random()) + 1;
        int guessCount=0;
        int guess;
        Scanner sc=new Scanner(System.in);
        System.out.println("I'll Guess A Number Between 1 and 100. You'll Try To GUESS It!");
        while(guessCount<7){
            System.out.println("Enter your Guess:");
            guess=sc.nextInt();
            
            if(guess==gen_number){
                System.out.println("Congratulations! You GUESSED It Right :"+guess);
                System.out.println("You Guessed In "+(guessCount+1)+" Guesses.");
                break;
            }
            else if(guess>gen_number){
                guessCount++;
                System.out.println("Your GUESS Is Too HIGH.");
                if((7-guessCount)!=-1)
                System.out.println("Guesses Remaining: "+(7-guessCount));
            }
            else {
                guessCount++;
                System.out.println("Your GUESS Is Too LOW.");
                if((7-guessCount)!=-1)
                System.out.println("Guesses Remaining: "+(7-guessCount));
            }

        }
        if(guessCount==7)
        System.out.println("Sorry You Didn't Guessed It In 7 Guesses.\n The number was: "+gen_number);
        guessCount=0;

        

    }
    
}
