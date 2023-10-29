
public class Test {

	public static void main(String[] args) {
		
		for (int i = 1; i <=10; i++) {
			for (int j = 1; j <=10; j++) {
				System.out.println(i+"x"+j+"="+(i*j));
			}
			System.out.println("------------");
		}

	}

}

// Bir döngüden çıkıldıktan sonra tekrar girilirse değer baştan başlar.

// ÖRNEK:  2.döngüye girince j 10 olana kadar döngü orada devam eder. 
// Sonra tekrar 2.for döngüsüne girilince j yeniden 1 den başlar.
