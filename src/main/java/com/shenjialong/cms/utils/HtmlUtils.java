package com.shenjialong.cms.utils;

/**
 * 
 * @author zhuzg
 *
 */
public class HtmlUtils {
	
	/**
	 * html 字符的转义处理
	 * @param str
	 * @return
	 */
	public static String htmlspecialchars(String str) {
		str = str.replaceAll("&", "&amp;");
		str = str.replaceAll("<", "&lt;");
		str = str.replaceAll(">", "&gt;");
		str = str.replaceAll("\"", "&quot;");
		return str;
	}

}
