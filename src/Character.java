
public class Character {
	String race;
	String gender;
	String fname;
	String lname;
	String temperament;
	String occupation;
	String mannerism;
	String appearance;
	int age;
	
	public Character() {
		occupation = main.Occupation();
		gender = main.Gender();
		race = main.Race();
		fname = main.FName(race, gender);
		lname = main.LNames();
		appearance =main.Appearance();
		temperament = main.Temperament();
		mannerism = main.Mannerism();
		
	}
	
	public Object[] getArray() {
		return new Object[] {fname, lname, appearance,temperament,mannerism,occupation,race,gender};
	}
}
