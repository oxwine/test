package com.huatai.study.study.DailyPractice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class SensitiveMap {

	HashMap sensitiveWordMap;
	TreeMap d = new TreeMap();
	public static void main(String[] args) {
		Set<String> keyWord = new HashSet<String>();
		keyWord.add("王八蛋");
		keyWord.add("王八羔子");

		SensitiveMap sm = new SensitiveMap();

		sm.addSensitiveWordToHashMap(keyWord);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void addSensitiveWordToHashMap(Set<String> keyWordSet) {

		sensitiveWordMap = new HashMap(keyWordSet.size());

		String key = null;

		Map nowMap = null;

		Map<String, String> newWordMap = null;

		// 获取输入字符串迭代器
		Iterator<String> iterator = keyWordSet.iterator();

		while (iterator.hasNext()) {
			key = iterator.next();

			nowMap = sensitiveWordMap;
			// 获取每一个字符
			for (int i = 0; i < key.length(); i++) {
				char keyChar = key.charAt(i);

				// 获取字符后在wordMap中查找
				Object wordMap = nowMap.get(keyChar);

				if (wordMap != null) {
					nowMap = (Map) wordMap;
				} else {
					newWordMap = new HashMap<String, String>();

					newWordMap.put("isEnd", "0");

					nowMap.put(keyChar, newWordMap);

					nowMap = newWordMap;

				}

				if (i == key.length() - 1) {

					nowMap.put("isEnd", "1");

				}
			}
		}

	}

}
