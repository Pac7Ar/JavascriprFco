public class MensajeDiaSemana {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa un numero del 1 al 7 para reprsentar un diade la semana");

        int numerodia= scanner.nextInt();

        String mensaje = "obtenerMenasajeDia(numeroDia";

         System.out.println(mensaje+mensa);

         scanner.close();

        
    }

    public static void main(String[] args) {
        String mensa;

        switch (numerodia) {
            case 1:
                 mensaje = "Lunes";
                break;
            case 2:
                 mensaje = "Martes" ;
                 break;
            case 3:
                 mensaje = "Miercoles";
                 break;
            case 4:
                  mensaje = "Jueves";
                  break;
            case 5:
                 mensaje = "Viernes";
                 break;
            case 6:
                 mensaje = "Sabado";
            case 7:
                  mensaje ="Domingo ";   
            default:
                  mensaje = "Numero  de Dia NO VALIDO. Ingresa un Número del 1 al 7.";
                break;
        }
    }

}
