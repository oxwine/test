package com.huatai.study.study.algorithm;

import java.util.ArrayList;
import java.util.List;

public class ZigzagConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public String convert(String s, int numRows) {

		if (numRows == 1)
			return s;

		List<StringBuilder> rows = new ArrayList<StringBuilder>();
		for (int i = 0; i < Math.min(numRows, s.length()); i++)
			rows.add(new StringBuilder());

		int curRow = 0;
		boolean goingDown = false;

		for (char c : s.toCharArray()) {
			rows.get(curRow).append(c);
			if (curRow == 0 || curRow == numRows - 1)
				goingDown = !goingDown;
			curRow += goingDown ? 1 : -1;
		}

		StringBuilder ret = new StringBuilder();
		for (StringBuilder row : rows)
			ret.append(row);
		return ret.toString();
	}

	public String convert2(String s, int numRows) {

		if (numRows == 1)
			return s;

		StringBuilder ret = new StringBuilder();
		int n = s.length();
		int cycleLen = 2 * numRows - 2;

		for (int i = 0; i < numRows; i++) {
			for (int j = 0; j + i < n; j += cycleLen) {
				ret.append(s.charAt(j + i));
				if (i != 0 && i != numRows - 1 && j + cycleLen - i < n)
					ret.append(s.charAt(j + cycleLen - i));
			}
		}
		return ret.toString();
	}

//	作者：LeetCode
//	链接：https://leetcode-cn.com/problems/two-sum/solution/z-zi-xing-bian-huan-by-leetcode/
//	来源：力扣（LeetCode）
//	著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。

}
