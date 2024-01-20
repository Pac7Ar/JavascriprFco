import java.io.PrintStream;
import java.util.Scanner;

public class Diastema {


public static void main(String[] args) {
  
int dia;
Scanner tecl = new Scanner(System.in);

System.out.println("Dia de la semana");

dia=tecl.nextInt();

switch (dia) {
  case 1:System.out.println("Dia domingo");
    break;
    case 2:System.out.println("Lunes");
    break;
    case 3:System.out.println("Martes");
    break;
    case 4:System.out.println("Miercoles");
    break;
    case 5:System.out.println("Juves");
    break;
    case 6: System.out.println("Viernes");
    break;
    case 7: System.out.println("Sabado");
    break;
    default: System.out.println("Ningun dia de la semana");
    
}



}

}





    
    

