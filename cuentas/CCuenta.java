package cuentas;

/**
 * @author soraya martinez
 * @version 1.0.0
 * @since 1.0.0
 */
public class CCuenta {


    /**
     * @param nombre  nombre del titular de la cuenta
     * @since 1.0.0
     * @description Los atributos no salen en el Javadoc porque son privados
     */
    private String nombre;

    /**
     * @param cuenta  número de la cuenta
     * @since 1.0.0
     * @description Los atributos no salen en el Javadoc porque son privados
     */
    private String cuenta;

    /**
     * @param saldo  saldo de la cuenta
     * @since 1.0.0
     * @description Los atributos no salen en el Javadoc porque son privados
     */
    private double saldo;

    /**
     * @param tipoInterés tipo de interes de la cuenta
     * @since 1.0.0
     * @description Los atributos no salen en el Javadoc porque son privados
     */
    private double tipoInteres;


    public CCuenta() {
    }

    /**
     * @param nom nombre del titular de la cuenta
     * @param cue número de la cuenta
     * @param sal saldo de la cuenta
     * @param tipo tipo de interes de la cuenta
     * @since 1.0.0
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
        tipoInteres = tipo;
    }

    /**
     * @return nombre del titular de la cuenta
     * @since 1.0.0
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre nombre del titular de la cuenta
     * @since 1.0.0
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return número de la cuenta
     * @since 1.0.0
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta número de la cuenta
     * @since 1.0.0
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }


    /**
     * @return saldo de la cuenta
     * @since 1.0.0
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo saldo de la cuenta
     * @since 1.0.0
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return tipo de interes de la cuenta
     */
    public double getTipoInteres() {
        return tipoInteres;
    }

    /**
     * @param tipoInteres tipo de interes de la cuenta
     * @since 1.0.0
     */
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    /**
     * @return el saldo de la cuenta
     * @since 1.0.0
     */
    public double estado() {
        return saldo;
    }

    /**
     * @param cantidad cantidad de dinero a ingresar
     * @throws Exception si introduces una cantidad negativa
     * @since 1.0.0
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        saldo = saldo + cantidad;
    }

    /**
     * @param cantidad cantidad de dinero a retirar
     * @throws Exception si no hay suficiente saldo o introduces una cantidad negativa
     * @since 1.0.0
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (estado() < cantidad) {
            throw new Exception("No se hay suficiente saldo");
        }
        saldo = saldo - cantidad;
    }
}
