package kadai_021;

public class DictionayExec_Chapter21 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();
		
		String[] wordList = {"apple", "banana", "grape", "orange"};
		
		for ( String word : wordList ) {
			System.out.println( dictionary.lookUp( word ));
		}
	}

}