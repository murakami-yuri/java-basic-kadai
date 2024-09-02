package kadai_026;

public class JyankenExec_Chapter26 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Jyanken_Chapter26 game = new Jyanken_Chapter26();
		
		String mine = game.getMyChoice ();
		String others = game.getRandom ();
		game.playGame( mine, others );
	}

}
