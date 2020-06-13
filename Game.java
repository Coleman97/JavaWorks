import java.util.Scanner;

class Game{
    public static void main(String[] args) {
        System.out.println("Word for today = Cr_co_i_e");
        String[] missing = {"o","d","l"};
        String Guess;
        System.out.println("Guess the missing Letters: ");
        System.out.println("first letter: ");
        Scanner sc = new Scanner(System.in);
        Guess = sc.nextLine();
        for(int i = 0; i<missing.length;i++);
        if(Guess == missing[0]){
            System.out.println("First Guess is correct!!");
            System.out.println("Guess the Second letter");
        }else{
            System.out.println("You Guessed wrongly! Try again");
            System.out.println("first Letter: ");
        }

        
    }
}