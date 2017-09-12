import java.util.*;
public class Swedish_Chef {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Type input:");
		String first1 = " " + scan.nextLine() + " ";
		String first2 = " " + scan.nextLine() + " ";
		String first3 = " " + scan.nextLine() + " ";
		String first4 = " " + scan.nextLine() + " ";
		String first5 = " " + scan.nextLine() + " ";
//		String first1 = " " + first6;
//		String first2 = " " + first7;
//		String first3 = " " + first8;
//		String first4 = " " + first9;
//		String first5 = " " + first10;
		test(first1);
		test(first2);
		test(first3);
		test(first4);
		test(first5);
	}

	public static void test(String first) {
		String end = "";
		int x = 0;
		for(int u = first.length(); x < u; x++) {
			
			char y = first.charAt(x);
			
			if(y == 'T') {//THE to ZEEE #2
				if(x + 2 < first.length()) {
					if(first.charAt(x+1) == 'H') {
						if(first.charAt(x+2) == 'E') {
							end += "ZEE";
							x++;
							x++;
							y = '*';
						}
					}
				}
			}
			
			if(y== 'A') {//AN to UN #3
				if(x + 1 < first.length()) {
					if(first.charAt(x+1) == 'N') {
						end += "UN";
						x++;
						y = '*';
					}
				}
			}
			
			if(y== 'A') {//AU to OO #4
				if(x + 1 < first.length()) {
					if(first.charAt(x+1) == 'U') {
						end += "OO";
						x++;
						y = '*';
					}
				}
			}
			
			if(y == 'A') {//A to E #5
				if(x + 1 < first.length()) {
					if(first.charAt(x+1) != ' ') {
						end += "E";
						y = '*';
					}
				}
			}
			
			if(y == 'O') {//OW to OO #6
				if(x + 1 < first.length()) {
					if(first.charAt(x+1) == 'W') {
						end += "OO";
						x++;
						y = '*';
					}
				}
			}
			
			if(y == 'O') {//O to U #7
				end += "U";
				y = '*';
			}
			
			if(y == 'I') {//IR to UR #8
				if(x + 1 < first.length()) {
					if(first.charAt(x+1) == 'R') {
						end += "UR";
						x++;
						y = '*';
					}
				}
			}
			
			if(y == 'T') {//TION to SHUN #9
				if(x + 3 < first.length()) {
					if(first.charAt(x+1) == 'I') {
						if(first.charAt(x+2) == 'O') {
							if(first.charAt(x+3) == 'N') {
								end += "SHUN";
								y = '*';
								x++;
								x++;
								x++;
							}
						}
					}
				}
			}
			
			if(y == 'I') {//I to EE if first I in word #10 but not at Start of word
				if(x-1 == -1) {
				}else {
					if(first.charAt(x-1) != ' ') {
						int o = 0;
						int xx = 1;
						while(o == 0) {
							if(first.charAt(x - xx) == 'I') {
								o = 2;
							}else if(first.charAt(x - xx) == ' '){
								o = 1;
							}else {
								xx++;
							}
						}
						if(o == 1) {
							end += "EE";
							y = '*';
						}
					}	
				}
			}
			
			if(y == 'E') {//EN to EE at end of word #11
				if(x + 2 < first.length()) {
					if(first.charAt(x+1) == 'N') {
						if(first.charAt(x+2) == ' ') {
							x++;
							x++;
							y = '*';
							end += "EE ";
						}
					}
				}
			}
			
			if(y == 'F') {//F to FF #12
				y = '*';
				end += "FF";	
			}
			
			if(y == 'E') {//E with E-A and end of word #13
				if(x + 1 < first.length()) {
					if(first.charAt(x+1) == ' ') {
						end += "E-A ";
						x++;
						y = '*';
					}
				}
			}
			
			if(y == 'U') {//U to OO except at start of word  #14
				if(x-1 != -1) {
					if(first.charAt(x-1) != ' ') {
						end += "OO";
						y = '*';
					}
				}
			}
			
			if(y == 'V') {//V with F #15
				end += "F";
				y = '*';
			}
			
			if(y == 'W') {//W with V #16
				end += "V";
				y = '*';
			}
			
			if(y != '*') {
				end += y;
			}
		}
		//System.out.println(end + ". Bork Bork Bork!");//print and #1 at one time
		int y = 1;
		for(int t = end.length()-1; y < t; y++) {
			System.out.print(end.charAt(y));
		}
		System.out.println(". BORK BORK BORK!");
	}
}
