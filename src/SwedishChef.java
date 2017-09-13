import java.util.*;
public class SwedishChef {
	public static void main(String[] args) {
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
			
			
			
			if(y == 'A') {//A to E #5
				if(x + 1 < first.length()) {
					if(first.charAt(x+1) != ' ') {
						endString += "E";
						y = '*';
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
							endString += "EE";
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
							endString += "EE ";
						}
					}
				}
			}

			if(y == 'U') {//U to OO except at start of word  #14
				if(x-1 != -1) {
					if(first.charAt(x-1) != ' ') {
						endString += "OO";
						y = '*';
					}
				}
			}
			
			
			if(y != '*') {
				endString += y;
			}
		}
		
		int y = 1;
		for(int t = endString.length()-1; y < t; y++) {
			System.out.print(endString.charAt(y));
		}
		System.out.println(". BORK BORK BORK!");
	}
		
	}
	

