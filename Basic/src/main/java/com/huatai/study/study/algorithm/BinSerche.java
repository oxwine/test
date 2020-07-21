package com.huatai.study.study.algorithm;

public class BinSerche {

	// 只会把比自己大的覆盖成小的
	// 二分法
	// 如果有一连串数跟 target 相同，则返回索引最靠前的

	// 特例： 3 5 5 5 5 5 5 5 5 5
	// 特例： 3 6 7 8

	// System.out.println("尝试过的值：" + mid);
	// 1 2 3 5 5 5 5 5 5 6 ，target = 5
	// 1 2 3 3 5 5 5 6 target = 4

	public int searchInsert(int[] nums, int target) {
		int len = nums.length;
		if (len == 0) {
			return -1;
		}
		if (nums[len - 1] < target) {
			return len;
		}
		int left = 0;
		int right = len - 1;
		while (left < right) {
			int mid = left + (right - left) / 2;
			if (nums[mid] < target) {
				// nums[mid] 的值可以舍弃

				left = mid + 1;
				System.out.println("pos is" + mid + "  value is:" + nums[mid] + "  left is" + mid);
			} else {
				// nums[mid] 不能舍弃
				right = mid;
				System.out.println("pos is" + mid + "  value is:" + nums[mid] + "  right is" + mid);
			}
		}
		return left;
	}

	public static void main(String[] args) {
//		int[] nums = { 1, 2, 3, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5,
//				5, 5, 6 };
//		int target = 4;
//		System.out.println(nums.length);
		BinSerche solution2 = new BinSerche();
		int[] nums = {-1,0,3,5,9,12};int target = 3;
		System.out.println(solution2.checkIsExist(nums, target));
	}

	public int checkIsExist(int[] num, int target) {
		int left = 0;
		int right = num.length;

		
		while (left < right) {
			int mid = (left + right) >>> 1;
			if (num[mid] == target)
				return mid;
			if (num[mid] > target) {
				right = mid;
			} else if (num[mid] < target) {
				left = mid+1;
			}
		}
		return (num[left]==target)?left:-1;
	}
}

//作者：liweiwei1419
//链接：https://leetcode-cn.com/problems/two-sum/solution/te-bie-hao-yong-de-er-fen-cha-fa-fa-mo-ban-python-/
//来源：力扣（LeetCode）
//著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
