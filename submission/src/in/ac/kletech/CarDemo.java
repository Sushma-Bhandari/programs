package in.ac.kletech;

import in.ac.kletech.Car.Ferrari;
import in.ac.kletech.Car.Ferrari.BMW;

public class CarDemo {
	public static void main(String[] args){
		Ferrari f=new Ferrari("aaa","red",120,6,70);
		BMW b=new BMW("bbb","white",140,5,80);
		f.accelerate();
		System.out.println("Speed of Ferrari:"+f.iSpeed);
		b.accelerate();
		System.out.println("Speed of BMW:"+b.iSpeed);
		f.Break();
		System.out.println("Speed of Ferrari:"+f.iSpeed);
		b.Break();
		System.out.println("Speed of BMW:"+b.iSpeed);
		
		
		
		
		
	}

}
