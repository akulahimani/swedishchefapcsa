import java.util.*;
public class Swedish_Chef {
	public static void main(String[] args) {
		//Sean
		Scanner scan = new Scanner(System.in);
		System.out.println("Type input:");
		String first1 = " " + scan.nextLine() + " ";
		String first2 = " " + scan.nextLine() + " ";
		String first3 = " " + scan.nextLine() + " ";
		String first4 = " " + scan.nextLine() + " ";
		String first5 = " " + scan.nextLine() + " ";
		test(first1);
		test(first2);
		test(first3);
		test(first4);
		test(first5);
	}
	public static void test(String first) {
		String endString = "";
		int x = 0;
		for(int u = first.length(); x < u; x++) {
			
			char y = first.charAt(x);
			
			if(y == 'T') {//THE to ZEE #2 -Himani
				if(x + 2 < first.length()) {
					if(first.charAt(x+1) == 'H') {
						if(first.charAt(x+2) == 'E') {
							endString += "ZEE";
							x++;
							x++;
							y = '*';
						}
					}
				}
			}
			if(y== 'A') {//AN to UN #3 -Himani
				if(x + 1 < first.length()) {
					if(first.charAt(x+1) == 'N') {
						endString += "UN";
						x++;
						y = '*';
					}
				}
			}
			if(y== 'A') {//AU to OO #4 -Himani
				if(x + 1 < first.length()) {
					if(first.charAt(x+1) == 'U') {
						endString += "OO";
						x++;
						y = '*';
					}
				}
			}
			if(y == 'A') {//A to E #5 -Sean
				if(x + 1 < first.length()) {
					if(first.charAt(x+1) != ' ') {
						endString += "E";
						y = '*';
					}
				}
			}
			if(y == 'O') {//OW to OO #6-Amita
				if(x + 1 < first.length()) {
					if(first.charAt(x+1) == 'W') {
						endString += "OO";
						x++;
						y = '*';
					}
				}
			}
			if(y == 'O') {//O to U #7 -Quinlan
				endString += "U";
				y = '*';
			}
			if(y == 'I') {//IR to UR #8 -Amita
				if(x + 1 < first.length()) {
					if(first.charAt(x+1) == 'R') {
						endString += "UR";
						x++;
						y = '*';
					}
				}
			}
			if(y == 'T') {//TION to SHUN #9 -Amita
				if(x + 3 < first.length()) {
					if(first.charAt(x+1) == 'I') {
						if(first.charAt(x+2) == 'O') {
							if(first.charAt(x+3) == 'N') {
								endString += "SHUN";
								x++;
								x++;
								x++;
								y = '*';
							}
						}
					}
				}
			}
			if(y == 'I') {//I to EE if first I in word #10 but not at Start of word -Sean
				if(x-1 == -1) {
				}else {
					if(first.charAt(x-1) != ' ') {
						int o = 0;
						int xx = 1;
						while(o == 0) {
							if(first.charAt(x - xx) == 'I') {
								o = 2;
							}if(first.charAt(x - xx) == ' '){
								o = 1;
							}else {
								xx++;
								
							}
						}
						if(o == 1) {
							endString += "EE";
							y = '*';
						}
					}	
				}
			}
			if(y == 'E') {//EN to EE at end of word #11 -Sean
				if(x + 2 < first.length()) {
					if(first.charAt(x+1) == 'N') {
						if(first.charAt(x+2) == ' ') {
							x++;
							x++;
							y = '*';
							endString += "EE ";
						}
					}
				}
			}
			if(y == 'F') {//F to FF #12 -Coco
				endString += "FF";	
				y = '*';
			}
			if(y == 'E') {//E with E-A and end of word #13 -Coco
				if(x + 1 < first.length()) {
					if(first.charAt(x+1) == ' ') {
						endString += "E-A ";
						x++;
						y = '*';
					}
				}
			}
			if(y == 'U') {//U to OO except at start of word  #14 -Sean
				if(x-1 != -1) {
					if(first.charAt(x-1) != ' ') {
						endString += "OO";
						y = '*';
					}
				}
			}
			if(y == 'V') {//V with F #15 -Quinlan
				endString += "F";
				y = '*';
			}
			if(y == 'W') {//W with V #16 -Coco
				endString += "V";
				y = '*';
			}
			if(y != '*'){
				endString += y;
			}
		}
		int y = 1;
		for(int t = endString.length()-1; y < t; y++) {
			System.out.print(endString.charAt(y));
		}
		System.out.println(". BORK BORK BORK!"); //-Quinlan
	}
}
