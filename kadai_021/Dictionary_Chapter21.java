package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	private HashMap<String,String> pairs = new HashMap<String,String>();
	//private HashMap<String,String> pairs;
	
	public Dictionary_Chapter21 () {
		this.pairs.put( "apple", "りんご" );
		this.pairs.put( "peach", "桃" );
		this.pairs.put( "banana", "バナナ" );
		this.pairs.put( "lemon", "レモン" );
		this.pairs.put( "pear", "梨" );
		this.pairs.put( "kiwi", "キウィ" );
		this.pairs.put( "strawberry", "いちご" );
		this.pairs.put( "grape", "ぶどう" );
		this.pairs.put( "muscat", "マスカット" );
		this.pairs.put( "cherry", "さくらんぼ" );
	}
	
	public String lookUp ( String word ) {
		
		String ans = "";
		
		for ( String key : pairs.keySet() ) {
			if ( key == word ) {
				ans = key + "の意味は" + this.pairs.get(key);
				return ans;
			}
		}
		ans = word + "は辞書に存在しません";
		return ans;
	}
	
	
	
}
