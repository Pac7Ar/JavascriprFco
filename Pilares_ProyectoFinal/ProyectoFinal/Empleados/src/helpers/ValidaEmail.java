package helpers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validaremail {

    
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        Pattern pattern = Pattern.compile("^[ A-Za-z=-\\].[A-Za]+[A-Za-z0-9-]+[A-Za-z]{2,}$");
        //validando el correo
String email = "infor@programacion.com";

Matcher mather = pattern.matcher(email);

   if (mather.find()== true ){
    
    System.out.println(" El mail ingreado es valido");

   }else{
    System.out.println("El mail ingresado no es valido");
   }
    }
        
    }



