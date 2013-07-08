package com.jerrywu.log;

/**
 * 
 * 轉成字串
 *
 */
public class StringConverter implements ITypeConverter{

	@Override
	public Object Convert(String value) {
			if(value == null)
			{
				 return "";
			}
		
			return String.valueOf(value);
	}


}
