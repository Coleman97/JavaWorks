import java.io.IOException;

public class PromptForC {
    public static void main(String[] args) throws IOException {
        /*int ch = 0;
		while(ch != 'C' && ch != 'c'){
            System.out.println("Press C or c to continue: ");
            ch = System.in.read();   
        }*/
        int ch = 0;
        do{
            System.out.println("Press C or c to continue: ");
        }
        while(ch != 'C' && ch != 'c');
        
        
    }

}