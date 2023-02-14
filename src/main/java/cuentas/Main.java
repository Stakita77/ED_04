
package cuentas;

/**
 *
 * @author Staka
 */
public class Main {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es " + saldoActual);

        operativa_cuenta(cuenta1, 2300);
        operativa_cuenta(cuenta1, 695);
    }

    /**
     *
     * @param cuenta
     * @param cantidad
     */
    public static void operativa_cuenta(CCuenta cuenta, double cantidad) {
        try {
            cuenta.retirar(cantidad);
            System.out.println("Retiro en cuenta realizado con éxito");
        } catch (Exception e) {
            System.out.println("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta.ingresar(cantidad);
        } catch (Exception e) {
            System.out.println("Fallo al ingresar");
        }
    }
}
