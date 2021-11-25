package Collections;

import java.util.Arrays;

public class ArrayBasic{
String name;
	public ArrayBasic(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		String[] name = {"c","a","b"};
		
		ComparatorEx cd = new ComparatorEx();
		Arrays.sort(name,cd);
		for (int i = 0;i < name.length;i++)
		System.out.println(name[i]);

	}

}
