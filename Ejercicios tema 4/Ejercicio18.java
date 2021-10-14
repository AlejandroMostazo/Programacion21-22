public class Ejercicio18 {
	
	public static void main (String[] args) {
		int x, c;
		x = Integer.parseInt(System.console().readLine());
		if (x/10 < 9) {
			c = x/10;
			System.out.print(c);
		} else {
		if (x/100 <= 9) {
			c = x/100;
			System.out.print(c);
		}else { 
		if (x/1000 <= 9) {
			c = x/1000;
			System.out.print(c);
		} else { 
		if (x/10000 <= 9) {
			c = x/10000;
			System.out.print(c);
		} }}}
	}
}
