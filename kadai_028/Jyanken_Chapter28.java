package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {

	public String getMyChoice() {
		
	System.out.println("自分のじゃんけんの手を入力しましょう");
	System.out.println("グーrockのrを入力しましょう");
	System.out.println("チョキはscissorsのsを入力しましょう");
	System.out.println("パーはpaperのpを入力しましょう");
	

	//Scannerクラスのオブジェクトを生成する
	Scanner scanner = new Scanner(System.in);
	
	//入力した内容を取得する
	String input = scanner.next();
	
	if(input.equals("r")||input.equals("s")|| input.equals("p")) {

		//Scannerクラスのオブジェクトをクローズする
		scanner.close();
		
	}else {
		System.out.println("じゃんけんの正しい手（ｒ、ｓ、ｐ）を再入力してください。");
	}
	return input;
	}
	
	
	//対戦相手のじゃんけんの手を乱数で選ぶ
	public String getRandom() {
		String[] rspArray = {"r","s","p"};
		String random = rspArray[(int)Math.floor(Math.random()*3)];
		return random;
		
	}
	
	//じゃんけんを行うメソッド
	public void playGame() {

    HashMap<String,String> jyankenMap = new HashMap<String,String>();

     jyankenMap.put("r","グー");
     jyankenMap.put("s","チョキ");
     jyankenMap.put("p","パー");
     
     //自分と相手のじゃんけんの手を取得
     String myChoice = getMyChoice();
     String otherChoice = getRandom();
     
     //要素の比較
     System.out.println("自分の手は" + jyankenMap.get(myChoice) + "," +"対戦相手の手は" + jyankenMap.get(otherChoice));
     
     //自分と相手のじゃんけんの手の比較
     if (myChoice.equals(otherChoice)) {
    	 System.out.println("あいこです");
     }else if ((myChoice.equals("r") && otherChoice.equals("s"))||(myChoice.equals("s") && otherChoice.equals("p")) ||
      (myChoice.equals("p") && otherChoice.equals("r"))) {

         System.out.println("自分の勝ちです");
     }else {

         System.out.println("自分の負けです");
     }
     
		
	}

	}
