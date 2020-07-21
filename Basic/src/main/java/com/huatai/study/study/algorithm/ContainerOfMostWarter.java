package com.huatai.study.study.algorithm;

public class ContainerOfMostWarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// 双指针解法
	public int maxArea(int[] height) {
		int maxarea = 0, l = 0, r = height.length - 1;
		while (l < r) {
			maxarea = Math.max(maxarea, Math.min(height[l], height[r]) * (r - l));
			if (height[l] < height[r])
				l++;
			else
				r--;
		}
		return maxarea;String
	}

//作者：LeetCode
//链接：https://leetcode-cn.com/problems/two-sum/solution/sheng-zui-duo-shui-de-rong-qi-by-leetcode/
//来源：力扣（LeetCode）
//著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。

}
