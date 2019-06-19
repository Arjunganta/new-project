
public class CricketGame {

}
using System;
using System.Collections.Generic;
using Cricketapp;

namespace Cricketapp
{
    class scoreboard
    {
        public int score;

//int run;
        int total;
        int need;
        int[] balls = new int[6];
        int m = -1;

        public void getScore()
        {
            List<string> batsman = new List<string>();
            //   Queue<string> batsman = new Queue<string>();
            batsman.Add("kohli");
            batsman.Add("rohit");
            batsman.Add("dhawan");
            batsman.Add("rahul");
            batsman.Add("dhoni");
            batsman.Add("pandya");
            batsman.Add("chahal");
            batsman.Add("kuldeep");
            batsman.Add("bumrah");
            batsman.Add("bhuvi");
            foreach (string z in batsman)
            {
                Console.WriteLine(z);
            }

            List<string> bowler = new List<string>();
            bowler.Add("stark");
            bowler.Add("smith");
            bowler.Add("alex carey");
            bowler.Add("chris lynn");
            bowler.Add("handscomb");

            int Overcount = 0;
            int Ballcount = 0;
            int strike = 0;
            int bowlers = 0;
            int first = 0;
            int second = 0;
            for (int j = 0; j < 11; j++)
            {
                need = score - total;
                
                Console.WriteLine("You need {0} to win ", need);
               // if (need <= 0||score<=total)
              //  {
                 //   Console.WriteLine("match has finished");
                 //   break;
                //}

                for (int i = 0; i < 6; i++)
                {
                    if (need <= 0 || score <= total)
                    {
                        balls[i] = 0;
                    }
                    Ballcount++;
                    Console.WriteLine(Ballcount + " " + "ball" + " " + bowler[bowlers] + " " + "to" + " " +
                                      batsman[strike]);
                    balls[i] = Convert.ToInt32(Console.ReadLine());
                    if (balls[i] == 1 || balls[i] == 3)
                    {
                        if (strike == 0)
                        {
                            first += balls[i];
                        }
                        


                        strike++;
                        if (strike == 1)
                        {
                            
                            second += balls[i];
                        }
                     //  second += balls[i];


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
                            first += balls[i];
                        }
                        else
                        {
                            second += balls[i];
                        }

                    }

                    for (int o = 0; o < 6; o++)
                    {
                        if (balls[i] < 0 || balls[i] > 6)
                        {
                            Console.WriteLine("enter a valid score");

                            balls[i] = 0;
                            balls[i] = Convert.ToInt32(Console.ReadLine());
                        }

                        if (balls[i] == 1 || balls[i] == 3)
                        {
                            
                          //  first += balls[i];

                            strike++;
                            //second += balls[i];

                            if (strike >= 2)
                            {
                                strike = 0;
                            }

                        }
                    }

                    

                    total = total + balls[i];
                    //point();
                }
                if (need <= 0||score<=total)
                {
                    
                    Console.WriteLine("match has finished");
                    break;
                }

                Ballcount = 0;
                bowlers++;
                Overcount++;

                Console.WriteLine("\nscore after finishing" + " " + Overcount + " " + "over" + " " + "is" + " " +
                                  total);
                Console.WriteLine("kohli"+" "+first);
                Console.WriteLine("rohit"+" "+second);
                Console.WriteLine("\nwait for the "+(Overcount+1)+" over");





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

                m++;
                int q = 0;

                void batman()
                {
                    q = m;
                    q++;
                    Console.WriteLine("\n" + batsman[m] + " is out");
                 //   batsman.RemoveAt(m);
                    Console.WriteLine("\n" + batsman[q+1] + " is next batsman");
                }

                if (first == 0)
                {
                    batman();
                }
               
            }
           

          //  void point()
         //   {
           //     if (score <= total)
             //   {
                //    Console.WriteLine("You Won The Match");
               //     Console.WriteLine("Earned Two Points");
                    
                //}
            }

        }
    }
  

    
    class Program{
        static void Main(string[] args)
        {
            scoreboard b = new scoreboard();
            Random r = new Random();
            b.score = r.Next(100, 200);
            Console.WriteLine("Your target is : {0}", b.score);
// int u = Convert.ToInt32(Console.Read());
            b.getScore();
            Console.WriteLine();
// Console.WriteLine(b.score);
            Console.Read();
        }
    }



