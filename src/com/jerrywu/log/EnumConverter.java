package com.jerrywu.log;



public class EnumConverter implements ITypeConverter{

	@Override
	public Object Convert(String value) {
		//列舉轉換不適用，因此丟出一個例外訊息 
		//throw new NotImplementedException();
		return null;
	}
	
    @SuppressWarnings("unchecked")
	public  Object Convert(@SuppressWarnings("rawtypes") Class EnumType, String value)
    {
    	if(!EnumType.isEnum())
    	{
    		 //throw new NotImplementedException();
    		return null;
    	}
    	else
    	{
    		 return Enum.valueOf(EnumType, value);
    	}
    	/*
        if (!EnumType.IsEnum)
            throw new InvalidOperationException("ERROR_TYPE_IS_NOT_ENUMERATION");
        return System.Convert.ChangeType(Enum.Parse(EnumType, ValueToConvert.ToString()), EnumType);
        */

    }

}
