package example;

import java.util.*;
class Solution {
    int solution(int[] A) {
        int n = A.length;
        int[] L = new int[n + 1];
        L[0] = -1;
        for (int i = 0; i < n; i++) {
            L[i + 1] = A[i];
        }
        int count = 0;
        System.out.println("");
        int pos = (n + 1) / 2;
        int candidate = L[pos];
        for (int i = 1; i < n; i++) {
            if (L[i] == candidate)
                count = count + 1;
        }
        if (count > pos)
            return candidate;
        return (-1);
    }
    
    public static void main(String[] args) {
		// TODO Auto-generated method stub
    	int[] A = {1, 1, 1, 1, 50};
    	System.out.println(new Solution().solution(A));
	}
}
