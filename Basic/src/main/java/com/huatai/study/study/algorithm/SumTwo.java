package com.huatai.study.study.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Hello world!
 *
 */
public class SumTwo 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        SumTwo test= new SumTwo();
        int[] resource = {1,4,5,6,0};
        ArrayList<int[]> res = test.twoSum(resource, 5);
        System.out.println("indexes is:"+res.get(0)[0]+":"+res.get(0)[1]+
        		" and "+res.get(1)[0]+":"+res.get(1)[1]);
        int[] resource2 = {1,4,4,5,6,8};
        int[] res2 = test.twoSum2(resource2, 8);
        System.out.print("indexes is:"+res2[0]+" and "+res2[1]);
    }
    
    public ArrayList<int[]> twoSum(int[] nums, int target) {
    	
        HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
        ArrayList<int[]> sl = new ArrayList<int[]>();
        for (int i = 0; i < nums.length; i++) {
            m.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; ++i) {
            int t = target - nums[i];
            if (m.containsKey(t) && m.get(t) != i) {
                
                int[] needSum = new int[] {i,m.get(t)};
                Arrays.parallelSort(needSum);
                sl.add(needSum);
                
            }
        }
        return sl;
    }
    
    public int[] twoSum2(int[] nums, int target) {
//        HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
//        int[] res = new int[2];
//        for (int i = 0; i < nums.length; ++i) {
//            if (m.containsKey(target - nums[i])) {
//                res[0] = i;
//                res[1] = m.get(target - nums[i]);
//                break;
//            }
//            m.put(nums[i], i);
//        }
//        return res;
    	HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");

//    作者：LeetCode
//    链接：https://leetcode-cn.com/problems/two-sum/solution/liang-shu-zhi-he-by-leetcode-2/
//    来源：力扣（LeetCode）
//    著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
    }
}
