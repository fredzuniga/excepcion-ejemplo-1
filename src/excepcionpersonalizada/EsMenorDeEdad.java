/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepcionpersonalizada;

/**
 *
 * @author osx
 */
class EsMenorDeEdad extends Exception{
    // constructor ---> inicializar los valores de mi excepción
    public EsMenorDeEdad(String mensaje) {
      super(mensaje);
    }
}
