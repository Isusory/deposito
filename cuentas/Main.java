package cuentas;


/**
 * @author soraya martinez
 * @version 1.0.0
 * @since 1.0.0
 */
public class Main {

    /**
     * @param args argumentos del métido main
     * @since 1.0.0
     */
    public static void main(String[] args) {
        CCuenta cuenta1= new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);

        consular_saldo_cuenta(cuenta1);
        retirar_saldo_cuenta(cuenta1, 2300f);
        ingresar_saldo_cuenta(cuenta1,695f);
    }


    /**
     * @param cuenta1 (CCuenta) Cuenta con la que se va a operar
     * @since 1.0.0
     * @descripcion Este método NO va a salir en el JavaDoc porque es privado
     */
    private static void consular_saldo_cuenta(CCuenta cuenta1) {
        double saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );
    }

    /**
     * @param cuenta1 (CCuenta) Cuenta con la que se va a operar
     * @param cantidad (float) Cantidad con la que se va a operar
     * @since 1.0.0
     * @descripcion Este método NO va a salir en el JavaDoc porque es privado
     */
    private static void ingresar_saldo_cuenta(CCuenta cuenta1, float cantidad) {
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(cantidad);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }

    /**
     * @param cuenta1 (CCuenta) Cuenta con la que se va a operar
     * @param cantidad (float) Cantidad con la que se va a operar
     * @since 1.0.0
     * @descripcion Este método NO va a salir en el JavaDoc porque es privado
     */
    private static void retirar_saldo_cuenta(CCuenta cuenta1, float cantidad) {
        try {
            cuenta1.retirar(cantidad);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
    }
}
