public class Temperature{
    private double celsius;
    private double farenheit;

    public Temperature(double celsius,double farenheit){
        this.celsius = celsius;
        this.farenheit = farenheit;

    }
    public void c2f(){
        double K = 32;
            farenheit =(celsius * 9/5)+K;
            System.out.println(celsius + " Degree celsius in farenheit is = " + farenheit +"F");

        }
        public void f2c(){
            double K = 32;
                celsius = (farenheit-K)*5/9;
                System.out.println(farenheit +" K in Degree celsius is = " + celsius  +"C");
    
            }  
        public static void main(String[] args) {
            Temperature Temp1 = new Temperature(30.0, 122);
            Temp1.f2c();
        }      
    
}