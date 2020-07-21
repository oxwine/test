package com.huatai.study.study.algorithm;

public class IntegerToRoman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public String intToRoman(int num) {
        //用数组定义字典
        int[] values={1000,900,500,400,100,90,50,40,10,9,5,4,1}; 
        String[] strs={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        
        //定义一个字符串
        StringBuilder res = new StringBuilder();
        
        for(int i = 0; i <values.length; i ++){
            int a = num / values[i];
            if(a==0)continue;
            for(int j = a; j > 0;j --)
                res.append(strs[i]);
            num -= (a*values[i]);
            if(num ==0)break;
        }
        return res.toString();
        
    }

//作者：powcai
//链接：https://leetcode-cn.com/problems/two-sum/solution/ha-xi-jie-jue-by-powcai/
//来源：力扣（LeetCode）
//著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。

}
