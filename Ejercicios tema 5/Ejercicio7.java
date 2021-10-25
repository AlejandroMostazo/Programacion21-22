public class Ejercicio7 {

    public static void main(String args[]) {
        int codigo = 0;
        int i = 0;
        System.out.println("Introduce el codigo correcto para abrir la caja fuerte: ");
        while (i <= 4) {
            codigo = Integer.parseInt(System.console().readLine());
            if (codigo == 6396) {
                System.out.println("Enhorabuena has abierto la caja");
                i = 5;
            } else {
                System.out.println("El codigo no es correcto vuelve a intentarlo");
                i++;
        }
      }
    }
}
