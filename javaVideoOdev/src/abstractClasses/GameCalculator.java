package abstractClasses;

public abstract class GameCalculator {
	public abstract void hesapla() ;//hesapla imzasý olmak zorunda ama kullanýcý türüne göre deðiþecek
	//abstarct sýnýflar asla newlenemez
	//override yapýlabilir new ilw ama bunu kullanma
	public final void gameOver() {
		System.out.println("oyun bitti");
	}
	

}
