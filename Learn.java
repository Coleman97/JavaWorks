import javax.lang.model.util.ElementScanner6;

public class Learn{
    public static void main(String[] args){
        int[] Employee = {200,201,202,203,204,205};
        int Cole =  209;
        Boolean found =  false;
        for(int i = 0; i<Employee.length; i++)
            if(Cole == Employee[i]){
                found = true;
                System.out.println( "employee " + Cole + " exists");
                break;
            }else{
                System.out.println("employee not found");
                break;
            }
      
    }
}