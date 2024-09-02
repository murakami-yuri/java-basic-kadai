package kadai_026;

import java.util.Scanner;

public class Jyanken_Chapter26 {

	public String getMyChoice () {
		
		Scanner scanner = new Scanner(System.in);
		String input = "";
		int counter = 0;
		
		do {
			if ( counter != 0 ) {
				System.out.println("正しいじゃんけんの手ではありません");
			}
			
			System.out.println("自分のじゃんけんの手を入力しましょう");
			System.out.println("グーはrockのrを入力しましょう");
			System.out.println("チョキはscissorsのsを入力しましょう");
			System.out.println("パーはpaperのpを入力しましょう");
			
			input = scanner.nextLine();
			counter ++;
			
		}while ((!input.equals("r")) && (!input.equals("p")) && (!input.equals("s")));
		
		scanner.close();
		return input;
		
	}
	
	public String getRandom () {
		
		String[] jyanken = {"r", "p", "s"};
		int choice_i = (int)(Math.floor(Math.random()*3));
		
		return jyanken[choice_i];
	}
	
	public void playGame (String mine, String others) {
		
		String main_name = "";
		String others_name = "";
		
		main_name = switch(mine) {
			case "r" -> "グー";
			case "p" -> "パー";
			case "s" -> "チョキ";
			default -> "";
		};
		
		others_name = switch(others) {
			case "r" -> "グー";
			case "p" -> "パー";
			case "s" -> "チョキ";
			default -> "";
		};
		
		System.out.println("自分の手は" + main_name + ",対戦相手の手は" + others_name);
		
		if ( mine.equals(others) ) {
			System.out.println( "あいこです" );
			return;
		} else if ( mine.equals("r") ) {
			if ( others.equals("s") ) {
				System.out.println( "自分の勝ちです" );
			}
			else {
				System.out.println( "自分の負けです" );
			}
		} else if ( mine.equals("p") ) {
			if ( others.equals("r") ) {
				System.out.println( "自分の勝ちです" );
			}
			else {
				System.out.println( "自分の負けです" );
			}
		} else if ( mine.equals("s") ) {
			if ( others.equals("p") ) {
				System.out.println( "自分の勝ちです" );
			}
			else {
				System.out.println( "自分の負けです" );
			}
		}
	}
}
