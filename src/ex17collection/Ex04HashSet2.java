package ex17collection;

import java.util.HashSet;

import common.Person;

public class Ex04HashSet2
{

	public static void main(String[] args)
	{
		HashSet<Person> hashset = new HashSet<Person>();
		
		Person p1 = new Person("정우성", 30);
		Person p2 = new Person("12", 30);
		Person p3 = new Person("정우성", 30);
		
		hashset.add(p1);
		hashset.add(p2);
		boolean b = hashset.add(p3);
		System.out.println("p3저장여부:"+ b);
		//hashset.add(p3);
		
		System.out.println("HashSet 저장된 객체수:" + hashset.size());
	}

}
