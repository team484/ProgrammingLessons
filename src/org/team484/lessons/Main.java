package org.team484.lessons;

public class Main {

	public static void main(String[] args) {
		System.out.println("calling 3 times");
		repeatCall(3);
		System.out.println("calling 8 times");
		repeatCall(8);
		
		int sum = sumSeries(10);
		System.out.println(sum);
	}
	
	static int sumSeries(int upTo) {
		int sum = 0;
		for (int i = 0; i < upTo; i++) {
			sum += i;
		}
		return sum;
	}
	
	static void repeatCall(int numberOfTimes) {
		for (int i = 0; i < numberOfTimes; i++) {
			callThis();
		}
	}
	
	static void callThis() {
		System.out.println("Called!");
	}

}
