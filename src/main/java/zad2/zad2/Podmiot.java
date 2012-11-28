package zad2.zad2;

public interface Podmiot {
	public void DodajWyswietlacz(wyswietl o);
	public void UsunWyswietlacz(wyswietl o);
	public void DaneDoWyswietlacza();
}
	interface aktualizacja{
	public void akt(double temperatura, double Wilgotnosc, double Cisnienie);
	
	}
	
	interface showing{
		void show();
	}