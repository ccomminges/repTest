package fr.maison.classe;

public class Animal {
	
	private String race;
	private int age;
	private int sexe;
	
	
	public Animal() {
		super();
	}


	public Animal(String race, int age, int sexe) {
		super();
		this.race = race;
		this.age = age;
		this.sexe = sexe;
	}


	public String getRace() {
		return race;
	}


	public void setRace(String race) {
		this.race = race;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getSexe() {
		return sexe;
	}


	public void setSexe(int sexe) {
		this.sexe = sexe;
	}

	
	
	public String quelleRace()
	{
		
		return getRace();
				
	}
	
	public void quelleAge()
	{
		
		System.out.println(getAge());
				
	}
	
	

	@Override
	public String toString() {
		return "Animal [race=" + race + ", age=" + age + ", sexe=" + sexe + "]";
	}
	
	
	
	

}
