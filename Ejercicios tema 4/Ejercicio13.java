public class Ejercicio13 {
	
	public static void main (String[] args) {
		int uno, dos, tres;
		int opcion;
		System.out.println("Introduce un numero");
		uno = Integer.parseInt(System.console().readLine());
		System.out.println("Introduce otro numero");
		dos = Integer.parseInt(System.console().readLine());
		System.out.println("Introduce otro numero");
		tres = Integer.parseInt(System.console().readLine());
		System.out.println("La sucesión es:");
		if (uno < dos && uno < tres) {
			System.out.println(uno);
			opcion = 1;
		} else {
			if (dos < tres) {
				System.out.println(dos);
				opcion = 2;
			} else {
				System.out.println(tres);
				opcion = 3;
			}
		}
		switch (opcion) {
			case 1:
				if (dos < tres) {
					System.out.println(dos+"\n"+tres);
				} else {
					System.out.println(tres+"\n"+dos);
				}
			break;
				
			case 2:
				if (uno < tres) {
					System.out.println(uno+"\n"+tres);
				} else {
					System.out.println(tres+"\n"+uno);
				}
			break;
				
			case 3:
				if (dos < uno) {
					System.out.println(dos+"\n"+uno);
				} else {
					System.out.println(uno+"\n"+dos);
				}
			break;
			}
		}
	}

