package homework;

public class Sarjor {
	int mermiKapasite;
	int mevcutMermi;
	Silah silah;
	Sarjor(int pMermiKapasite,int pMevcutMermi){
		this.mermiKapasite = pMermiKapasite;
		this.mevcutMermi = pMevcutMermi;
	}
	
	String getInfo() {
		String info = "Þarjör mermi kapasite : "+getMermiKapasite() + " Þarjör mevcut mermi : "+getMevcutMermi();
		if(silah != null)
		{
			info += " Silah etkin menzil : "+silah.getEtkinMenzil();
		}
		return info;
	}
	
	public void AtesEt() {
		System.out.println("Ateþleme yapýlýyor...");
		setMevcutMermi(getMevcutMermi()-1);
		System.out.println("Ateþleme yapýldý mevcut mermi : "+getMevcutMermi());
	}
	
	
	public int getMermiKapasite() {
		return mermiKapasite;
	}
	public void setMermiKapasite(int mermiKapasite) {
		this.mermiKapasite = mermiKapasite;
	}
	public int getMevcutMermi() {
		return mevcutMermi;
	}
	public void setMevcutMermi(int mevcutMermi) {
		this.mevcutMermi = mevcutMermi;
	}
	public Silah getSilah() {
		return silah;
	}
	public void setSilah(Silah silah) {
		this.silah = silah;
	}
	
	
}
