package gitproject;
import java.util.*;

import practise.Linkedlis;


public class CricketApplication{
	static int score;
    static   int total;
    static   int need;
    static    int[] balls = new int[6];
    static   int m = -1;
public  static void getScore(){
	Scanner sc =new Scanner(System.in);

LinkedList<String> batsman=new LinkedList<String>();
batsman.add("kohli");
batsman.add("rohit");
batsman.add("dhawan");
batsman.add("rahul");
batsman.add("dhoni");
batsman.add("pandya");
batsman.add("chahal");
batsman.add("kuldeep");
batsman.add("bumrah");
batsman.add("bhuvi");
for (String z : batsman)
{
   System.out.println(z);
}
LinkedList<String> bowler = new LinkedList<String>();
bowler.add("stark");
bowler.add("smith");
bowler.add("alex carey");
bowler.add("chris lynn");
bowler.add("handscomb");
int Overcount = 0;
int Ballcount = 0;
int strike = 0;
int bowlers = 0;
int first = 0;
int second = 0;
int dummy1=0;
int dummy2=0;

for (int j = 0; j < 11; j++)
{
    need = score - total;
    
   System.out.println("You need"+" "+(need+1)+" "+"to win");
 
    for (int i = 0; i < 6; i++)
    {
        if (need <= 0 || score <= total)
        {
            balls[i] = 0;
        }
        Ballcount++;
        System.out.println(Ballcount + " " + "ball" + " " + bowler.get(bowlers) + " " + "to" + " " +
                          batsman.get(strike));
        balls[i] = sc.nextInt(); 
        if (balls[i] == 1 || balls[i] == 3)
        {
            if (strike == 0)
            {
                dummy1 += balls[i];
            }
            strike++;
            if (strike == 1)
            {
                
                dummy2 += balls[i];
            }
       
            if (strike >= 2)
            {
                strike = 0;
            }
        }

        if (balls[i] == 4 || balls[i] == 2 || balls[i] == 6)
        {
            strike = strike;
            if (strike == 0)
            {
                dummy1 += balls[i];
            }
            else
            {
                dummy2 += balls[i];
            }

        }

        for (int o = 0; o < 6; o++)
        {
            if (balls[i] < 0 || balls[i] > 6)
            {
               System.out.println("enter a valid score");

                balls[i] = 0;
                balls[i] = sc.nextInt();
                if (balls[i] == 1 || balls[i] == 3)
                {
                   if(strike==0){
                   dummy1 += balls[i];}

                    strike++;
                    if(strike==1){
                   dummy2 += balls[i];}

                    if (strike >= 2)
                    {
                        strike = 0;
                    }
            }
            } 

       
        }

        first=dummy1;
        second=dummy2;
        total = total + balls[i];
      
      
    }
  

    dummy1=0;
    
    if (need <= 0||score<=total)
    {
        
        System.out.println("match has finished");
        break;
    }

Ballcount = 0;
bowlers++;
Overcount++;

System.out.println("\nscore after finishing" + " " + Overcount + " " + "over" + " " + "is" + " " +
                  total);
System.out.println(batsman.get(0)+" "+first);
System.out.println(batsman.get(1)+" "+second);
System.out.println("\nwait for the "+(Overcount+1)+" over");
if (first == 0)
{
	 
	    System.out.println("\n" + batsman.get(0) + " is out");
	 batsman.remove(0);
	    System.out.println("\n" + batsman.get(1) + " is next batsman");
    
}

}




strike++;
if (strike >= 2)
{
    strike = 0;
}

bowlers++;
if (bowlers > 4)
{
    bowlers = 0;
}

	 
  
}
}
//this is main method and it is should be created separately to avoid errors in the project.
public class Cricke {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			Linkedlis b = new Linkedlis();
			Scanner s =new Scanner(System.in);
		
		System.out.println("Enter the target for the game");
		b.score = s.nextInt();
		Linkedlis.getScore();
		System.out.println("Your target is : "+ b.score);



		}
	}







