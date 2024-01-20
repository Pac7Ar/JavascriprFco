public class Arreglos {

    /**
     * @param args
     */
    public static void main(String[] args) {
        int numeros [] =new int[6];
        numeros[0] = 12; 
        numeros[1] = 10;
        numeros[2] = 4; 
        numeros[3] = 24;
        numeros[4] = 5;
        numeros[5] = 9;

        for( int i = 0;i<numeros.length;i++){

            System.out.println("Numero de la posicion:  "+numeros[i]+"   Impime el numero que se encuentra en la posiicon:  "+numeros[i]);
        }
    }
}
