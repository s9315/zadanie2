package zad2.zad2;

import java.io.IOException;

public class Meteo {



	public static void main(String[] args){
		DanePogodowe x = new DanePogodowe();
		Wyswietlanie y = new Wyswietlanie(x); 
		
		x.Odczyty(26, 58, 1060);
		x.Odczyty(25.5, 44, 966);
		x.Odczyty(23.4, 88, 1210);
	}

}
