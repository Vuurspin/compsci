//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;


public class MonsterRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter 1st monster's name : ");
		String name = keyboard.next();
		System.out.print("Enter 1st monster's size : ");
		int size=keyboard.nextInt();
		Monster mOne = new Monster(name, size);
		System.out.print("Enter 2nd monster's name : ");
		name = keyboard.next();
		System.out.print("Enter 2nd monster's size : ");
		size=keyboard.nextInt();
		Monster mTwo = new Monster(name, size);
		if(mOne.isBigger(mTwo)==true)
		{
			System.out.println("Monster one is bigger than Monster two.");
		}
		else if(mOne.isSmaller(mTwo)==true)
		{
			System.out.println("Monster one is smaller than Monster two.");
		}
		if(mOne.namesTheSame(mTwo)==true)
		{
			System.out.println("Monster one has the same name as Monster two.");
		}
		//ask for name and size
		
		//instantiate monster one
		
		//ask for name and size
		
		//instantiate monster two
	}
}