
public class Course1 {
int distance, par;
public Course1(){	
}

public void SpecifyTee(int tee){
	switch(tee){
		case 1:System.out.println("You are at the first tee. 530 yards, par 5.");break;
		case 2:System.out.println("You are at the second tee. 305 yards, par 4.");break;
		case 3:System.out.println("You are at the third tee. 331 yards, par 4.");break;
		case 4:System.out.println("You are at the fourth tee. 201 yards, par 3.");break;
		case 5:System.out.println("You are at the fifth tee. 500 yards, par 5.");break;
		case 6:System.out.println("You are at the sixth tee. 226 yards, par 3.");break;
		case 7:System.out.println("You are at the seventh tee. 409 yards, par 4.");break;
		case 8:System.out.println("You are at the eighth tee. 410 yards, par 4.");break;
		case 9:System.out.println("You are at the ninth tee. 229 yards, par 3.");break;
		case 10:System.out.println("You are at the tenth tee. 433 yards, par 4.");break;
		case 11:System.out.println("You are at the eleventh tee. 363 yards, par 4.");break;
		case 12:System.out.println("You are at the twelfth tee. 174 yards, par 3.");break;
		case 13:System.out.println("You are at the thirteenth tee. 545 yards, par 5.");break;
		case 14:System.out.println("You are at the fourteenth tee. 419 yards, par 4.");break;
		case 15:System.out.println("You are at the fifteenth tee. 512 yards, par 5.");break;
		case 16:System.out.println("You are at the sixteenth tee. 410 yards, par 4.");break;
		case 17:System.out.println("You are at the seventeenth tee. 320 yards, par 4.");break;
		case 18:System.out.println("You are at the eighteenth tee. 170 yards, par 3.");
	}}
	public void setYards(int tee){
		switch(tee){
			case 1:distance= 530; par=5;break;
			case 2:distance=305; par= 4;break;
			case 3:distance=331 ; par=  4;break;
			case 4:distance=201; par=  3;break;
			case 5:distance=500 ; par=  5;break;
			case 6:distance= 226; par=  3;break;
			case 7:distance=409 ; par= 4;break;
			case 8:distance=410; par= 4;break;
			case 9:distance=229; par=  3;break;
			case 10:distance= 433; par=  4;break;
			case 11:distance=363 ; par=  4;break;
			case 12:distance=174; par= 3;break;
			case 13:distance= 545; par=  5;break;
			case 14:distance=419; par=  4;break;
			case 15:distance= 512 ; par=  5;break;
			case 16:distance=410 ; par=  4;break;
			case 17:distance=320; par= 4;break;
			case 18:distance=170; par=  3;
		
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
