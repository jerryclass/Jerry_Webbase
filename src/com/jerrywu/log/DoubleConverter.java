package com.jerrywu.log;

/**
 * 字串轉Double
 *
 */
public class DoubleConverter implements ITypeConverter{

	@Override
	public Object Convert(String value) {
		if(value == null || value.equals("") )
		{
			 return Double.parseDouble("0.0");
		}
		else
		{
			 return Double.parseDouble(value);
		}
	}
	
}
