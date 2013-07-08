package com.jerrywu.log;

/**
 * 整數轉字串
 *
 */
public class LongConverter implements ITypeConverter {

	@Override
	public Object Convert(String value) {
		if(value == null)
		{
			 return 0;
		}
		else
		{
			return Long.parseLong(value);
		}
	}

}
