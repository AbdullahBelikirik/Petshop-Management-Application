
public class Araba {

	
	private String renk;
	private int kapilar;
	private int tekerler;
	private String motor;
	private String model;
	
	
	
	
	public void setModel(String model) {
		
		this.model = model;
		
	}
	public String getModel() {
		
		return this.model;
	}
	
	public void setKapilar(int kapilar) {
		if (kapilar< 0) {
			System.out.println("kapi sayisi negatif olamaz!!");
		}
		else {
			this.kapilar = kapilar;
		}
		
		
	}
	public String getKapilar() {
		
		return this.kapilar;
	}
	
}
