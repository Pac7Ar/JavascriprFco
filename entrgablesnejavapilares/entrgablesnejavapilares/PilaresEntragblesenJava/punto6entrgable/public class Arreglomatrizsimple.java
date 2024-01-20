public class Arreglomatrizsimple {
    public static void main(String[] args) {
        
int muestra []= new int[10];
    int i;

    for(i = 0;i<10;i=i+1){
        muestra[i] = i;

        for(i = 0;i < 10;i=i+1){

            System.out.println( "Muestra ["+i+"]:"+muestra[i]);
        }
    }
    }
}
