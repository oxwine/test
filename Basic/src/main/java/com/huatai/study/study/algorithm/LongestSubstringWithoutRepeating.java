package com.huatai.study.study.algorithm;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//method1
	public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int ans = 0;
        for (int i = 0; i < n; i++)
            for (int j = i + 1; j <= n; j++)
                if (allUnique(s, i, j)) ans = Math.max(ans, j - i);
        return ans;
    }

    public boolean allUnique(String s, int start, int end) {
        Set<Character> set = new HashSet<Character>();
        for (int i = start; i < end; i++) {
            Character ch = s.charAt(i);
            if (set.contains(ch)) return false;
            set.add(ch);
        }
        return true;
    }

//作者：LeetCode
//链接：https://leetcode-cn.com/problems/two-sum/solution/wu-zhong-fu-zi-fu-de-zui-chang-zi-chuan-by-leetcod/
//来源：力扣（LeetCode）
//著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。

}
