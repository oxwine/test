package com.huatai.study.study.algorithm;

public class findMedianSortedArrays {

	public static void main(String[] args) {
		int[] aa = new int[128];
		System.out.print(aa[96]);

	}
	 public double findMedianSortedArrays(int[] A, int[] B) {
	        int m = A.length;
	        int n = B.length;
	        if (m > n) { // to ensure m<=n
	            int[] temp = A; A = B; B = temp;
	            int tmp = m; m = n; n = tmp;
	        }
	        int iMin = 0, iMax = m, halfLen = (m + n + 1) / 2;
	        while (iMin <= iMax) {
	            int i = (iMin + iMax) / 2;
	            int j = halfLen - i;
	            if (i < iMax && B[j-1] > A[i]){
	                iMin = i + 1; // i is too small
	            }
	            else if (i > iMin && A[i-1] > B[j]) {
	                iMax = i - 1; // i is too big
	            }
	            else { // i is perfect
	                int maxLeft = 0;
	                if (i == 0) { maxLeft = B[j-1]; }
	                else if (j == 0) { maxLeft = A[i-1]; }
	                else { maxLeft = Math.max(A[i-1], B[j-1]); }
	                if ( (m + n) % 2 == 1 ) { return maxLeft; }

	                int minRight = 0;
	                if (i == m) { minRight = B[j]; }
	                else if (j == n) { minRight = A[i]; }
	                else { minRight = Math.min(B[j], A[i]); }

	                return (maxLeft + minRight) / 2.0;
	            }
	        }
	        return 0.0;
	    }

//	作者：LeetCode
//	链接：https://leetcode-cn.com/problems/two-sum/solution/xun-zhao-liang-ge-you-xu-shu-zu-de-zhong-wei-shu-b/
//	来源：力扣（LeetCode）
//	著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。

}
