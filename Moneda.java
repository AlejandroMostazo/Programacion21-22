public class Moneda {
	
	public static void main (String[] args) {
		double euros, dolares, yenes, libras, yuanes;
		final double mdolar = 0.86, myenes = 0.0075, mlibras = 1.19, myuanes = 0.13;
		System.out.println("Introduce la moneda que estas usuando:");
		String moneda = System.console().readLine();
		System.out.println("Introduce la cantidad de dinero a convertir:");
		double cantidad = Integer.parseInt(System.console().readLine());
		euros = cantidad;
		
		switch (moneda) {
			case "dolares":
				euros = cantidad * mdolar;
			break;
			case "yenes":
				euros = cantidad * myenes;
			break;
			case "libras":
				euros = cantidad * mlibras;
			break;
			case "yuanes":
				euros = cantidad * myuanes;
			
		}
		dolares = cantidad * mdolar;
		yenes = cantidad * myenes;
		libras = cantidad * mlibras;
		yuanes = cantidad * myuanes;
		System.out.println("La cantidad de dinero en euros es:"+euros);
		System.out.println("La cantidad de dinero en dolares es:"+dolares);
		System.out.println("La cantidad de dinero en yenes es:"+yenes);
		System.out.println("La cantidad de dinero en libras es:"+libras);
		System.out.println("La cantidad de dinero en yuanes es:"+yuanes);
		
	}
}

