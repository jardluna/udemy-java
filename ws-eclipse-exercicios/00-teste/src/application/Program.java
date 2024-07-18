package application;

import java.util.ArrayList;
import java.util.List;

public class Program {
	
	public static void main(String[] args) {
		
		List<Integer> num = new ArrayList<>();
		
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(5);
		num.add(6);
		num.add(7);
		
		for(Integer c : num) {
			if(c % 2 == 0) {
				System.out.println(c);
			}
		}
		
	}
}



