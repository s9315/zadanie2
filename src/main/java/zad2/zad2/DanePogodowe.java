package zad2.zad2;

public class DanePogodowe implements Podmiot {
	private double temperatura;
	private double wilgotnosc;
	private double cisnienie;
	
	public void Odczyty(double temperatura, double wilgotnosc, double cisnienie){
		this.temperatura = pobierzTemperature();
		this.wilgotnosc = pobierzWilgotnosc();
		this.cisnienie = pobierzCisnienie();
		wyswietl();
	}
		
	private double pobierzCisnienie() {
		return cisnienie;
	}
	private double pobierzWilgotnosc() {
		
		return wilgotnosc;
	}
	private double pobierzTemperature() {
		return temperatura;
	}

public void wyswietl() {
	System.out.println("Warunki biezace "+temperatura+" stopni C i wilgotnosc"+wilgotnosc+"% wilgotnosci i cisnienie"+cisnienie+"hektopaskali");
}
	
	public void DodajWyswietlacz(wyswietl o) {
		
	}
	public void UsunWyswietlacz(wyswietl o) {
		// TODO Auto-generated method stub
		
	}
	public void DaneDoWyswietlacza() {
		// TODO Auto-generated method stub
		
	}

	

}
