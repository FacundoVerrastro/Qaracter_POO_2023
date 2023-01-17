
public class TextHexagono {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		dibujarHexagono();
	}

	public static void dibujarHexagono() {
		int anchura = 4;
		int altura = 10;
		int espacios = 0;
		
		for (int i = 0; i<altura/2;i++) {
			espacios = 1 + (altura-anchura)/2;
			while(espacios >0) {
				System.out.print(" ");
				espacios--;
			}
			for(int j = 0; j<anchura; j++) {
				System.out.print("+");
			}
			anchura+=2;
			System.out.print("\n");
		}
		anchura-=4;
		
		for (int i = altura/2; i>1;i--) {
			espacios = 1 + (altura-anchura)/2;
			while(espacios >0) {
				System.out.print(" ");
				espacios--;
			}
			for(int j = 0; j<anchura; j++) {
				System.out.print("+");
			}
			anchura-=2;
			System.out.print("\n");
		}
	}
}
