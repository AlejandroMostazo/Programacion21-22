public class Ejercicio10 {
	
	public static void main (String[] args) {
		int i = 0;
		int num, aux = 0, aux2 = 0, aux3 = 0;
		while (i >= 0) { 
			System.out.println("introduce las notas:");
			num = Integer.parseInt(System.console().readLine());
			if (num < 0) {
				aux = aux3 / (aux2);
				System.out.println("La media es:"+aux);
				System.out.println("no se admiten negativos");
				i = num;
				}
			aux = num;
			aux3 = aux + aux3;
			i++;
			aux2 = i;
		}
	}
}

