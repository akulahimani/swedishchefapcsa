
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.text.*;


public class testing

{


    public static void main (String [] args)


    {

Scanner reader = new Scanner(System.in);



{ 


		String play = "y";
		while(play.equalsIgnoreCase("y")) { //sentinal while loop
		
		int dmg = 0, hp = 0;
		//int round = 0;
		int eneDmg = 0;
		int eneHp = 0;//int variable
		double spawn = 0;//double variable
		// number based variables
		String player = "", job ="", stats = "";
		String menu = "";//String variable
		String monster = "";
		String badHp = "";
		// word based variables
		char Tom = 'g';//char variables
		String print = "Enter the name of your character";
		System.out.print(print.substring(0,10));//substrings
		System.out.println(print.substring(10));
		//prompt the user
		player = reader.nextLine();
		//Updates the variable to match what the user entered
		System.out.println("Select your class: Warrior, Theif, Mage");
		//prompt the user
		job = reader.nextLine();
		//Update variable
		if(job.equalsIgnoreCase("Warrior"))
		{
		hp = 550;
		dmg = (int)(Math.random()* 11 + 70);//casting when i cast truncation occurs which drops the decimal. and mathematical equation
		stats = ("hp: " + hp);
		}
		else if(job.equalsIgnoreCase("Theif"))
		{
		hp = 450;
		dmg = (int)(Math.random()* 75);//math equation
		stats = ("hp: " + hp);
		}
		else if(job.equalsIgnoreCase("Mage"))
		{
		hp = 150;
		dmg = (int)(Math.random() * 11 + 120);//math equation
		stats = ("hp: " + hp);
		}
		//I used Math.random for damage ranges, I used this website for help: https://stackoverflow.com/questions/7961788/math-random-explained 

		System.out.println("Welcome to a beta battle code the "+job + " " +player + " " +Tom + "ood luck");
		System.out.println();

		
		

		System.out.println("type continue to proceed");
		menu = reader.nextLine();
		//while (menu.equalsIgnoreCase("continue")) {
			spawn = (int) ((Math.random() * 100) + 1);
			if (spawn >= 1 && spawn <= 10) {
				monster = "Dragon";
				badHp = "250";
				eneHp = Integer.parseInt(badHp);
				eneDmg = 149;
			} else if (spawn >= 11 && spawn <= 35) {
				monster = "Golem";
				badHp = "300";
				eneHp = Integer.parseInt(badHp);
				eneDmg = 50;
			} else if (spawn >= 36 && spawn <= 100) {
				monster = "Slime";
				badHp = "70";
				eneHp = Integer.parseInt(badHp);//integer wrapper class
				eneDmg = 10;
			}
			// Spawn Rates
			

			for (int round = 1; hp >= 0; )//for loop
			// The For loop may be faulty in its counting, it’s supposed to
			// work that as long as hp is above zero round increases by one
			{
				
				do {//do while
					spawn = (int) ((Math.random() * 100) + 1);
					// casting, truncation also occurs during this, Math
					// Class Method, is also a math equation
					if (spawn >= 1 && spawn <= 10) {//if else ladder
						monster = "Dragon";
						badHp = "250";
						eneHp = Integer.parseInt(badHp);
						eneDmg = 149;
					} else if (spawn >= 11 && spawn <= 35) {
						monster = "Golem";
						badHp = "300";
						eneHp = Integer.parseInt(badHp);
						eneDmg = 50;
					} else if (spawn >= 36 && spawn <= 100) {
						monster = "Slime";
						badHp = "70";
						eneHp = Integer.parseInt(badHp);
						eneDmg = 10;
					}



    //Spawn Rates retyped for a different monster to appear

    

        switch(monster)//switch statement for battle

        {

        case "Dragon":

            

            System.out.println("Round "+round+" A " + monster + " has appeared!");

            eneHp -= dmg; hp -= eneDmg;  stats = ( "Hp: " + hp); break;


        case "Golem":

            System.out.println("Round "+round+" A " + monster + " has appeared!");

            eneHp -= dmg; hp -= eneDmg; stats = ( "Hp: " + hp);break;


        case "Slime":

            System.out.println( "Round "+round+" A " + monster + " has appeared!");

            eneHp -= dmg; hp -= eneDmg; stats = ( "Hp: " + hp); break;

        }


System.out.println(stats);

System.out.println();

    

    if(hp <= 0)

    {

        System.out.println("GAME OVER");

        System.out.println(player + " the " + job + " survived " + (round - 1) + " rounds");

        System.out.println("");
        
        //I had an issue stopping the code after hp hit zero, the player could still type
        System.out.println("Would you like to play again (y/n)");
        play = reader.nextLine();
        round++;
    }

    else 

    {

        System.out.println("type 'y' to proceed and 'n' to quit");
        menu = reader.nextLine();
        if(menu.equalsIgnoreCase("n")) {
        hp = 0;
        }
        round++;
        
    }


   // menu = reader.nextLine();

    }while(!(eneHp <=0));

}

//while loop repeats the battle sequence until one hp is zero(or below)





}
}

	int hp = 0;
    for(int tt = 1; tt <=2; tt++ ) {//nested for loop
    	for (int yy = 0; yy <=9; yy++) {
    		System.out.print(tt-1);
			System.out.println(yy);
			try {  
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
    	}
    }
    System.out.println("20");
    while(hp == 0) {//while statement
    	System.out.println("Say Hi!");
    	hp++;
    	String test = reader.nextLine();//
    	
    }
    boolean worthless = false;//boolean method declared
    	if(worthless == true) //if else
    	{
    		System.out.println("wow");
    	}
    	else {
    		if(worthless == false) {//nested if/else
    			System.out.println(worthless);
    		}else {
    			System.out.println(worthless);
    		}
    		
    }
    int oo = 1243;
    double ooo = 5.12354325;
    double oooo = oo * ooo;//oo is promoted
    System.out.println(oooo);
    int yyyy = (int) Math.round(ooo);//math class method
    System.out.println("Enter a phrase");
    String phrase = reader.nextLine();
    int num = phrase.length();//string method
    System.out.println("The phrase entered has a length of " + num);
}
}
