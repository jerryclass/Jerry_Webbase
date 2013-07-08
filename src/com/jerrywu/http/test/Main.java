package com.jerrywu.http.test;

import com.jerrywu.http.HTTPConnection;
import com.jerrywu.http.HTTPMethod;
import com.jerrywu.http.HTTPRequestTag;
import com.jerrywu.http.HTTPResponseTag;

/**
 * 最後修正日期 2013/07/08
 * @author Jerry
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//建立請求Tag
		HTTPRequestTag requestTag = new HTTPRequestTag("http://www.mis.kuas.edu.tw/",HTTPMethod.GET);
		
		//接收Server端的回應
		HTTPResponseTag responseTag = HTTPConnection.getResult(requestTag, "UTF-8");
		
		System.out.println(responseTag.getResponse());
		
	}

}
