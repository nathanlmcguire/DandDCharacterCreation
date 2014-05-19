import java.util.Random;


public class Output 
	{
	public static void outputStats()
		{
		System.out.println("Here is your final output of stats:");
		System.out.println("");
		Introduction.delayOneSecond();
		System.out.println("Name: " + Introduction.nameOfPlayer + "");
		System.out.println("Gender: " + Introduction.genderOfPlayer + "");
		System.out.println("Class: " + Introduction.classOfPlayer + "");
		System.out.println("Race: " + Introduction.raceOfPlayer + "");
		System.out.println("Alignment: " + Introduction.alignmentOfPlayer + "");
		System.out.println("");
		Introduction.delayOneSecond();
		System.out.println("HP: " + RollingStats.playerHitPoints + "");
		System.out.println("AC: " + RollingStats.playerArmorClass + "");
		System.out.println("GP: " + RollingStats.goldOfPlayer + "");
		System.out.println("");
		Introduction.delayOneSecond();
		System.out.println("Strength: " + RollingStats.strength + " | " + RollingStats.strengthModifier + "");
		System.out.println("Dexterity: " + RollingStats.dexterity + " | " + RollingStats.dexterityModifier + "");
		System.out.println("Constitution: " + RollingStats.constitution + " | " + RollingStats.constitutionModifier + "");
		System.out.println("Intelligence: " + RollingStats.intelligence + " | " + RollingStats.intelligenceModifier + "");
		System.out.println("Wisdom: " + RollingStats.wisdom + " |" + RollingStats.wisdomModifier + "");
		System.out.println("Charisma: " + RollingStats.charisma + " |" + RollingStats.charismaModifier + "");
		System.out.println("");
		Introduction.delayOneSecond();
		System.out.println("Fortitude: " + RollingStats.fortitude + "");
		System.out.println("Reflex: " + RollingStats.reflex + "");
		System.out.println("Will: " + RollingStats.will + "");
		System.out.println("");
		Introduction.delayOneSecond();
		System.out.println("Primary Weapon: " + RollingStats.firstWeaponName + "-" + RollingStats.firstWeaponDiceNumber + "d" + RollingStats.firstWeaponDamage + "|" + RollingStats.firstWeaponCrit + "|" + RollingStats.firstWeaponWeight + " lbs");
		System.out.println("Secondary Weapon: " + RollingStats.secondWeaponName + "-" + RollingStats.secondWeaponDiceNumber + "d" + RollingStats.secondWeaponDamage + "|" + RollingStats.secondWeaponCrit + "|" + RollingStats.secondWeaponWeight + " lbs");
		System.out.println("Armor: " + RollingStats.armorName + "-" + RollingStats.armorProtection + "|" + RollingStats.armorWeight + " lbs");
		System.out.println("");
		Introduction.delayOneSecond();
		System.out.println("Equipment: ");
		System.out.println("bedroll");
		System.out.println("3 days of rations");
		System.out.println("3 torches");
		System.out.println("1 health potion");
		System.out.println("");
		Introduction.delayOneSecond();
		System.out.println("Now go forth with your character and have a glorious adventure!");
		Introduction.delayOneSecond();
		//
		System.out.println("");
		System.out.println("");
		System.out.println("");
		Introduction.delayOneSecond();
		}
	}
