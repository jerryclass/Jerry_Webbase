package com.jerrywu.log;


/**
 * 十六進為轉十進位
 *
 */
public class DecimalConverter implements ITypeConverter {

	@Override
	public Object Convert(String value) {
		if(value == null || value.equals(""))
		{
			 return 0;
		}
		else
		{
			Integer.parseInt(value, 16);
		}
		return null;
	}

}
