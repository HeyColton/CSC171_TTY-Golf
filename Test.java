/*Name:Xiaoyu Zheng
 * Project number:2
 * Lab Section: Mon 12:30
 * Lab TAs: Camllo, Jack Venuti
 * I did not collaborate with anyone on this assignment
 */

import java.util.Random;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Boolean playAgain=true;
		int WholeDistance;

		Scanner in=new Scanner(System.in);
		//it's a big while loop that will continues when the player wants to play
		//the ask sentence is at the end of the main method
while(playAgain==true){
	System.out.println("Welcome to TTF Golf world!");
    System.out.println("Please select a course:");
    System.out.println("1. Genesee Valley Park North Course");
    System.out.println("2. The Old Course at St. Andrews");
    System.out.println("You choice [1-2]:");
    //distance stands for the distance between the ball and the hole
		int distance=0;
	//nextDistance is the distance the ball travels each time
		int nextDistance;
	//club is club number, and power is the power when you hit the ball
		int club=0, power;
	
		int score=0;
	//abandon is true when the player wants to abandon this ground
		String abandon;
	//when the player enters 1, it goes to the first course
if(in.nextInt()==1){
	System.out.println("You are playing Genesee Valley Park North Course.");
	Course1 a=new Course1();
	//there are 18 holes, so we loop for 18 times
	for(int i=1;i<=18;i++){
	//decide which hole is our goal
	a.SpecifyTee(i);
	//set the distance in Course 1 class
	a.setYards(i);
	//now the distance is the whole distance to a hole
	WholeDistance=a.getDistance();
	//now the distance between the player and the hole is the whole distance
	distance=WholeDistance;
	//each time score increases by the par number
	score=score+a.getPar();
	//shot is the times the player hits a ball for each hole
	int shot=1;
	//t stands for whether the ball is on the green
	//true is on the green, false is on the fairway
	Boolean t=false;
	//one ground will be abandon when adandon is equal to"abandon"
	abandon="";
	//rough stands for whether the ball is at a rough place
	Boolean rough=false;
	//it will loop until the ball is in the hole(distance is +-1 and the ball have to be hit on the green)
	while(distance>1||t==false){
		
		System.out.println("shot "+shot+":");
		shot=shot+1;
		//if it's on the fairway
		if(t==false){
		System.out.println("Choose your club [1-10]:");
		club=in.nextInt();
		System.out.println("Power [1-10]:");
		power=in.nextInt();
		nextDistance=nextDistance(club,power);
		//if the ball is at a rough place, the nextDistance will become half
		nextDistance=RoughDistance(rough,nextDistance);
		//if last time we hit the ball to 20%~30% of the whole distance, the ball can be in a hazardous place
		//in other words, now the ball can be in a hazardous place and we will lose the ball when we hit it
		Boolean hazard=Hazard(distance,WholeDistance);
		//if it's in the hazardous state, we lose the ball and the nextDistance become 0 
		nextDistance=HazardDistance(nextDistance,hazard);
		//if it's in the hazardous state, there will be a instruction.
		HazardStatus(hazard);
		}
		//if it's on the green
		else{
		System.out.println("Power [1-10]:");
		power=in.nextInt();
		nextDistance=putting(power);
		}
		//we may hit the ball beyond the hole, so distance should the absolute value of the difference 
		distance=absoluteValue(distance-nextDistance);
		//if it's on the green, I will tell how many feet the player hits
		//if it's on the fairway, the number should be counted by yard.
		yardOrFeet(t, nextDistance);
		//if it's on the fairway
		if(t==false){
		
		if(distance>20){
		System.out.println(distance+" yards to the hole");
		//it's still on the fairway
		t=false;
		}
		//if the distance is less than 20, it means it's on the green
		else{
		// the unit changes from yard to feet, so the number becomes 3 times
		distance*=3;
		System.out.println(distance+" feet to the hole");
		//it's on the green
		t=true;
		}
		//the number of distance changes for the unit change
		a.setDistance(distance);
		}
		
		//if it's on the green, it's impossible to hit out of the green for this project
		else{
		// if the distance is bigger than 1, it's not in the hole
		if(distance>1){
		System.out.println(distance+" feet to the hole");t=true;
		}
		
		a.setDistance(distance);
		}
		//print out the status whether it's on the green or fairway
	    Status(distance,t);
	    //the club number is smaller, the power is bigger, the more possibly the ball is in the rough place
		rough=Rough(t,club,power);
		//if it's in the rough place, I will tell the player
		RoughStatus(rough);
		
	    score--;
	    System.out.println("Do you want to abandon this ground? 'abandon' to quit; any other to continue");
	    abandon=in.next();
	    if(abandon.equals("abandon")){
		break;
	    }
	    }
	
	
	    if(abandon.equals("abandon")){
		break;
	    }
	    System.out.println("You score is "+score);
	    }
	    }
	//if the player enters 2 (rather than 1)
   //the rest is almost the same as the course 1. I just changes some numbers
else{
System.out.println("You are playing The Old Course at St. Andrews.");
Course2 b=new Course2();

for(int i=1;i<=18;i++){
b.SpecifyTee(i);
b.setYards(i);
WholeDistance=b.getDistance();
distance=WholeDistance;
score=score+b.getPar();
int shot=1;
Boolean t=false;
abandon="";
Boolean rough=false;

while(distance>1||t==false){
	
	System.out.println("shot "+shot+":");
	shot=shot+1;
	
	if(t==false){
	System.out.println("Choose your club [1-10]:");
	club=in.nextInt();
	System.out.println("Power [1-10]:");
	power=in.nextInt();
	nextDistance=nextDistance(club,power);
	nextDistance=RoughDistance(rough,nextDistance);
	Boolean hazard=Hazard(distance,WholeDistance);
	nextDistance=HazardDistance(nextDistance,hazard);
	HazardStatus(hazard);
	}
	
	else{
	System.out.println("Power [1-10]:");
	power=in.nextInt();
		nextDistance=putting(power);
		}
	distance=absoluteValue(distance-nextDistance);
	
	yardOrFeet(t, nextDistance);
	
	if(t==false){
		
	if(distance>20){
	System.out.println(distance+" yards to the hole");
	t=false;
	}
	
	else{
		distance*=3;System.out.println(distance+" feet to the hole");t=true;
		}
	b.setDistance(distance);
	}
	
	else{
	if(distance>60){distance/=3;
	System.out.println(distance+" yards to the hole");
	t=false;
	}
	else if(distance>1){
		System.out.println(distance+" feet to the hole");t=true;
	}
	b.setDistance(distance);
	}
	Status(distance,t);
	rough=Rough(t,club,power);
	RoughStatus(rough);
	
    score--;
    System.out.println("Do you want to abandon this ground? 'abandon' to quit; any other to continue");
    abandon=in.next();
    if(abandon.equals("abandon")){
	break;
    }
    }
    if(abandon.equals("abandon")){
	break;
    }
    System.out.println("You score is "+score);
    }
    }
	
    System.out.println("Play a new round? [true-false]:");
    playAgain=in.nextBoolean();
    }
	}//end of main method
	
	// this is to compute nextDistance when it's in the fairway.
public static int nextDistance(int clubNumber,int power) {
	int mean = 0,stddev = 0; 
	
	switch(clubNumber){
	case 1:mean=230;
	stddev=30;
	break;
	case 2:mean=215;
	stddev=20;
	break;
	case 3:mean=180;
	stddev=20;
	break;
	case 4:mean=170;
	stddev=17;
	break;
	case 5:mean=155;
	stddev=15;
	break;
	case 6:mean=145;
	stddev=15;
	break;
	case 7:mean=135;
	stddev=15;
	break;
	case 8:mean=125;
	stddev=15;
	break;
	case 9:mean=110;
	stddev=10;
	break;
	case 10:mean=50;
	stddev=10;
	}
   
   double mean_adj = mean * power / 10.0;
    double stddev_adj = stddev * power / 10.0;
    int distance;
    Random random=new Random();
    do {
        double val = (random.nextGaussian() * stddev_adj) + mean_adj;
        distance = (int)val;
    } while (distance < 0);
    return distance;}

	public static int putting(int power){
		int mean = 0,stddev = 0; 
		switch(power){
		case 1:mean=1;
		stddev=1;
		break;
		case 2:mean=2;
		stddev=1;
		break;
		case 3:mean=4;
		stddev=2;
		break;
		case 4:mean=8;
		stddev=2;
		break;
		case 5:mean=12;
		stddev=3;
		break;
		case 6:mean=16;
		stddev=3;
		break;
		case 7:mean=20;
		stddev=4;
		break;
		case 8:mean=25;
		stddev=4;
		break;
		case 9:mean=30;
		stddev=5;
		break;
		case 10:mean=40;
		stddev=5;
		}
	   
	   double mean_adj = mean * power / 10.0;
	    double stddev_adj = stddev * power / 10.0;
	    int distance;
	    Random random=new Random();
	    do {
	        double val = (random.nextGaussian() * stddev_adj) + mean_adj;
	        distance = (int)val;
	    } while (distance < 0);
	    return distance;
	}
//the ball can travel beyond the hole, so the distance can be negative. I set the absolute value method.
public static int absoluteValue(int num){
	if(num<0){
		num=-num;
	}
	return num;
}
//t is to decide whether it's on the green
public static Boolean Rough(Boolean t,int club,int power){
	Double random=Math.random();
	double x=random*100;
	if(t==true){
		return false;
	}
	else{
	if(x<(10-club)*power/3){
		return true;
	}else{
		return false;
	}
	}
}
//message display method
public static void RoughStatus(Boolean rough){
	if(rough==true){
	System.out.println("oh, you are at a rough place. You need to hit the ball harder.");
}
}
// if it's in the rough place, nextDistance becomes half
public static int RoughDistance(Boolean rough, int nextDistance){
	if(rough==true){
		return nextDistance/2;
	}
	else{
		return nextDistance;
	}
}
//if the ball is in the hazardous place, it has the possibility of loss.
public static Boolean Hazard(int distance, int WholeDistance){
if(distance>2*WholeDistance/10&&distance<3*WholeDistance/10){
	Double random=Math.random();
	Double r= random*100;
	if(r>85){
		return true;
	}
	else{
		return false;
	}
}
else{
	return false;
}
}
//if hazard, ball lost and the nextdistance is 0
public static int HazardDistance(int nextDistance, Boolean Hazard){
	if(Hazard==true){
		return 0;
	}
	else{
		return nextDistance;
	}
}
//message display
public static void HazardStatus(Boolean Hazard){
	if(Hazard==true){
		System.out.println("Sorry, you are at a hazardous place");
	}
	
}
//use that if it's on the green to decide that the unit is yard or feet.
public static void yardOrFeet(Boolean t, int nextDistance){
	if(t==false){
		System.out.println("You hit the ball "+nextDistance+" yards.");
		}
		else{System.out.println("You hit the ball "+nextDistance+" feet.");
		}
}
//message display
public static void Status(int distance,Boolean t){
	if(distance<=1&&t==true){
		System.out.println("Excellent! You make it!");
	}
	else{
	if(t==true){
		System.out.println("You are on the green");
	}
	else{
		System.out.println("You are in the fairway");
	}
	}
}

	}


