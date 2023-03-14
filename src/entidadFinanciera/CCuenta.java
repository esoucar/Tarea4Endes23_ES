/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package entidadFinanciera;

/**
 * Clase CCuenta.
 * Almacena información y métodos para operar sobre una cuenta bancaria.
 * @author Erick
 * @version 1.0
 */
public class CCuenta {

    /**
     * Nombre de la persona titular
     */
    private String nombre;
    
    /**
     * Cadena con los dígitos de la cuenta
     */
    private String cuenta;
    
    /**
     * Saldo de la cuenta
     */
    private double saldo;
    
    /**
     * Tipo de interés asociado a la cuenta
     */
    private double tipoInterés;

    private static final String ERRORCANTIDADNEGATIVA = "No se puede ingresar una cantidad negativa";
    
    /**
     * Constructor vacío de la clase CCuenta.
     */
    public CCuenta()
    {
    }

    /**
     * Constructor de la clase CCuenta.
     * @param nom el nombre de la persona titular
     * @param cue cadena con los dígitos de la cuenta
     * @param sal saldo de la cuenta
     * @param tipo tipo de interés asociado a la cuenta
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre=nom;
        cuenta=cue;
        saldo=sal;
        tipoInterés=tipo;
    }
    
    /**
     * Getters y setters para los atributos de la clase
     */   
    /**
     * @return nombre de la persona titular
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre nombre de la persona titular a establecer
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return cadena con los dígitos de la cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta cadena con los dígitos de la cuenta a establecer
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return saldo de la cuenta
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo saldo de la cuenta a establecer
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return tipo de interés asociado a la cuenta
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * @param tipoInterés tipo de interés asociado a la cuenta a establecer
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    
    /**
     * Método estado.
     * Devuelve la información del estado (saldo) de la cuenta.
     * @return el saldo de la cuenta
     */
    public double estado(){
        return this.getSaldo();
    }

    /**
     * Método ingresar.
     * Recibe una cantidad a ingresar y trata de sumarla al saldo actual.
     * Si la cantidad es negativa, lanza una excepción.
     * @param cantidad la cantidad a ingresar
     * @throws java.lang.Exception
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception(ERRORCANTIDADNEGATIVA);
        setSaldo(getSaldo() + cantidad);
    }
    /**
     * Método retirar.
     * Recibe una cantidad a ingresar y trata de restarla al saldo actual.
     * Si la cantidad es negativa o es igual a cero, lanza una excepción.
     * Si la cantidad es menor que el saldo actual, lanza una excepción.
     * @param cantidad la cantidad a retirar
     * @throws java.lang.Exception
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception (ERRORCANTIDADNEGATIVA);
        if (getSaldo() < cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}


    
   