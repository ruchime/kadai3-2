package snakecamel;

public class SnakeCamelUtil {
	
	public static String snakeToCamelcase(String snake_case) {//スネークをキャメルにする
		String[] words = snake_case.split("_",-1);//"_"で分割された単語をwords配列へ入れる
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < words.length; i++) {
			sb.append(capitalize(words[i]));//分割した単語同士をつなげる。単語の頭は大文字。
		}
		return new String(sb);
	}
	 
	public static String camelToSnakecase(String camelcase) {//キャメルをスネークにする
		StringBuilder sb = new StringBuilder();
		int j = 0;
		for (int i = 0; i < camelcase.length(); i++) {
			char c = camelcase.charAt(i);
			if (Character.isUpperCase(c)) {//cが大文字ならば
				sb.append(camelcase.substring(j, i));//
				if (sb.length() > 0) {
					sb.append("_");
				}
				sb.append(Character.toLowerCase(c));//cを小文字にする
				j = i+1;
			}
		}
		sb.append(camelcase.substring(j));
		return new String(sb);
	}
	
	static String capitalize(String s) {//1文字目を大文字にする
		if(s.length()==0)return "";
		char first = s.charAt(0);
		char upperFirst = Character.toUpperCase(first);//大文字へ変換
		String rest = s.substring(1);//2文字目からrestに入れる
		return upperFirst + rest;//1文字目を大文字にした文字列を返す
	}

	static String uncapitalize(String s) {//1文字目を小文字にする
		char first = s.charAt(0);
		char lowerFirst = Character.toLowerCase(first);//小文字へ変換
		String rest = s.substring(1);
		return lowerFirst + rest;//1文字目を小文字にした文字列を返す
	}
	
}
