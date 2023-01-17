package password;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MainPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Password miPassword = new Password(4);
//		System.out.println(miPassword.contraseña);
//		System.out.println(miPassword.esFuerte());
		
		String passwordAux;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese el tamaño del array de passwords:");
		int tamaño = sc.nextInt();
		Password misPasswords[] = new Password[tamaño];
		Password misPasswordsCopia[] = new Password[tamaño];
		boolean[] esFuerteArray = new boolean[tamaño];
		System.out.println("Ingrese la longitud de las passwords:");
		tamaño = sc.nextInt();
	
		for(int i=0;i<misPasswords.length;i++) {
			misPasswords[i] = new Password(tamaño);
			misPasswordsCopia[i] = new Password(misPasswords[i]);
		}
		
		

		for(int i =0; i<misPasswordsCopia.length-1;i++) {
			for (int j=i+1;j<misPasswordsCopia.length;j++) {
				if(misPasswordsCopia[i].getContraseña().compareTo(misPasswordsCopia[j].getContraseña())>0) {
					passwordAux = misPasswordsCopia[i].getContraseña();
					misPasswordsCopia[i].setContraseña(misPasswordsCopia[j].getContraseña());
					misPasswordsCopia[j].setContraseña(passwordAux);
				}
				esFuerteArray[i] = misPasswordsCopia[i].esFuerte();
			}
		}
		System.out.println("Array de contraseñas:");
		for(int i=0;i<misPasswordsCopia.length;i++) {
			System.out.println(misPasswordsCopia[i]);
		}
		System.out.println();
		for(int i=0;i<misPasswords.length;i++) {
			System.out.println(misPasswords[i]);
		}
		System.out.println();
		for(int i=0;i<esFuerteArray.length;i++) {
			System.out.println(misPasswordsCopia[i].getContraseña()+" "+esFuerteArray[i]);
		}
		
		
	}

}
