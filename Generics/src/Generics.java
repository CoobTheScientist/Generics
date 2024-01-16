/*
 * Yacob Ahmad
 * 2-17-2023
 * CPSC - 4148 Adv. Java
 * Week 4 Generics Assignment
 */

import java.util.*;

public class Generics{

	public static class RandomPermutation<T> {
		// Method to randomize list
		public List<T> random(List<T> console){
			//make a copy
			List<T> copy = new ArrayList<>();
			for (int i = 0; i < console.size(); i++) {
				copy.add(console.get(i));
			}
			//make random order
			for(int i = 0; i < copy.size(); i++) {
				int spot = (int) (Math.random() * copy.size());
				T temp = copy.get(i);
				copy.set(i, copy.get(spot));
				copy.set(spot, temp);
			}
			return copy;
		}

	}
	public static void main(String args[]) {
		System.out.println("Original String List: ");
		//make list of strings
		String[] one = {"Ann", "Billy", "Carol", "Douglas", "Greg", "Harriet", "Jennifer", "Patrick", "Zoey"};
		List<String> first = Arrays.asList(one);
		
		//print the list
		System.out.print(first);
		
		//Create object
		RandomPermutation<String> perm1 = new RandomPermutation<String>();
		
		List<String> second = perm1.random(first);
		
		System.out.println("\n\nRandomized String List:\n" + second);
		
		
		//List of Integers
		System.out.println("\nOriginal List of Integers: ");
		
		Integer[] two = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		
		List<Integer> third = Arrays.asList(two);
		
		System.out.println(third);
		
		RandomPermutation<Integer> perm2 = new RandomPermutation<Integer>();
		
		List<Integer> fourth = perm2.random(third);
		
		System.out.println("\nRandomized Integer List: \n" + fourth);
		
	}

}
