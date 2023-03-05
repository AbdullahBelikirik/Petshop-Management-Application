
public class Test {

	public static void main(String[] args) {
		
		Araba araba1= new Araba();
		
	/*	public String renk; yazarsam
	 * 
	 * araba1.renk ="siyah";
		araba1.kapilar= 2;
		
		System.out.println(araba1.renk);
		
	*/	
		
		// ama private String renk; yazarsam
		
		araba1.setModel("BMW");
		
		System.out.println("Arabanin modeli "+ araba1.getModel());
		
		
		araba1.setKapilar(-1);
		
		Araba araba3 = null;
		
		
		
	}

}
