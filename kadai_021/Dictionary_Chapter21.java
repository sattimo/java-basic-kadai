package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {

		HashMap<String,String> mojiMap = new HashMap<String,String>();
		
		public Dictionary_Chapter21() {
		mojiMap.put("apple","りんご");
		mojiMap.put("peach","桃");
		mojiMap.put("banana","バナナ");
		mojiMap.put("lemon","レモン");
		mojiMap.put("pear","なし");
		mojiMap.put("kiwi","キウイ");
		mojiMap.put("strawberry","いちご");
		mojiMap.put("grape","ぶどう");
		mojiMap.put("mascat","マスカット");
		mojiMap.put("cherry","チェリー");
		
		
	}
	
	public void seach (String[]words) {
		for(String word : words) {
			if(mojiMap.containsKey(word)) {
				System.out.println(word + "の意味は" + mojiMap.get(word));
				}else {
					System.out.println(word + "は辞書に存在しません");
				}
		}
		
	}
	}
