import java.util.Random;


public class RollingStats 
	{
	static int strength, intelligence, wisdom, dexterity, charisma, constitution;
	static int strengthModifier, intelligenceModifier, wisdomModifier, dexterityModifier, charismaModifier, constitutionModifier;
	static int fortitude, reflex, will;
	static int goldOfPlayer, playerHitPoints, playerArmorClass;
	static String firstWeaponName, secondWeaponName, armorName;
	static int firstWeaponDamage, firstWeaponCrit, firstWeaponWeight, firstWeaponDiceNumber, secondWeaponDamage, secondWeaponCrit, secondWeaponWeight, secondWeaponDiceNumber;
	static int armorProtection, armorWeight;
	static int fourSidedDie, sixSidedDie, eightSidedDie, twelveSidedDie, twentySidedDie;
	
	public static int classChangesForHuman()
		{
		if("Fighter".equals(Introduction.classOfPlayer))
			{
	
			}
			
		if("Paladin".equals(Introduction.classOfPlayer))
			{
				
			}
		
		if("Cleric".equals(Introduction.classOfPlayer))
			{
			;	
			}
		
		if("Ranger".equals(Introduction.classOfPlayer))
			{
			
			}	
		
		if("Rogue".equals(Introduction.classOfPlayer))
			{
			
			}
		
		if("Sorcerer".equals(Introduction.classOfPlayer))
			{
			
			}
		
		if("Wizard".equals(Introduction.classOfPlayer))
			{
			
			}
		
		if("Barbarian".equals(Introduction.classOfPlayer))	
			{
			
			}
		
		if("Druid".equals(Introduction.classOfPlayer))	
			{
			
			}
		
		}
	
	public static int classChangesForDwarf()
		{
		if("Fighter".equals(Introduction.classOfPlayer))
			{
	
			}
			
		if("Paladin".equals(Introduction.classOfPlayer))
			{
				
			}
		
		if("Cleric".equals(Introduction.classOfPlayer))
			{
			;	
			}
		
		if("Ranger".equals(Introduction.classOfPlayer))
			{
			
			}	
		
		if("Rogue".equals(Introduction.classOfPlayer))
			{
			
			}
		
		if("Sorcerer".equals(Introduction.classOfPlayer))
			{
			
			}
		
		if("Wizard".equals(Introduction.classOfPlayer))
			{
			
			}
		
		if("Barbarian".equals(Introduction.classOfPlayer))	
			{
			
			}
		
		if("Druid".equals(Introduction.classOfPlayer))	
			{
			
			}
		
		}

	public static int classChangesForElf()
		{
		if("Fighter".equals(Introduction.classOfPlayer))
			{
	
			}
			
		if("Paladin".equals(Introduction.classOfPlayer))
			{
				
			}
		
		if("Cleric".equals(Introduction.classOfPlayer))
			{
			;	
			}
		
		if("Ranger".equals(Introduction.classOfPlayer))
			{
			
			}	
		
		if("Rogue".equals(Introduction.classOfPlayer))
			{
			
			}
		
		if("Sorcerer".equals(Introduction.classOfPlayer))
			{
			
			}
		
		if("Wizard".equals(Introduction.classOfPlayer))
			{
			
			}
		
		if("Barbarian".equals(Introduction.classOfPlayer))	
			{
			
			}
		
		if("Druid".equals(Introduction.classOfPlayer))	
			{
			
			}
		
		}
	
	public static int classChangesForHalfElf()
		{
		if("Fighter".equals(Introduction.classOfPlayer))
			{
	
			}
			
		if("Paladin".equals(Introduction.classOfPlayer))
			{
				
			}
		
		if("Cleric".equals(Introduction.classOfPlayer))
			{
			;	
			}
		
		if("Ranger".equals(Introduction.classOfPlayer))
			{
			
			}	
		
		if("Rogue".equals(Introduction.classOfPlayer))
			{
			
			}
		
		if("Sorcerer".equals(Introduction.classOfPlayer))
			{
			
			}
		
		if("Wizard".equals(Introduction.classOfPlayer))
			{
			
			}
		
		if("Barbarian".equals(Introduction.classOfPlayer))	
			{
			
			}
		
		if("Druid".equals(Introduction.classOfPlayer))	
			{
			
			}
		
		}
	
	public static int classChangesForHalfOrc()
		{
		if("Fighter".equals(Introduction.classOfPlayer))
			{
	
			}
			
		if("Paladin".equals(Introduction.classOfPlayer))
			{
				
			}
		
		if("Cleric".equals(Introduction.classOfPlayer))
			{
			;	
			}
		
		if("Ranger".equals(Introduction.classOfPlayer))
			{
			
			}	
		
		if("Rogue".equals(Introduction.classOfPlayer))
			{
			
			}
		
		if("Sorcerer".equals(Introduction.classOfPlayer))
			{
			
			}
		
		if("Wizard".equals(Introduction.classOfPlayer))
			{
			
			}
		
		if("Barbarian".equals(Introduction.classOfPlayer))	
			{
			
			}
		
		if("Druid".equals(Introduction.classOfPlayer))	
			{
			
			}
		
		}
	
	public static int classChangesForGnome()
		{
		if("Fighter".equals(Introduction.classOfPlayer))
			{
	
			}
			
		if("Paladin".equals(Introduction.classOfPlayer))
			{
				
			}
		
		if("Cleric".equals(Introduction.classOfPlayer))
			{
			;	
			}
		
		if("Ranger".equals(Introduction.classOfPlayer))
			{
			
			}	
		
		if("Rogue".equals(Introduction.classOfPlayer))
			{
			
			}
		
		if("Sorcerer".equals(Introduction.classOfPlayer))
			{
			
			}
		
		if("Wizard".equals(Introduction.classOfPlayer))
			{
			
			}
		
		if("Barbarian".equals(Introduction.classOfPlayer))	
			{
			
			}
		
		if("Druid".equals(Introduction.classOfPlayer))	
			{
			
			}
		
		}

	public static int classChangesForHalfling()
		{
		if("Fighter".equals(Introduction.classOfPlayer))
			{
	
			}
			
		if("Paladin".equals(Introduction.classOfPlayer))
			{
				
			}
		
		if("Cleric".equals(Introduction.classOfPlayer))
			{
			;	
			}
		
		if("Ranger".equals(Introduction.classOfPlayer))
			{
			
			}	
		
		if("Rogue".equals(Introduction.classOfPlayer))
			{
			
			}
		
		if("Sorcerer".equals(Introduction.classOfPlayer))
			{
			
			}
		
		if("Wizard".equals(Introduction.classOfPlayer))
			{
			
			}
		
		if("Barbarian".equals(Introduction.classOfPlayer))	
			{
			
			}
		
		if("Druid".equals(Introduction.classOfPlayer))	
			{
			
			}
		
		}
	
	public static int raceChanges()
		{
		if("Human".equals(Introduction.raceOfPlayer))
			{
			RollingStats.classChangesForHuman();
			}
		
		if("Dwarf".equals(Introduction.raceOfPlayer))
			{
			RollingStats.classChangesForDwarf();
			}
		
		if("Elf".equals(Introduction.raceOfPlayer))
			{
			RollingStats.classChangesForElf();
			}
		
		if("Half-Elf".equals(Introduction.raceOfPlayer))
			{
			RollingStats.classChangesForHalfElf();
			}
		
		if("Half-Orc".equals(Introduction.raceOfPlayer))
			{
			RollingStats.classChangesForHalfOrc();
			}
		
		if("Gnome".equals(Introduction.raceOfPlayer))
			{
			RollingStats.classChangesForGnome();
			}
		
		if("Halfling".equals(Introduction.raceOfPlayer))	
			{
			RollingStats.classChangesForHalfling();
			}
		
		}
	
	public static void rollAttributes()
		{
		rollSixSidedDie();
		strength = strength + sixSidedDie;
		rollSixSidedDie();
		strength = strength + sixSidedDie;
		rollSixSidedDie();
		strength = strength + sixSidedDie;
		
		rollSixSidedDie();
		intelligence = intelligence + sixSidedDie;
		rollSixSidedDie();
		intelligence = intelligence + sixSidedDie;
		rollSixSidedDie();
		intelligence = intelligence + sixSidedDie;
		
		rollSixSidedDie();
		wisdom = wisdom + sixSidedDie;
		rollSixSidedDie();
		wisdom = wisdom + sixSidedDie;
		rollSixSidedDie();
		wisdom = wisdom + sixSidedDie;
		
		rollSixSidedDie();
		dexterity = dexterity + sixSidedDie;
		rollSixSidedDie();
		dexterity = dexterity + sixSidedDie;
		rollSixSidedDie();
		dexterity = dexterity + sixSidedDie;
		
		rollSixSidedDie();
		charisma = charisma + sixSidedDie;
		rollSixSidedDie();
		charisma = charisma + sixSidedDie;
		rollSixSidedDie();
		charisma = charisma + sixSidedDie;
		
		rollSixSidedDie();
		constitution = constitution + sixSidedDie;
		rollSixSidedDie();
		constitution = constitution + sixSidedDie;
		rollSixSidedDie();
		constitution = constitution + sixSidedDie;
		}
	
	public static void findStrengthModifier()
		{
		if(strength == 3)
			{
			strengthModifier = -3;
			}
		if(strength == 4 || strength == 5)
			{
			strengthModifier = -2;
			}
		if(strength == 6 || strength == 7 || strength == 8)
			{
			strengthModifier = -1;
			}
		if(strength == 9 || strength == 10 || strength == 11 || strength == 12)
			{
			strengthModifier = 0;
			}
		if(strength == 13 || strength == 14 || strength == 15)
			{
			strengthModifier = 1;
			}
		if(strength == 16 || strength == 17)
			{
			strengthModifier = 2;
			}
		if(strength == 18)
			{
			strengthModifier = 3;
			}
		}

	public static void findIntelligenceModifier()
		{
		if(intelligence == 3)
			{
			intelligenceModifier = -3;
			}
		if(intelligence == 4 || intelligence == 5)
			{
			intelligenceModifier = -2;
			}
		if(intelligence == 6 || intelligence == 7 || intelligence == 8)
			{
			intelligenceModifier = -1;
			}
		if(intelligence == 9 || intelligence == 10 || intelligence == 11 || intelligence == 12)
			{
			intelligenceModifier = 0;
			}
		if(intelligence == 13 || intelligence == 14 || intelligence == 15)
			{
			intelligenceModifier = 1;
			}
		if(intelligence == 16 || intelligence == 17)
			{
			intelligenceModifier = 2;
			}
		if(intelligence == 18)
			{
			intelligenceModifier = 3;
			}
		}

	public static void findWisdomModifier()
		{
		if(wisdom == 3)
			{
			wisdomModifier = -3;
			}
		if(wisdom == 4 || wisdom == 5)
			{
			wisdomModifier = -2;
			}
		if(wisdom == 6 || wisdom == 7 || wisdom == 8)
			{
			wisdomModifier = -1;
			}
		if(wisdom == 9 || wisdom == 10 || wisdom == 11 || wisdom == 12)
			{
			wisdomModifier = 0;
			}
		if(wisdom == 13 || wisdom == 14 || wisdom == 15)
			{
			wisdomModifier = 1;
			}
		if(wisdom == 16 || wisdom == 17)
			{
			wisdomModifier = 2;
			}
		if(wisdom == 18)
			{
			wisdomModifier = 3;
			}
		}
	
	public static void findDexterityModifier()
		{
		if(dexterity == 3)
			{
			dexterityModifier = -3;
			}
		if(dexterity == 4 || dexterity == 5)
			{
			dexterityModifier = -2;
			}
		if(dexterity == 6 || dexterity == 7 || dexterity == 8)
			{
			dexterityModifier = -1;
			}
		if(dexterity == 9 || dexterity == 10 || dexterity == 11 || dexterity == 12)
			{
			dexterityModifier = 0;
			}
		if(dexterity == 13 || dexterity == 14 || dexterity == 15)
			{
			dexterityModifier = 1;
			}
		if(dexterity == 16 || dexterity == 17)
			{
			dexterityModifier = 2;
			}
		if(dexterity == 18)
			{
			dexterityModifier = 3;
			}
		}
	
	public static void findCharismaModifier()
		{
		if(charisma == 3)
			{
			charismaModifier = -3;
			}
		if(charisma == 4 || charisma == 5)
			{
			charismaModifier = -2;
			}
		if(charisma == 6 || charisma == 7 || charisma == 8)
			{
			charismaModifier = -1;
			}
		if(charisma == 9 || charisma == 10 || charisma == 11 || charisma == 12)
			{
			charismaModifier = 0;
			}
		if(charisma == 13 || charisma == 14 || charisma == 15)
			{
			charismaModifier = 1;
			}
		if(charisma == 16 || charisma == 17)
			{
			charismaModifier = 2;
			}
		if(charisma == 18)
			{
			charismaModifier = 3;
			}
		}
	
	public static void findConstitutionModifier()
		{
		if(constitution == 3)
			{
			constitutionModifier = -3;
			}
		if(constitution == 4 || constitution == 5)
			{
			constitutionModifier = -2;
			}
		if(constitution == 6 || constitution == 7 || constitution == 8)
			{
			constitutionModifier = -1;
			}
		if(constitution == 9 || constitution == 10 || constitution == 11 || constitution == 12)
			{
			constitutionModifier = 0;
			}
		if(constitution == 13 || constitution == 14 || constitution == 15)
			{
			constitutionModifier = 1;
			}
		if(constitution == 16 || constitution == 17)
			{
			constitutionModifier = 2;
			}
		if(constitution == 18)
			{
			constitutionModifier = 3;
			}
		}

	public static int rollFourSidedDie()
		{
		Random randomNumber = new Random();
		fourSidedDie = 1 + randomNumber.nextInt(3);
		return fourSidedDie;
		}
	
	public static int rollSixSidedDie()
		{
		Random randomNumber = new Random();
		sixSidedDie = 1 + randomNumber.nextInt(6);
		return sixSidedDie;
		}
	
	public static int rollEightSidedDie()
		{
		Random randomNumber = new Random();
		eightSidedDie = 1 + randomNumber.nextInt(8);
		return eightSidedDie;
		}
	
	public static int rollTwelveSidedDie()
		{
		Random randomNumber = new Random();
		twelveSidedDie = 1 + randomNumber.nextInt(12);
		return twelveSidedDie;
		}
	
	public static int rollTwentySidedDie()
		{
		Random randomNumber = new Random();
		twentySidedDie = 1 + randomNumber.nextInt(20);
		return twentySidedDie;
		}
	}
