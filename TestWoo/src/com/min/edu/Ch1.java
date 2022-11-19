package com.min.edu;

public class Ch1 {

	//두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.
	public static void main(String[] args) {
		
		int[] val = {2,1,2,1,2,1};
		for (int a : solution(val)) {
			
			System.out.print(a+" ");
		}

	}
	
	public static int[] solution(int[] input) {
		int[] sol = {1,1,2,2,2,8};
		int[] result = new int[6];
		for (int i = 0; i < sol.length; i++) {
			result[i] = sol[i] - input[i];
		}
		return result;
	}

}
