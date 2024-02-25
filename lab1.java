
public class lab1{
    
    public class Constants {
        public static final String Format = "%.5f%n";
    }

    public static double calc_pi1() {
        
        double i=1.0;

        double result=1.0;
        
        int exit = 25;
        
        do{
        
            for(int a=1; a<exit; a++) {
        
               
            result-=(1.0/(i+=2)+(1.0/(i+=2)));         
            
        
        }; 
        
        exit=exit*10;
        
        }while(exit<500000);
    
    
        return 4*result;
};
  

public static double calc_pi2() {
    int i=2;

    double result=1.0;
    double exit = 2.5;
    do{
    for(int a=1; a<exit; a++) {
    
           
        result+=(1.0/((i)*(i=i+1)*(i=i+1))-(1.0/(i)*(i=i+1)*(i=i+1)));         
        System.out.printf("\n%d",i);
        
    }; 

    // System.out.printf("\n%d",i+1);
    
    exit=exit*10;
    
    
    }while(exit<50000);
    
    

    return (4+3)*result;
};

    public static void main(String[] args){
            
    // System.out.printf("%.5f%n \n",calc_pi1());
    // System.out.printf("%.5f%n \n", calc_pi2());
     calc_pi2();

    
    };
}