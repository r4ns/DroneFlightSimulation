package drone;

public class Drone implements StandardDrone{

	private int x;
	private int y;
	private int z;
	
	private int brojUdarenihIvica = 1;
	
	private String dodatnaPoruka;
	
	private boolean desnaIvica, levaIvica, gornjaIvica, donjaIvica, prednjaIvica, zadnjaIvica;
	private String proveraIvice;
	
	public Drone(){
		
	}

	//Postavljanje pocetnih koordinata drona
	public Drone(int x, int y, int z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	@Override
	public String moveUp() {
		if( y == 50 || ( (x > 10 && x < 40) && (z > 10 && z < 40) && y == 10 )){
			return "Dron ne moze da izvrsi ovu komandu";
		}
		y++;
		
		proveraIvice = "GornjaIvica";
		dodatnaPoruka = proveraIvica(proveraIvice);
		
		return getFormatedCoordinates();
	}

	@Override
	public String moveDown() {
		if( y == 0 || ( (x > 10 && x < 40) && (z > 10 && z < 40) && y == 40 )){
			return "Dron ne moze da izvrsi ovu komandu";
		}
		y--;
		
		proveraIvice = "DonjaIvica";
		dodatnaPoruka = proveraIvica(proveraIvice);	
		
		return getFormatedCoordinates();
	}

	@Override
	public String moveLeft() {
		if( x == 0 || ( (y > 10 && y < 40) && (z > 10 && z < 40) && x == 40 )){
			return "Dron ne moze da izvrsi ovu komandu";
		}
		x--;
		
		proveraIvice = "LevaIvica";
		dodatnaPoruka = proveraIvica(proveraIvice);
		
		return getFormatedCoordinates();
	}

	@Override
	public String moveRight() {
		if( x == 50 || ( (y > 10 && y < 40) && (z > 10 && z < 40) && x == 10 )){
			return "Dron ne moze da izvrsi ovu komandu";
		}
		x++;
		
		proveraIvice = "DesnaIvica";
		dodatnaPoruka = proveraIvica(proveraIvice);
		
		return getFormatedCoordinates();
	}

	@Override
	public String moveBack() {
		if( z == 50 || ( (y > 10 && y < 40) && (x > 10 && x < 40) && z == 10)){
			return "Dron ne moze da izvrsi ovu komandu";
		}
		z++;
		
		proveraIvice = "ZadnjaIvica";
		dodatnaPoruka = proveraIvica(proveraIvice);
		
		return getFormatedCoordinates();
	}

	@Override
	public String moveForth() {
		if( z == 0 || ( (y > 10 && y < 40) && (x > 10 && x < 40) && z == 40)){
			return "Dron ne moze da izvrsi ovu komandu";
		}
		z--;
		
		proveraIvice = "PrednjaIvica";
		dodatnaPoruka = proveraIvica(proveraIvice);
		
		return getFormatedCoordinates();
	}

	@Override
	public String getFormatedCoordinates() {
		
		String poruka = "Drone position: (" + x +  "," + y + "," + z + ")";
		
		poruka = poruka + dodatnaPoruka;
		
		if( x == 0 && y == 30 && z == 30){
			poruka = poruka + "\n Dron je stigao do cilja!!!";
			poruka = poruka + "\n Broj dotaknutih ivica: " + brojUdarenihIvica;
		}
		return poruka;
	}
	
	//provera dotaknutih ivica
	public String proveraIvica(String ivica){
		//desna ivica
		if( x == 50 && !desnaIvica && ivica == "DesnaIvica"){
			brojUdarenihIvica++;
			desnaIvica = true;
			return " --- Dron je udario u desnu ivicu";
		}else if(x != 50){
			desnaIvica = false;
		}
		
		//leva ivica
		if( x == 0 && !levaIvica && ivica == "LevaIvica" ){
			brojUdarenihIvica++;
			levaIvica = true;
			return " --- Dron je udario u levu ivicu";
		}else if (x != 0){
			levaIvica = false;
		}
		
		//gornja ivica
		if( y == 50 && !gornjaIvica && ivica == "GornjaIvica"){
			brojUdarenihIvica++;
			gornjaIvica = true;
			return " --- Dron je udario u gornju ivicu";
		}else if (y != 50){
			gornjaIvica = false;
		}
		
		//donja ivica
		if( y == 0 && !donjaIvica && ivica == "DonjaIvica"){
			brojUdarenihIvica++;
			donjaIvica = true;
			return " --- Dron je udario u donju ivicu";
		}else if (y != 0){
			donjaIvica = false;
		}
		
		//prednja ivica
		if( z == 50 && !zadnjaIvica && ivica == "ZadnjaIvica"){
			brojUdarenihIvica++;
			zadnjaIvica = true;
			return " --- Dron je udario u zadnju ivicu";
		}else if (z != 50){
			zadnjaIvica = false;
		}
		
		//zadnja ivica
		if( z == 0 && !prednjaIvica && ivica == "PrednjaIvica"){
			brojUdarenihIvica++;
			prednjaIvica = true;
			return " --- Dron je udario u prednju ivicu";
		}else if (z != 0){
			prednjaIvica = false;
		}
		
		return "";
	}
	
	
	//Seteri i geteri za koordinate drona
	public int getX() { return x; }

	public int getY() {	return y; }

	public int getZ() {	return z; }

	public void setX(int x) { this.x = x; }

	public void setY(int y) { this.y = y; }

	public void setZ(int z) { this.z = z; }

}
