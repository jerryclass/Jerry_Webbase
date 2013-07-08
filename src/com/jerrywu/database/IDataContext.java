package com.jerrywu.database;

import java.lang.reflect.Field;
import org.json.JSONObject;

/**
 * 
 * 資料庫定義(介面)
 *
 */
public interface IDataContext {
		/**
		 * 取得表格名稱
		 * @return 類別所對應的資料表名稱
		 */
		public String getTableName();
		
		/**
		 * 取得PK名稱
		 * @return 表格所對應的PK欄位名稱
		 */
		public String getItemName(); 
		
		/**
		 * 取得FK名稱
		 * @param type 類別
		 * @return 欄位
		 */
		public <T> Field  getForeignKeyField(Class <T> type);
		
		/**
		 * 將DataContext轉為JSONObject型態
		 * @return JSONObject
		 * @throws Exception
		 */
		public JSONObject toJSONObject() throws Exception;
}
