public class Fibo {
    
    public static void main(String[] args) {        
            int a = 0;
            int b = 1;
            int c = 0;
            int rango =7;
    
            for(int i=0; i<=rango; i++){
            
                if(c<=rango){
                    System.out.println(c);
                    c=a+b;
                    a=b;
                    b=c;
                }
            }
        }   
    }