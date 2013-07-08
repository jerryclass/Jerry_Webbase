package com.jerrywu.database;

import java.lang.reflect.Field;
import org.json.JSONObject;

/**
 * 
 * 資料庫定義(抽象類別)
 *
 */
public abstract class DataContext implements IDataContext {
	/**
	 * 取得表格名稱
	 * @return 類別所對應的資料表名稱
	 */
	public abstract String getTableName();
	
	/**
	 * 取得PK名稱
	 * @return 表格所對應的PK欄位名稱
	 */
	public abstract String getItemName(); 
	
	/**
	 * 取得FK名稱
	 * @param type 類別
	 * @return 欄位
	 */
	public abstract <T> Field  getForeignKeyField(Class <T> type);
	
	/**
	 * 將DataContext轉為JSONObject型態
	 * @return JSON 物件
	 * @throws Exception
	 */
	public abstract JSONObject toJSONObject() throws Exception;
}
