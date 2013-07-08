package com.jerrywu.database;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 
 * 標籤類別
 *
 */
public class AWSTab {

		// 資料庫表格名稱
		@Target({ ElementType.TYPE })
		@Retention(RetentionPolicy.RUNTIME)
		public @interface TableName {
			String value();
		}
	
		// 資料庫欄位名稱
		@Target({ ElementType.FIELD })
		@Retention(RetentionPolicy.RUNTIME)
		public @interface DBFieldName {
			String value();
		}
	
		// 轉成JSON的欄位名稱
		@Target({ ElementType.FIELD })
		@Retention(RetentionPolicy.RUNTIME)
		public @interface OutputFieldName {
			String value();
		}
	
		//不寫入資料庫
		@Target({ ElementType.FIELD })
		@Retention(RetentionPolicy.RUNTIME)
		public @interface nonPersistent {
		}
			
		//關聯資料
		@Target({ ElementType.FIELD })
		@Retention(RetentionPolicy.RUNTIME)
		public @interface foreignKey  {
				Class<?> value();
		}
		
		//關聯資料
		@Target({ ElementType.FIELD })
		@Retention(RetentionPolicy.RUNTIME)
		public @interface ReferKey  {
				Class<?> value();
		}
}
