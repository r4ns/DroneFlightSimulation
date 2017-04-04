package space;

public class FlySpace {
	
	int unutrasnjaDonjaGranica;
	int unutrasnjaGornjaGranica;
	int spoljasnjaDonjaGranica;
	int spoljasnjaGornjaGranica;
	
	public FlySpace(int unutrasnjaDonjaGranica, int unutrasnjaGornjaGranica, int spoljasnjaDonjaGranica, int spoljasnjaGornjaGranica){
		this.spoljasnjaDonjaGranica = spoljasnjaDonjaGranica;
		this.spoljasnjaGornjaGranica = spoljasnjaGornjaGranica;
		this.unutrasnjaDonjaGranica = unutrasnjaDonjaGranica;
		this.unutrasnjaGornjaGranica = unutrasnjaGornjaGranica;
	}
	
	public boolean unutrasnjaKocka(int n1, int n2){
		if((n1 >= unutrasnjaDonjaGranica  && n1<=unutrasnjaGornjaGranica) && (n2>=unutrasnjaDonjaGranica && n2<=unutrasnjaGornjaGranica)){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean kretanjeGore(int x, int osaPomeranja, int z){
		if (unutrasnjaKocka(x, z) && osaPomeranja < spoljasnjaGornjaGranica) {
			if(osaPomeranja == unutrasnjaDonjaGranica){
				return false;
			}else{
				return true;
			}
		}else {
			if(osaPomeranja < spoljasnjaGornjaGranica){
				return true;
			} else{
				return false;
			}
		}
	}
	
	public boolean kretanjeDole(int x, int y, int z){
		if (unutrasnjaKocka(x, z) && y > spoljasnjaDonjaGranica) {
			if(y == unutrasnjaGornjaGranica){
				return false;
			}else{
				return true;
			}
		}else {
			if(y > spoljasnjaDonjaGranica){
				return true;
			} else{
				return false;
			}
		}
	}
	
}
