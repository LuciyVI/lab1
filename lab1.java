
public class lab1{
    
    public class Constants {
        public static final String Format = "%.5f%n";
    }

    public static void calc_pi1() {
        
        double i=1.0;

        double result=1.0;
        
        int cyrcle=1;
         
        do{        
                
                System.out.printf("\n Первое разложение: %.5f%n",result);
                
                result-=(1.0/(i+=2)+(1.0/(i+=2)));         
                if(4*result>Math.PI){
                cyrcle++;
                }else {
                    continue;
                }
            }while(Math.abs(result)<Math.PI); 
    
        
        
        
    
    
        
};
  

public static void calc_pi2() {
   
    int i=2;

    double result=1.0;
    double exit = 2.5;
    boolean flag=false;
    while(flag){
        for(int a=1; a<exit; a++) {
            
            
            result=+(1/((i)*(i=+i+1)*(i=+i+1))-(1.0/(i)*(i=+i+1)*(i=+i+1)));         
            
        }; 
        
        System.out.printf("\n Второе разложение %.5f%n",3+4*result);
        
        
    
    
    
    
    };
    
    

    
};

    public static void main(String[] args){
            
    
    calc_pi1();
    calc_pi2(); 
    

    
    };
}