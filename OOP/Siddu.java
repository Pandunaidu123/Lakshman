package oop;

public class Siddu {
	String name = "Lakshman";

	public void xerox() {
		System.out.println(name);
	}

	class Animal extends Siddu {
		String name = "Lion";

		public void print() {

			System.out.println(name);

		}
	}

	public static void main(String[] args) {

		Siddu s = new Siddu();
		Siddu.Animal a = s.new Animal();
		a.print();

	}
}
