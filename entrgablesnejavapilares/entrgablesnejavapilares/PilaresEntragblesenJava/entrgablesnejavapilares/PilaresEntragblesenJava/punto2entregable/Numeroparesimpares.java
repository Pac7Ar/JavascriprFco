import java.util.Scanner;

public class Numeroparesimpares {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int numb;

        System.out.println("Ingrese el numero :");
        
        numb = teclado.nextInt();

        if(numb % 2== 0){
            System.out.println(" Numero par "+ numb);
        } else {

            if(numb %2 ==1){
                System.out.println("Es un numero impar");
            }
        }
    }    

}
