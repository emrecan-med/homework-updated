package homework;

public class Test {

	public static void main(String[] args) {
		Silah silah = new Silah(100);
		Sarjor sarjor = new Sarjor(50,30);
		
		silah.sarjor = sarjor;
		sarjor.silah = silah;

		System.out.println(silah.getInfo());
		
		System.out.println("-----------------------------------");
		System.out.println("-----------Silah Atesleme----------");
		System.out.println("-----------------------------------");
		
		silah.atesEt(50);
		
		
		System.out.println("-----------------------------------");
		System.out.println("----------Sarjör Atesleme----------");
		System.out.println("-----------------------------------");
		
		sarjor.AtesEt();
	

		

	}

}
