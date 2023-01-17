package password;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MainPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Password miPassword = new Password(4);
//		System.out.println(miPassword.contrase�a);
//		System.out.println(miPassword.esFuerte());
		
		String passwordAux;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese el tama�o del array de passwords:");
		int tama�o = sc.nextInt();
		Password misPasswords[] = new Password[tama�o];
		Password misPasswordsCopia[] = new Password[tama�o];
		boolean[] esFuerteArray = new boolean[tama�o];
		System.out.println("Ingrese la longitud de las passwords:");
		tama�o = sc.nextInt();
	
		for(int i=0;i<misPasswords.length;i++) {
			misPasswords[i] = new Password(tama�o);
			misPasswordsCopia[i] = new Password(misPasswords[i]);
		}
		
		

		for(int i =0; i<misPasswordsCopia.length-1;i++) {
			for (int j=i+1;j<misPasswordsCopia.length;j++) {
				if(misPasswordsCopia[i].getContrase�a().compareTo(misPasswordsCopia[j].getContrase�a())>0) {
					passwordAux = misPasswordsCopia[i].getContrase�a();
					misPasswordsCopia[i].setContrase�a(misPasswordsCopia[j].getContrase�a());
					misPasswordsCopia[j].setContrase�a(passwordAux);
				}
				esFuerteArray[i] = misPasswordsCopia[i].esFuerte();
			}
		}
		System.out.println("Array de contrase�as:");
		for(int i=0;i<misPasswordsCopia.length;i++) {
			System.out.println(misPasswordsCopia[i]);
		}
		System.out.println();
		for(int i=0;i<misPasswords.length;i++) {
			System.out.println(misPasswords[i]);
		}
		System.out.println();
		for(int i=0;i<esFuerteArray.length;i++) {
			System.out.println(misPasswordsCopia[i].getContrase�a()+" "+esFuerteArray[i]);
		}
		
		
	}

}
