package space;

public class FlySpace {
	
	private int granica=50;
	private int unutrasnjaGranica=10;
	
	public FlySpace(int x,int u){
		
		granica=x;
		unutrasnjaGranica=u;
		
		
		
	}

	public int getGranica() {
		return granica;
	}

	public int getUnutrasnjaGranica() {
		return unutrasnjaGranica;
	}

	public void setGranica(int granica) {
		this.granica = granica;
	}

	public void setUnutrasnjaGranica(int unutrasnjaGranica) {
		this.unutrasnjaGranica = unutrasnjaGranica;
	}
	
}
