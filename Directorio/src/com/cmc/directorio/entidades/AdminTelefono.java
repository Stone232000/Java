package com.cmc.directorio.entidades;

public class AdminTelefono {

	public void activarMensajeria(Telefono t1) {
		if (t1.getOperadora() == "movi") {
			t1.setTieneWhatsapp(true);
		}

	}

	public void contarMovi(Telefono t1, Telefono t2, Telefono t3) {
		if (t1.getOperadora() == "movi" && t2.getOperadora() == "movi" && t3.getOperadora() == "movi") {
			System.out.println("El nunmero 1 es: " + t1.getOperadora() + " El nunmero  es: " + t2.getOperadora()
					+ " El nunmero 3 es: " + t3.getOperadora());
		} else if (t1.getOperadora() == "movi" && t2.getOperadora() != "movi" && t3.getOperadora() != "movi") {
			System.out.println("El nunmero 1 es: " + t1.getOperadora());
		} else if (t1.getOperadora() != "movi" && t2.getOperadora() == "movi" && t3.getOperadora() != "movi") {
			System.out.println("El nunmero 2 es: " + t2.getOperadora());

		} else if (t1.getOperadora() != "movi" && t2.getOperadora() != "movi" && t3.getOperadora() == "movi") {
			System.out.println("El nunmero 3 es: " + t3.getOperadora());
		} else if (t1.getOperadora() == "movi" && t2.getOperadora() == "movi" && t3.getOperadora() != "movi") {
			System.out.println("El nunmero 1 es: " + t1.getOperadora() + " El nunmero 2 es: " + t2.getOperadora());
		} else if (t1.getOperadora() != "movi" && t2.getOperadora() == "movi" && t3.getOperadora() == "movi") {
			System.out.println("El nunmero 2 es: " + t2.getOperadora() + " El nunmero 3 es: " + t3.getOperadora());
		} else if (t1.getOperadora() == "movi" && t2.getOperadora() != "movi" && t3.getOperadora() == "movi") {
			System.out.println("El nunmero 1 es: " + t1.getOperadora() + " El nunmero 3 es: " + t3.getOperadora());
		} else {
			System.out.println("Ninguno es movi");
		}

	}

	public void contarClaro(Telefono t1,Telefono t2,Telefono t3,Telefono t4) {
		if (t1.getOperadora() == "claro" && t2.getOperadora() == "claro" && t3.getOperadora() == "claro"&& t4.getOperadora() == "claro") {
			System.out.println("El nunmero 1 es: " + t1.getOperadora() + " El nunmero 2  es: " + t2.getOperadora()
					+ " El nunmero 3 es: " + t3.getOperadora()+" El nunmero 4 es: "+t4.getOperadora());
		} else if (t1.getOperadora() == "claro" && t2.getOperadora() != "claro" && t3.getOperadora() != "claro"&& t4.getOperadora() != "claro") {
			System.out.println("El nunmero 1 es: " + t1.getOperadora());
		} else if (t1.getOperadora() != "claro" && t2.getOperadora() == "claro" && t3.getOperadora() != "claro"&& t4.getOperadora() != "claro") {
			System.out.println("El nunmero 2 es: " + t2.getOperadora());
		
			

		} else if (t1.getOperadora() != "claro" && t2.getOperadora() != "claro" && t3.getOperadora() == "claro"&& t4.getOperadora() == "claro") {
			System.out.println("El nunmero 3 es: " + t3.getOperadora());
			
		}else if(t1.getOperadora() != "claro" && t2.getOperadora() != "claro" && t3.getOperadora() != "claro"&& t4.getOperadora() == "claro") {
			System.out.println("El nunmero 4 es: " + t3.getOperadora());
		
		} else if (t1.getOperadora() == "claro" && t2.getOperadora() == "claro" && t3.getOperadora() == "claro"&& t4.getOperadora() != "claro") {
			System.out.println("El nunmero 1 es: " + t1.getOperadora() + " El nunmero 2 es: " + t2.getOperadora()+" El nunmero 3 es: " + t3.getOperadora());
		} else if (t1.getOperadora() != "claro" && t2.getOperadora() == "claro" && t3.getOperadora() == "claro"&& t4.getOperadora() == "claro") {
			System.out.println("El nunmero 2 es: " + t2.getOperadora() + " El nunmero 3 es: " + t3.getOperadora()+" El nunmero 4 es: " + t4.getOperadora());
		} else if (t1.getOperadora() == "claro" && t2.getOperadora() != "claro" && t3.getOperadora() == "claro"&& t4.getOperadora() == "claro") {
			System.out.println("El nunmero 1 es: " + t1.getOperadora() + " El nunmero 3 es: " + t3.getOperadora()+" El nunmero 4 es: " + t4.getOperadora());
		} else if (t1.getOperadora() == "claro" && t2.getOperadora() == "claro" && t3.getOperadora() != "claro"&& t4.getOperadora() == "claro") {
			System.out.println("El nunmero 1 es: " + t1.getOperadora() + " El nunmero 2 es: " + t2.getOperadora()+" El nunmero 4 es: " + t4.getOperadora());
		} else if (t1.getOperadora() == "claro" && t2.getOperadora() == "claro" && t3.getOperadora() != "claro"&& t4.getOperadora() != "claro") {
			System.out.println("El nunmero 1 es: " + t1.getOperadora() + " El nunmero 2 es: " + t2.getOperadora());
		} else if (t1.getOperadora() == "claro" && t2.getOperadora() != "claro" && t3.getOperadora() == "claro"&& t4.getOperadora() != "claro") {
			System.out.println("El nunmero 1 es: " + t1.getOperadora() + " El nunmero 3 es: " + t3.getOperadora());
		} else if (t1.getOperadora() == "claro" && t2.getOperadora() != "claro" && t3.getOperadora() != "claro"&& t4.getOperadora() == "claro") {
			System.out.println("El nunmero 1 es: " + t1.getOperadora() + " El nunmero 4 es: " + t4.getOperadora());
			
		} else if (t1.getOperadora() != "claro" && t2.getOperadora() == "claro" && t3.getOperadora() == "claro"&& t4.getOperadora() != "claro") {
			System.out.println("El nunmero 2 es: " + t2.getOperadora() + " El nunmero 3 es: " + t3.getOperadora());
		} else if (t1.getOperadora() != "claro" && t2.getOperadora() == "claro" && t3.getOperadora() != "claro"&& t4.getOperadora() == "claro") {
			System.out.println("El nunmero 2 es: " + t2.getOperadora() + " El nunmero 4 es: " + t4.getOperadora());
			
		} else if (t1.getOperadora() != "claro" && t2.getOperadora() != "claro" && t3.getOperadora() == "claro"&& t4.getOperadora() == "claro") {
			System.out.println("El nunmero 3 es: " + t3.getOperadora() + " El nunmero 4 es: " + t4.getOperadora());
		} else {
			System.out.println("Ninguno es claro");
		}

		
	}

}
