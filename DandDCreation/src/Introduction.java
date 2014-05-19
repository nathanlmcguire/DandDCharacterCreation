import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class Introduction 
	{
	static String nameOfPlayer, classOfPlayer, raceOfPlayer, genderOfPlayer, alignmentOfPlayer;
	
	public static String greetingThePlayer()
		{
		System.out.println("Welcome to Character Creation for D and D!");
		System.out.println("");
		delayOneSecond();
		System.out.println("Here you will find all the stats for your Character without the pain of searching through a massive manual and rolling thousands of dice.");
		System.out.println("");
		delayOneSecond();
		System.out.println("Let's start with your character's name.");
		Scanner userInput1 = new Scanner(System.in);        
	    nameOfPlayer = userInput1.nextLine();
		return nameOfPlayer;
		}
	
	public static String choosingClassAndRace()
		{
		System.out.println("Now let's choose your race.");
		System.out.println("");
		delayOneSecond();
		System.out.println("Human, Dwarf, Elf, Half-Elf, Half-Orc, Gnome, or Halfling.");
		System.out.println("");
		delayOneSecond();
		Scanner userInput2 = new Scanner(System.in);        
		raceOfPlayer = userInput2.nextLine();	    
		System.out.println("And our final step is to choose your class.");
		System.out.println("");
		delayOneSecond();
		System.out.println("Fighter, Paladin, Cleric, Ranger, Rogue, Sorcerer, Wizard, Barbarian, or Druid.");
		System.out.println("");
		delayOneSecond();
		Scanner userInput3 = new Scanner(System.in);        
		classOfPlayer = userInput3.nextLine();	    
		return classOfPlayer;
		}

	public static String choosingAlignmentAndGender()
		{
		System.out.println("Now choose your gender.(M or F)");
		Scanner userInput2 = new Scanner(System.in);        
		genderOfPlayer = userInput2.nextLine();
		System.out.println("Now let's choose your alignment(a.k.a. moral standpoint).");
		System.out.println("");
		delayOneSecond();
		System.out.println("You can be:");
		System.out.println("");
		delayOneSecond();
		System.out.println("Lawful Good | Neutral Good | Chaotic Good");
		System.out.println("Lawful Neutral | Neutral | Chaotic Neutral");
		System.out.println("Lawful Evil | Neutral Evil | Chaotic Evil");
		Scanner userInput3 = new Scanner(System.in);        
		alignmentOfPlayer = userInput3.nextLine();
		return alignmentOfPlayer;
		}

	public static void delayOneSecond()
		{
		try
			{
			TimeUnit.SECONDS.sleep(1);	
			}
		catch (InterruptedException e)
			{
			
			}
		}
	
	}
