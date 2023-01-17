package password;

import java.nio.charset.Charset;
import java.util.Random;

public class Password {
	protected int longitud = 8;
	protected String contrase�a;
	
	public Password() {
		super();
	}
	public Password(int longitud, String contrase�a) {
		super();
		this.longitud = longitud;
		this.contrase�a = contrase�a;
	}

	public Password(int longitud) {
		super();
		this.longitud = longitud;
		this.contrase�a = generarPassword();
	}
	public Password(Password password) {
		this.longitud = password.longitud;
		this.contrase�a = password.contrase�a;
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContrase�a() {
		return contrase�a;
	}

	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}
	
	
	
	@Override
	public String toString() {
		return "Password [longitud=" + longitud + ", contrase�a=" + contrase�a + "]";
	}
	public boolean esFuerte() {
		int contarMayus = 0;
		int contarMinus = 0;
		int contarDigitos = 0;
		char caracter;
		
		for (int i=0;i<this.contrase�a.length();i++) {
			caracter = this.contrase�a.charAt(i);
			if(Character.isDigit(caracter)) contarDigitos++;
			if(Character.isUpperCase(caracter)) contarMayus++;
			if(Character.isLowerCase(caracter)) contarMinus++;
		}
		return contarMayus>2 && contarMinus>1 && contarDigitos>5;
	}
	protected String generarPassword() {
		String password = "";
		Random random = new Random();
		for(int i=0;i<this.longitud;i++) {
			password+= (char)(random.nextInt(91)+65);
		}
		return password;
	}
	
}
