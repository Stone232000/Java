package clearminds.cuentas.test;

import clearminds.cuentas.Cuenta;

public class TestCuenta {

	public static void main(String[] args) {
		// Creo el objeto Cuenta y lo referencio con cuenta1
		Cuenta cuenta1 = new Cuenta("03476");
		// Coloco un valor de saldo cuenta1
		cuenta1.setSaldo(675);
		// Creo el objeto Cuenta y lo referencio como cuenta2
		Cuenta cuenta2 = new Cuenta("03476", "C", 98);
		// Creo el objeto Cuenta y lo referencio como cuenta3
		Cuenta cuenta3 = new Cuenta("03476");
		// modifico el tipo de cuenta
		cuenta3.setTipo("C");
		// imprimo cuenta1,cuenta2,cuenta3
		System.out.println("----Valores Iniciales-----");
		cuenta1.imprimir();
		cuenta2.imprimir();
		cuenta3.imprimir();
		System.out.println("-----Valores Modificados--------");
		cuenta1.setSaldo(444);
		cuenta3.setSaldo(567);
		cuenta2.setTipo("D");
		cuenta1.imprimir();
		cuenta2.imprimir();
		cuenta3.imprimir();

		Cuenta cuenta4 = new Cuenta("0987");
		cuenta4.getId();
		cuenta4.setTipo("A");
		cuenta4.setSaldo(10);
		/*
		System.out.println("!!!!!!!!CUENTA 4!!!!!!!!");
		System.out.println("Id: " + cuenta4.getId());
		System.out.println("Tipo: " + cuenta4.getTipo());
		System.out.println("Saldo: " + cuenta4.getSaldo());
*/
		Cuenta cuenta5 = new Cuenta("0557", "A", 500);
		cuenta5.getId();
		cuenta5.setTipo("C");
		cuenta5.setSaldo(10);
		/*
		System.out.println("!!!!!!!!CUENTA 5!!!!!!!!");
		System.out.println("Id: " + cuenta5.getId());
		System.out.println("Tipo: " + cuenta5.getTipo());
		System.out.println("Saldo: " + cuenta5.getSaldo());
*/
		Cuenta cuenta6 = new Cuenta("0666", "A", 0);

		cuenta6.imprimirConMiEstilo();
		cuenta5.imprimirConMiEstilo();
		cuenta4.imprimirConMiEstilo();

	}

}
