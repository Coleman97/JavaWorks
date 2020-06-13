class Laptop{
    String Name;
    String Year;
    int Amount;

    Laptop(String Name, String Year){
        this(Name, Year, 5);
    }
    Laptop(String Name, String Year, int nAmount){
        this.Name = Name;
        this.Year = Year;
        this.Amount = nAmount;
    }
    void LaptopDetails(){
        System.out.println("Name OF Laptop = " + Name);
        System.out.println("Year Made = " + Year);
        System.out.println("Amount ordered = " + Amount);
        System.out.println();
    }
}
public class Laptops {
    public static void main(String[] args) {
        Laptop myLapi = new Laptop("Alienware", "2020");
        myLapi.LaptopDetails();
        Laptop yourLapi = new Laptop("Hp", "2019", 2);
        yourLapi.LaptopDetails();
    }
    
}