
import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola miami");
	}


	public int esMenor(int primerNumero, int segundoNumero, int tercerNumero){
		int menor = primerNumero;
		menor = segundoNumero < menor? segundoNumero : menor;
		menor = tercerNumero < menor? tercerNumero : menor; 
		return menor;
	}

	public int letraEnFrase(char letra, String frase){
		int contar = 0;
		for (int i=0;i<frase.length();i++) {
			if (frase.charAt(i) == letra ) {
				contar++;
			}
		}
		return contar;
	}

	public void sumarRestarReales() {
		float primerNumero;
		float segundoNumero;
		char opcion;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el primer numero real");
		primerNumero = sc.nextFloat();
		System.out.println("Ingrese el segundo numero real");
		segundoNumero = sc.nextFloat();
		System.out.println("Sumar o restar S/R");
		opcion = sc.next().charAt(0);
		if(opcion == 'S') System.out.println(primerNumero+segundoNumero);
		else System.out.println(primerNumero-segundoNumero);
	}

	public void validacion() {
		final String usuarioFinal = "qaracter.user";
		final String contraFinal = "hub@2022";
		String usuario;
		String contra;

		int intentos = 0;
		boolean exito = false;

		Scanner sc = new Scanner(System.in);
		while(intentos != 3 && !exito) {
			System.out.println("Ingrese su usuario:");
			usuario = sc.next();
			System.out.println("Ingrese su contraseña:");
			contra = sc.next();
			if (usuario==usuarioFinal && contra==contraFinal) exito = true;
			else {
				intentos++;
				System.out.println("Usuario y/o contraseña incorrecto");
				System.out.println("Le quedan "+ (3-intentos)+" intentos");
			}
		}
		if(exito) System.out.println("Felicidades, has ingresado");
	}

	public void letraYNumeros(){
		char letra;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese una letra:");
		letra = sc.next().charAt(0);
		switch(letra) {
		case 'a':
			System.out.println("7");
			break;
		case 'b':
			System.out.println("9");
			break;
		case 'c':
			System.out.println("101");
			break;
		default:
			System.out.println("Señor usuario, se ha equivocado de letra");
		}
	}

	public String[] ordernarArray(String[] arrayString) {
		String stringAux;

		for(int i =0; i<arrayString.length-1;i++) {
			for (int j=i+1;j<arrayString.length;j++) {
				if(arrayString[i].compareTo(arrayString[j])>0) {
					stringAux = arrayString[i];
					arrayString[i] = arrayString[j];
					arrayString[j] = stringAux;
				}
			}
		}
		return arrayString;
	}

	public void ingresarTiempo() {
		int horas;
		int minutos;
		int segundos;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese la hora");
		horas = sc.nextInt();
		System.out.println("Ingrese los minutos");
		minutos = sc.nextInt();
		System.out.println("Ingrese los segundos");
		segundos = sc.nextInt();

		if(horas<24 && horas>=0 && minutos<60 && minutos >=0 && segundos<60 && segundos >=0) {
			System.out.println("Usted ha ingresado una hora valida: "+horas+minutos+segundos);
		}else System.out.println("Usted no ha ingresado una hora valida");
	}
	public void mesPorTeclado() {
		int mes;
		Scanner sc = new Scanner(System.in);

		System.out.println("Ingrese un numero del mes:");
		mes = sc.nextInt();
		switch(mes){
		case 1:
			System.out.println("El mes es Enero y tiene 31 dias");
			break;
		case 2:
			System.out.println("El mes es Febrero y tiene 28 dias");
			break;
		case 3:
			System.out.println("El mes es Marzo y tiene 31 dias");
			break;
		case 4:
			System.out.println("El mes es Abril y tiene 30 dias");
			break;
		case 5:
			System.out.println("El mes es Mayo y tiene 31 dias");
			break;
		case 6:
			System.out.println("El mes es Junio y tiene 30 dias");
			break;
		case 7:
			System.out.println("El mes es Julio y tiene 31 dias");
			break;
		case 8:
			System.out.println("El mes es Agosto y tiene 30 dias");
			break;
		case 9:
			System.out.println("El mes es Septiembre y tiene 30 dias");
			break;
		case 10:
			System.out.println("El mes es Octubre y tiene 31 dias");
			break;
		case 11:
			System.out.println("El mes es Noviembre y tiene 30 dias");
			break;
		case 12:
			System.out.println("El mes es Diciembre y tiene 31 dias");
			break;
		default:
			System.out.println("Mes invalido");
		}
	}
	
}