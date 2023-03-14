/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package entidadFinanciera;

/**
 * Clase Principal (Main).
 * Crea un objeto de tipo CCuenta y consulta su saldo actual,
 * además de implementar métodos para ingresar y retirar dinero de la cuenta.
 * @author Erick
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {
        CCuenta objetoCuenta;
        double saldoActual;
        // Creamos un nuevo objeto CCuenta y comprobamos su saldo
        objetoCuenta = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = objetoCuenta.estado();
        System.out.println("El saldo actual es " + saldoActual );   
    }
    
    /**
     * Método para ingresar dinero en la cuenta.
     * @param c la cuenta en la que ingresar el dinero
     * @param cantidadEsperada la cantidad a ingresar
     * @throws Exception 
     */
    public static void probarIngresar(CCuenta c, int cantidadEsperada) throws Exception {
        try {
            c.ingresar(cantidadEsperada);
        } catch (Exception exception) {
        }
    }
     /**
     * Método para retirar dinero de la cuenta.
     * @param c la cuenta de la que retirar el dinero
     * @param cantidadEsperada la cantidad a retirar
     * @throws Exception 
     */
    public static void probarRetirar(CCuenta c, int cantidadEsperada) throws Exception {
        try {
            c.retirar(cantidadEsperada);
        } catch (Exception exception) {
        }
    }    
}
