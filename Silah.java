package homework;

public class Silah {
	Sarjor sarjor;
	int etkinMenzil;
	
	Silah(int pEtkinMenzil){
		this.etkinMenzil = pEtkinMenzil;
	}
	
	String getInfo() {
		String info = "Silah etkin menzili : "+etkinMenzil;
		if(sarjor != null)
		{
			info += " Þarjör kapasite : "+sarjor.getMermiKapasite()+" Þarjör mevcut mermi : "+sarjor.getMevcutMermi();
		}
		return info;
	}
	public void atesEt(int hedefMenzil) {
		if(hedefMenzil > getEtkinMenzil())
		{
			System.out.println("Ateþleme yapýlýyor...");
			sarjor.setMevcutMermi(sarjor.getMevcutMermi()-1);
			System.out.println("Ateþleme yapýldý mevcut mermi : "+sarjor.getMevcutMermi());
			System.out.println("Hedef imha edilemedi. Etkin menzil : "+getEtkinMenzil()+" Hedef menzili : "+hedefMenzil);
		}
		else 
		{
			System.out.println("Ateþleme yapýlýyor...");
			sarjor.setMevcutMermi(sarjor.getMevcutMermi()-1);
			System.out.println("Ateþleme yapýldý mevcut mermi : "+sarjor.getMevcutMermi());
			System.out.println("Hedef imha edildi.");
		}
	}

	public Sarjor getSarjor() {
		return sarjor;
	}

	public void setSarjor(int pKapasite,int pMevcutMermi) {
		new Sarjor(pKapasite,pMevcutMermi);
		
	}

	public int getEtkinMenzil() {
		return etkinMenzil;
	}

	public void setEtkinMenzil(int etkinMenzil) {
		this.etkinMenzil = etkinMenzil;
	}
	
	
	
}
