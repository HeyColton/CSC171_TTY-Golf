
public class Course2 {
int distance, par;
public Course2(){	
}
public void SpecifyTee(int tee){
	switch(tee){
		case 1:System.out.println("You are at the first tee. 376 yards, par 4.");break;
		case 2:System.out.println("You are at the second tee. 453 yards, par 4.");break;
		case 3:System.out.println("You are at the third tee. 397 yards, par 4.");break;
		case 4:System.out.println("You are at the fourth tee. 480 yards, par 4.");break;
		case 5:System.out.println("You are at the fifth tee. 568 yards, par 5.");break;
		case 6:System.out.println("You are at the sixth tee. 412 yards, par 4.");break;
		case 7:System.out.println("You are at the seventh tee. 371 yards, par 4.");break;
		case 8:System.out.println("You are at the eighth tee. 175 yards, par 3.");break;
		case 9:System.out.println("You are at the ninth tee. 352 yards, par 4.");break;
		case 10:System.out.println("You are at the tenth tee. 386 yards, par 4.");break;
		case 11:System.out.println("You are at the eleventh tee. 174 yards, par 3.");break;
		case 12:System.out.println("You are at the twelfth tee. 348 yards, par 4.");break;
		case 13:System.out.println("You are at the thirteenth tee. 465 yards, par 4.");break;
		case 14:System.out.println("You are at the fourteenth tee. 618 yards, par 5.");break;
		case 15:System.out.println("You are at the fifteenth tee. 455 yards, par 4.");break;
		case 16:System.out.println("You are at the sixteenth tee. 423 yards, par 4.");break;
		case 17:System.out.println("You are at the seventeenth tee. 495 yards, par 4.");break;
		case 18:System.out.println("You are at the eighteenth tee. 357 yards, par 4.");
	}}
	public void setYards(int tee){
		switch(tee){
			case 1:distance= 376; par=4;break;
			case 2:distance=453; par= 4;break;
			case 3:distance=397 ; par=  4;break;
			case 4:distance=480; par=  4;break;
			case 5:distance=568 ; par=  5;break;
			case 6:distance= 412; par=  4;break;
			case 7:distance=371 ; par= 4;break;
			case 8:distance=175; par= 3;break;
			case 9:distance=352; par=  4;break;
			case 10:distance= 386; par=  4;break;
			case 11:distance=174 ; par=  3;break;
			case 12:distance=348; par= 4;break;
			case 13:distance= 465; par=  4;break;
			case 14:distance=618; par=  5;break;
			case 15:distance= 455 ; par=  4;break;
			case 16:distance=423 ; par=  4;break;
			case 17:distance=495; par= 4;break;
			case 18:distance=357; par=  4;
		
	}
		
}
	public int getDistance(){
		return distance;
	}
	public int getPar(){
		return par;
	}
public void setDistance(int distance){
	this.distance=distance;
}



}
