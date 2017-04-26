package space;
 import drone.*;
 
 
 
 public class DoubleCubeDrone extends Drone{
	 
	 FlySpace flyspace=new FlySpace();
	 protected int[] coordinates;
	 int [] boundaries=flyspace.getOuterBoundaries();
	 protected int space=flyspace.getSpace();
	 
	 public DoubleCubeDrone(){
		 
	 }
	 
	 public DoubleCubeDrone(int [] coordinates){
		 this.coordinates=coordinates;
	}

	 public DoubleCubeDrone(int [] coordinates, int [] boundaries, int space){
		 this.coordinates=coordinates;
		 this.boundaries=boundaries;
		 this.space=space;
	 }
	 
	 public String moveUp(){
			
		 if(coordinates[0]>=space-1 && coordinates[0]<boundaries[0]-space-1 && coordinates[2]>space && coordinates[2]<boundaries[2]-space && coordinates[1]++>=0 && coordinates[1]<space-2){//donja_1

				coordinates[1]++;
				return getFormatedCoordinates();
				

			}else if(coordinates[0]>=boundaries[0]-space-1 && coordinates[0]<boundaries[0]-space && coordinates[2]>space && coordinates[2]<boundaries[2]-space && coordinates[1]>=0 && coordinates[1]<space-1){//donja_2

				coordinates[1]++;     
				return getFormatedCoordinates();

			} else if(coordinates[0]>space && coordinates[0]<boundaries[0]-space && coordinates[2]>space && coordinates[2]<boundaries[2]-space && coordinates[1]>=40 && coordinates[1]<boundaries[1]-2){//gornja_1

				coordinates[1]++;    
				return getFormatedCoordinates();

			}else if(coordinates[0]>=space-1 && coordinates[0]<boundaries[0]-space && coordinates[2]>10 && coordinates[2]<boundaries[2]-space && coordinates[1]>=40 && coordinates[1]<boundaries[1]-2){//gornja_2

				coordinates[1]++;      
				return getFormatedCoordinates();


			} else if (coordinates[0]>=0 && coordinates[0]<=space-2 && coordinates[2]>=space && coordinates[2]<=boundaries[2]-space && coordinates[1]>=0 && coordinates[1]<boundaries[1]-2){ //leva

				coordinates[1]++;
				return getFormatedCoordinates();

			} else if (coordinates[0]>=boundaries[0]-space && coordinates[0]<=boundaries[0]-2 && coordinates[2]>=space && coordinates[2]<=boundaries[2]-space && coordinates[1]>=0 && coordinates[1]<boundaries[1]-2){//desna

				coordinates[1]++;
				return getFormatedCoordinates();


			} else if (coordinates[0]>=0 && coordinates[0]<=boundaries[0] && coordinates[2]>=boundaries[2]-space && coordinates[2]<=boundaries[2] && coordinates[1]>=0 && coordinates[1]<boundaries[1]-2){//napred

				coordinates[1]++;
				System.out.println(getFormatedCoordinates());


			} else if (coordinates[0]>=0 && coordinates[0]<=boundaries[0] && coordinates[2]>=0 && coordinates[2]<=space && coordinates[1]>=0 && coordinates[1]<boundaries[1]-2){ //nazad

				coordinates[1]++;
				return getFormatedCoordinates();
			} else {

				return getFormatedCoordinates();
			}
		 return getFormatedCoordinates();
		}
		
		public String moveDown(){
			
			 if(coordinates[0]>=space && coordinates[0]<boundaries[0]-space && coordinates[2]>=space && coordinates[2]<=boundaries[2]-space && coordinates[1]>0 && coordinates[1]<=space){//donja_1

					coordinates[1]--;
					return getFormatedCoordinates();
					

				}else if(coordinates[0]>=space && coordinates[0]<=boundaries[0]-space && coordinates[2]>=space && coordinates[2]<=boundaries[2]-space && coordinates[1]>boundaries[1]-space && coordinates[1]<=boundaries[1] ){//donja_2

					coordinates[1]--;   
					return getFormatedCoordinates();

				} else if(coordinates[0]>=space-1 && coordinates[0]<boundaries[0]-space && coordinates[2]>=space && coordinates[2]<=boundaries[2]-space && coordinates[1]>boundaries[1]-space && coordinates[1]<=boundaries[1]){//gornja_1

					coordinates[1]--;    
					return getFormatedCoordinates();

				}else if(coordinates[0]>=0 && coordinates[0]<=space-2 && coordinates[2]>=space && coordinates[2]<=boundaries[2]-space && coordinates[1]>0 && coordinates[1]<=boundaries[1]){//gornja_2

					coordinates[1]--;       
					return getFormatedCoordinates();


				} else if (coordinates[0]>=boundaries[0]-space && coordinates[0]<=boundaries[0] && coordinates[2]>=space && coordinates[2]<=boundaries[2]-space && coordinates[1]>0 && coordinates[1]<=boundaries[1]){ //leva

					coordinates[1]--; 
					return getFormatedCoordinates();

				} else if (coordinates[0]>=0 && coordinates[0]<=boundaries[0] && coordinates[2]>=boundaries[2]-space && coordinates[2]<=boundaries[2] && coordinates[1]>0 && coordinates[1]<=boundaries[1]){//desna

					coordinates[1]--; 
					return getFormatedCoordinates();

				} else if (coordinates[0]>=space && coordinates[0]<=boundaries[0]-space && coordinates[2]>=0 && coordinates[2]<=space && coordinates[1]>0 && coordinates[1]<boundaries[1]){ //nazad

					coordinates[1]--;
					return getFormatedCoordinates();
				} else {

					return getFormatedCoordinates();
				}
			}
 
		public String moveLeft() {

			if(coordinates[1]>=0 && coordinates[1]<=space-2 && coordinates[2]>=0 && coordinates[2]<=boundaries[2] && coordinates[0]>=1 && coordinates[0]<boundaries[0]){ //dole

				coordinates[0]--;
				return getFormatedCoordinates();

			} else if(coordinates[1]>space && coordinates[1]<boundaries[1]-space && coordinates[2]>space && coordinates[2]<boundaries[2]-space && coordinates[0]>=1 && coordinates[0]<=space-2){ //levo

				coordinates[0]--;
				return getFormatedCoordinates();

			} else if(coordinates[1]>space && coordinates[1]<boundaries[1]-space && coordinates[2]>space && coordinates[2]<boundaries[2]-space && coordinates[0]>boundaries[0]-space && coordinates[0]<=boundaries[0]-2){ //desna_1

				coordinates[0]--;
				return getFormatedCoordinates();

			}else if(coordinates[1]>space-1 && coordinates[1]<space && coordinates[2]>space && coordinates[2]<boundaries[2]-space && coordinates[0]>boundaries[0]-space-1 && coordinates[0]<=boundaries[0]){ //desna_2

				coordinates[0]--;
				return getFormatedCoordinates();

			}else if(coordinates[1]>=boundaries[1]-space && coordinates[1]<=boundaries[1] && coordinates[2]>=0 && coordinates[2]<=boundaries[2] && coordinates[0]>=1 && coordinates[0]<=boundaries[0]){ //gore

				coordinates[0]--;
				return getFormatedCoordinates();

			}else if(coordinates[1]>=0 && coordinates[1]<=boundaries[1] && coordinates[2]>=boundaries[2]-space && coordinates[2]<= boundaries[2] && coordinates[0]>=1 && coordinates[0]<=boundaries[0]){ //napred

				coordinates[0]--;
				return getFormatedCoordinates();

			}else if(coordinates[1]>=0 && coordinates[1]<=boundaries[1] && coordinates[2]>=0 && coordinates[2]<=space && coordinates[0]>=1 && coordinates[0]<=boundaries[0]){ //nazad

				coordinates[0]--;
				return getFormatedCoordinates();

			} else {

				return getFormatedCoordinates();
			}
		}
		
		public String moveRight() {

				if(coordinates[1]>space && coordinates[1]<boundaries[1]-space && coordinates[2]>space && coordinates[2]<boundaries[2]-space && coordinates[0]>=0 && coordinates[0]<space-2){ //levo

					coordinates[0]++;
					return getFormatedCoordinates();

				} else if(coordinates[1]>space && coordinates[1]<boundaries[1]-space && coordinates[2]>space && coordinates[2]<boundaries[2]-space && coordinates[0]>=boundaries[0]-space && coordinates[0]<boundaries[0]-2){ //desno

					coordinates[0]++;
					return getFormatedCoordinates();
				}else if(coordinates[1]>=0 && coordinates[1]<=space && coordinates[2]>=space && coordinates[2]<=boundaries[2]-space && coordinates[0]>=0 && coordinates[0]<boundaries[0]-2){ //dole

					coordinates[0]++;
					return getFormatedCoordinates();
				} else if(coordinates[1]>=boundaries[1]-space && coordinates[1]<=boundaries[1] && coordinates[2]>=space && coordinates[2]<=boundaries[2]-space && coordinates[0]>=0 && coordinates[0]<boundaries[0]-2){ //gore_1

					coordinates[0]++;
					return getFormatedCoordinates();
				} else if(coordinates[1]>=boundaries[1]-space-1 && coordinates[1]<=boundaries[1] && coordinates[2]>=space && coordinates[2]<=boundaries[2]-space && coordinates[0]>=0 && coordinates[0]<space-1){ //gore_2

					coordinates[0]++;
					return getFormatedCoordinates();
				} else if(coordinates[1]>=0 && coordinates[1]<=boundaries[1] && coordinates[2]>=0 && coordinates[2]<=space && coordinates[0]>=0 & coordinates[0]<boundaries[0]-2){ //nazad

					coordinates[0]++;
					return getFormatedCoordinates();
				}else if(coordinates[1]>=0 && coordinates[1]<=boundaries[1] && coordinates[2]>boundaries[2]-space && coordinates[2]<=boundaries[2] && coordinates[0]>=0 && coordinates[0]<boundaries[0]-2){ //napred

					coordinates[0]++;
					return getFormatedCoordinates();
				} else {

					return getFormatedCoordinates();
				}

		 }
		 
		 public String moveBack() {

				if(coordinates[1]>=0 && coordinates[1]<=space-2 && coordinates[0]>=space-1 && coordinates[0]<boundaries[0]-space-1 && coordinates[2]>=0 && coordinates[2]<boundaries[2]-1){ //dole_1

					coordinates[2]++;
					return getFormatedCoordinates();
				}else if(coordinates[1]>=0 && coordinates[1]<=space-1 && coordinates[0]>=boundaries[0]-space-1 && coordinates[0]<boundaries[0]-space && coordinates[2]>=0 && coordinates[2]<boundaries[2]-1){ //dole_2

					coordinates[2]++;
					return getFormatedCoordinates();

				} else if(coordinates[1]>space && coordinates[1]<boundaries[1]-space && coordinates[0]>space && coordinates[0]<boundaries[0]-space && coordinates[2]>=boundaries[2]-space && coordinates[2]<boundaries[2]-1){ //napred

					coordinates[2]++;
					return getFormatedCoordinates();

				}else if(coordinates[1]>space && coordinates[1]<boundaries[1]-space && coordinates[0]>space && coordinates[0]<boundaries[0]-space && coordinates[2]>=0 && coordinates[2]<space-1){ //nazad

					coordinates[2]++;
					return getFormatedCoordinates();

				}else if(coordinates[1]>=boundaries[1]-space && coordinates[1]<=boundaries[1] && coordinates[0]>=0 && coordinates[0]<=boundaries[0] && coordinates[2]>=0 && coordinates[2]<boundaries[2]-1){ //gore_1

					coordinates[2]++;
					return getFormatedCoordinates();

				}else if(coordinates[1]>=boundaries[1]-space-1 && coordinates[1]<=boundaries[1] && coordinates[0]>=0 && coordinates[0]<=space-1 && coordinates[2]>=0 && coordinates[2]<boundaries[2]-1){ //gore_2

					coordinates[2]++;
					return getFormatedCoordinates();

				}else if(coordinates[1]>=0 && coordinates[1]<=boundaries[1] && coordinates[0]>=0 && coordinates[0]<=space-2 && coordinates[2]>=0 && coordinates[2]<boundaries[2]-1){ //levo

					coordinates[2]++;
					return getFormatedCoordinates();

				}else if(coordinates[1]>=0 && coordinates[1]<=boundaries[1] && coordinates[0]>=boundaries[0]-space && coordinates[0]<=boundaries[0]-2 && coordinates[2]>=0 && coordinates[2]<boundaries[2]-1){ //desno

					coordinates[2]++;
					return getFormatedCoordinates();

				} else {

					return getFormatedCoordinates();
				}
		 }
		
		 public String moveForth() {

				if(coordinates[1]>=0 && coordinates[1]<=space-2 && coordinates[0]>=space-1 && coordinates[0]<boundaries[0]-space-1 && coordinates[2]>=1 && coordinates[2]<boundaries[2]-1){ //dole_1

					coordinates[2]--;
					return getFormatedCoordinates();
				}else if(coordinates[1]>=0 && coordinates[1]<=space-1 && coordinates[0]>=boundaries[0]-space-1 && coordinates[0]<boundaries[0]-space && coordinates[2]>=1 && coordinates[2]<boundaries[2]-1){ //dole_2

					coordinates[2]--;
					return getFormatedCoordinates();

				} else if(coordinates[1]>space && coordinates[1]<boundaries[1]-space && coordinates[0]>space && coordinates[0]<boundaries[0]-space && coordinates[2]>boundaries[2]-space && coordinates[2]<boundaries[2]-1){ //napred

					coordinates[2]--;
					return getFormatedCoordinates();

				}else if(coordinates[1]>space && coordinates[1]<boundaries[1]-space && coordinates[0]>space && coordinates[0]<boundaries[0]-space && coordinates[2]>=1 && coordinates[2]<space-1){ //nazad

					coordinates[2]--;
					return getFormatedCoordinates();

				}else if(coordinates[1]>=boundaries[1]-space && coordinates[1]<=boundaries[1] && coordinates[0]>=0 && coordinates[0]<=boundaries[0] && coordinates[2]>=1 && coordinates[2]<boundaries[2]-1){ //gore_1

					coordinates[2]--;
					return getFormatedCoordinates();

				}else if(coordinates[1]>=boundaries[1]-space-1 && coordinates[1]<=boundaries[1] && coordinates[0]>=0 && coordinates[0]<=space-1 && coordinates[2]>=1 && coordinates[2]<boundaries[2]-1){ //gore_2

					coordinates[2]--;
					return getFormatedCoordinates();

				}else if(coordinates[1]>=0 && coordinates[1]<=boundaries[1] && coordinates[0]>=0 && coordinates[0]<=space-2 && coordinates[2]>=1 && coordinates[2]<boundaries[2]-1){ //levo

					coordinates[2]--;
					return getFormatedCoordinates();

				}else if(coordinates[1]>=0 && coordinates[1]<=boundaries[1] && coordinates[0]>=boundaries[0]-space && coordinates[0]<=boundaries[0]-2 && coordinates[2]>=1 && coordinates[2]<boundaries[2]-1){ //desno

					coordinates[2]--;
					return getFormatedCoordinates();

				} else {

					return getFormatedCoordinates();
				}

		 }


	 	public String getFormatedCoordinates(){
			// TODO Auto-generated method stub
			return "("+coordinates[0]+","+coordinates[1]+","+coordinates[2]+")";
		}
	}