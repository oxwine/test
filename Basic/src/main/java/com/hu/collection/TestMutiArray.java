package com.hu.collection;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class TestMutiArray {

	public static void main(String[] args) {
		int[][] a = {
				{1,2},
				{3,4,5,6},
				{2,3,4}
		};
		
		
		int[][] b = new int[3][];
		b[0] = new int[2];
		b[1] = new int[4];
		b[2] = new int[3];
		
		b[0][0] =1;
		b[0][1] =2;

	}


}
