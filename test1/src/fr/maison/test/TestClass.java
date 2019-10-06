package fr.maison.test;

import fr.maison.classe.Animal;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal a= new Animal("chat", 12, 1);
		
		a.quelleRace();
		a.quelleAge();
		
		System.out.println(a.quelleRace());
	   
		System.out.println(a.getSexe());
		System.out.println(a.getAge());
		
		a.setSexe(3);
		System.out.println(a.getSexe());

	}

}
