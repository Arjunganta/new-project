package gitproject;

import java.util.*;

public class CricketApplication {
	static int score;
	static int total = 0;
	static int need;
	static int[] balls = new int[6];

	public static void getScore() {
		Scanner sc = new Scanner(System.in);

		LinkedList<String> batsman = new LinkedList<String>();
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
		for (String z : batsman) {
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
		int dummy1 = 0;
		int dummy2 = 0;
		int l = 0;
		int m = 0;
		int g = 0;
		int h = 0;
		String ktr = batsman.get(0);
		String str = batsman.get(1);

		int kohlisocre = 0;

		for (int j = 0; j < 11; j++) {
			need = score - total;

			System.out.println("\nYOU NEED" + " " + (need + 1) + " " + "TO WIN");

			for (int i = 0; i < 6; i++) {
				if (need <= 0 || score <= total) {
					balls[i] = 0;
				}
				Ballcount++;
				System.out.println(Ballcount + " " + "ball" + " "
						+ bowler.get(bowlers) + " " + "to" + " "
						+ batsman.get(strike));
				balls[i] = sc.nextInt();
				if (balls[i] == 1 || balls[i] == 3) {
					if (strike == 0) {
						if (balls[i] == 1) {
							dummy1 = dummy1 + 1;

						}
						if (balls[i] == 3) {
							dummy1 = dummy1 + 3;
						}

					}
					if (strike == 1) {

						if (balls[i] == 1) {
							dummy2 += 1;

						}
						if (balls[i] == 3) {
							dummy2 = dummy2 + 3;

						}

					}

					strike++;
					if (strike >= 2) {

						strike = 0;

					}
				}

				if (balls[i] == 4 || balls[i] == 2 || balls[i] == 6
						|| balls[i] == 0) {
					strike = strike;
					if (strike == 0) {
						if (balls[i] == 4) {
							dummy1 += 4;
						}
						if (balls[i] == 2) {
							dummy1 = dummy1 + 2;
						}
						if (balls[i] == 6) {
							dummy1 = dummy1 + 6;
						}
					}
					if (strike == 1) {

						if (balls[i] == 4) {
							dummy2 += 4;
						}
						if (balls[i] == 2) {
							dummy2 = dummy2 + 2;
						}
						if (balls[i] == 6) {
							dummy2 = dummy2 + 6;
						}
					}

				}

				if (balls[i] < 0 || balls[i] > 6) {
					for (int o = 0; o < 10; o++) {
						if (balls[i] < 0 || balls[i] > 6) {
							System.out.println("Enter valid score");

							balls[i] = 0;
					 		total = total - balls[i];
							balls[i] = sc.nextInt();
							if (balls[i] == 1 || balls[i] == 3) {
								if (strike == 0) {
									dummy1 += balls[i];
								}

								strike++;
								if (strike == 1) {
									dummy2 += balls[i];
								}

								if (strike >= 2) {
									strike = 0;
								}
							}
						}

					}
				}

				total = total + balls[i];
				if (need <= 0 || score <= total) {

					System.out.println("MATCH HAS FINISHED, YOU WON THE MATCH");
					break;
				}
				l = dummy1;
				m = dummy2;

			}
			dummy1 = 0;
			dummy2 = 0;
			strike++;
			if (strike >= 2) {

				strike = 0;

			}

			first += l;

			second = m + second;

			if (need <= 0 || score <= total) {

			//	System.out.println("MATCH HAS FINISHED, YOU WON THE MATCH");
				break;
			}

			Ballcount = 0;
			bowlers++;
			Overcount++;

			System.out.println("\nSCORE AFTER FINISHING" + " " + Overcount
					+ " " + "OVER" + " " + "IS" + " :" + (total));
			System.out.println(" ************ " + batsman.get(0) + " " + (first+" ************ "));
			System.out.println("  ********** " + batsman.get(1) + " " + (second)+" ************ ");

			System.out.println("SCORE IN THE CURRENT OVER" + " " +":"+ (l + m));
			System.out.println("WAIT FOR THE NEXT " + (Overcount + 1) + " OVER");
			if (l == 0) {

				System.out.println("\n" + batsman.get(0) + " IS OUT");
				batsman.remove(0);
				first = 0;
				first = second;
				second = 0;

				System.out.println("\n" + batsman.get(1) + " IS THE NEXT BATSMAN");
			}
			bowlers++;
			if (bowlers > 4) {
				bowlers = 0;
			}

		}
		if (total < score) {
			System.out.println("YOU LOST THE MATCH");
		}
	}

}
