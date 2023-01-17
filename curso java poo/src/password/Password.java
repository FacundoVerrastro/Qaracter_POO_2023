package password;

import java.nio.charset.Charset;
import java.util.Random;

public class Password {
	protected int longitud = 8;
	protected String contraseña;
	
	public Password() {
		super();
	}
	public Password(int longitud, String contraseña) {
		super();
		this.longitud = longitud;
		this.contraseña = contraseña;
	}

	public Password(int longitud) {
		super();
		this.longitud = longitud;
		this.contraseña = generarPassword();
	}
	public Password(Password password) {
		this.longitud = password.longitud;
		this.contraseña = password.contraseña;
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
	
	
	@Override
	public String toString() {
		return "Password [longitud=" + longitud + ", contraseña=" + contraseña + "]";
	}
	public boolean esFuerte() {
		int contarMayus = 0;
		int contarMinus = 0;
		int contarDigitos = 0;
		char caracter;
		
		for (int i=0;i<this.contraseña.length();i++) {
			caracter = this.contraseña.charAt(i);
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
