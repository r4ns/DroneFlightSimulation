package space;

public class FlySpace {
	int okvir[] = new int[3];
	int razmak[] = new int[3];
	
	private int uGranica1[] = new int[3];
	private int uGranica2[] = new int[3];
	private int sGranica1[] = new int[3];
	private int sGranica2[] = new int[3];
	
	public FlySpace(){
		for(int i = 0; i < 3; i++){
			okvir[i] = 50;
			razmak[i] = 10;
		}
		napraviGranice();
		
	}
	
	public FlySpace(int okvir, int razmak){
		for(int i = 0; i < 3; i++){
			this.okvir[i] = okvir;
			this.razmak[i] = razmak;
		}
		napraviGranice();
		
	}
	
	public FlySpace(int okvir[], int razmak[]){
		if(okvir.length < 3 || razmak.length < 3){
			System.out.println("greska niz manji od 3!");
			for(int i = 0; i < 3; i++){
				okvir[i] = 50;
				razmak[i] = 10;
			}
			return;	
		}
		for(int i = 0; i < 3; i++){
			this.okvir[i] = okvir[i];
			this.razmak[i] = razmak[i];
		}
		napraviGranice();
	}

	/*private int uGranica1 = 10;
	private int uGranica2 = 40;
	private int sGranica1 = 0;
	private int sGranica2 = 50;*/
	
	private void napraviGranice(){
		for(int i = 0; i < 3; i ++){
			sGranica1[i] = 0;
			sGranica2[i] = okvir[i];
			uGranica1[i] = razmak[i];
			uGranica2[i] = okvir[i] - razmak[i];
		}
	}
	
	public String graniceString(){
		String s = "";
		for(int i = 0; i < 3; i ++){
			s = s + sGranica1[i] + "," + uGranica1[i] + "," + uGranica2[i] + "," + sGranica2[i]+"---";
		}
		return s;
	}
	
	public int[] getOkvir() {
		return okvir;
	}

	public void setOkvir(int[] okvir) {
		this.okvir = okvir;
	}

	public int[] getRazmak() {
		return razmak;
	}

	public void setRazmak(int[] razmak) {
		this.razmak = razmak;
	}

	public int[] getuGranica1() {
		return uGranica1;
	}

	public void setuGranica1(int[] uGranica1) {
		this.uGranica1 = uGranica1;
	}

	public int[] getuGranica2() {
		return uGranica2;
	}

	public void setuGranica2(int[] uGranica2) {
		this.uGranica2 = uGranica2;
	}

	public int[] getsGranica1() {
		return sGranica1;
	}

	public void setsGranica1(int[] sGranica1) {
		this.sGranica1 = sGranica1;
	}

	public int[] getsGranica2() {
		return sGranica2;
	}

	public void setsGranica2(int[] sGranica2) {
		this.sGranica2 = sGranica2;
	}
	
	
}
