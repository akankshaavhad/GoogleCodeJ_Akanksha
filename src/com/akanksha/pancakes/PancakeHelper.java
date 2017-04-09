package com.akanksha.pancakes;

public class PancakeHelper {
	
	public static int c=0;
	
	public String helpconvert(String s) {
		c=c+1;
		String[] splited = s.split("\\s+");
		String input = splited[0];
		StringBuffer s_new = new StringBuffer(input);
		int k = Integer.parseInt(splited[1]);
		int count = 0;
		for (int i = 0; i < s_new.length(); i++) {

			if (s_new.charAt(i) == '-') {

				String a = s_new.substring(i, s_new.length());

				if (a.length() >= k) {
					for (int j = i; j < k + i && j < s_new.length(); j++) {

						if (s_new.charAt(j) == '-') {
							s_new.setCharAt(j, '+');

						} else {
							s_new.setCharAt(j, '-');
						}
					}
					count = count + 1;
				}
			}
		}

		for (int m = 0; m < s_new.length(); m++) {
			if (s_new.charAt(m) == '-') {
				return "Case #"+c+": "+"IMPOSSIBLE";
			}
		}
		return "Case #"+c+": "+String.valueOf(count);
	}
}
