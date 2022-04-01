package excepcionpersonalizada;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ExcepcionPersonalizada {

    public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args){
        int edad;
        System.out.println("Indica una edad");
        try {
            edad = Integer.parseInt(entrada.readLine());
            // si la persona es menor de edad entonces que me genere una excepción(gestionar ese 
            // requerimiento)
            /* 
            if(edad < 18){
                // aquí genero la excepción
                throw new EsMenorDeEdad(" <---Error, el edad indicada no es valida");
            }
            */
            validarMenorEdad(edad);
        } catch (NumberFormatException ex) {
            // se ejecute a generarse una excepcion.
            System.out.println("El valor es una letra");
            // hare algo
        } catch (EsMenorDeEdad exc) {
            // se ejecute a generarse una excepcion.
            //System.out.println("Error, el edad indicada no es valida");
            System.out.println("--->" + exc.getMessage());
            // hare algo
        }catch (IOException ex) {
            System.out.println("Error");
        }
        
    }
    
    public static void validarMenorEdad(int edad) throws EsMenorDeEdad{
        if(edad < 18){
            // aquí genero la excepción
            throw new EsMenorDeEdad(" <---Error, el edad indicada no es valida");
        }
    }
    
}
