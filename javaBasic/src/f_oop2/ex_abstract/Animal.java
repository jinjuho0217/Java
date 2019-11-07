package f_oop2.ex_abstract;

public abstract class Animal {
	
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		Snakehead snakehead = new Snakehead();
		
		dog.bark();
		cat.bark();
		snakehead.bark();
		
	}
	void run(){
		System.out.println("달려간다~");
	}
	abstract void bark();
	
}


class Dog extends Animal{

	@Override
	void bark() {
		System.out.println("멍멍");
	}
	
}
class Cat extends Animal{

	@Override
	void bark() {
		System.out.println("야옹");
	}
	
}
class Snakehead extends Animal{

	@Override
	void bark() {
		System.out.println("첨벙첨벙");
	}
	
}