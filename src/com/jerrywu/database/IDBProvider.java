package com.jerrywu.database;

import java.io.IOException;
import java.util.Vector;

/**
 * 資料庫操作(介面)
 */
public interface IDBProvider {
		
		/**
		 * 開啟資料庫
		 */
		public void open();
		
		/**
		 * 關閉資料庫
		 */
		public void close();
	
		/**
		 * 執行SQL語法
		 * 
		 * @param c 物件型態
		 * @param sqlCommand SQL語法
		 * @param isEasy 是否為簡易查詢
		 * @return
		 * @throws IOException
		 * @throws InstantiationException
		 * @throws IllegalAccessException
		 */
		public  <T extends DataContext> Vector<T> executionQuerySQL(Class<T> c,String sqlCommand,boolean isEasy)	throws IOException, InstantiationException, IllegalAccessException ;
		
		/**
		 * 執行SQL語法
		 * 
		 * @param c 查詢物件
		 * @param sqlCommand SQL語法
		 * @return
		 * @throws IOException
		 * @throws InstantiationException
		 * @throws IllegalAccessException
		 */
		public  <T extends DataContext> Vector<T> executionQuerySQL(Class<T> c,String sqlCommand)	throws IOException, InstantiationException, IllegalAccessException;
		
		/**
		 * 查詢所有物件資料
		 * 
		 * @param c 物件名稱
		 * @param size 最大查詢筆數
		 * @param isEasy 簡易查詢
		 * @return
		 * @throws InstantiationException
		 * @throws IllegalAccessException
		 * @throws IOException
		 */
		public  <T extends DataContext> Vector<T> excutionQuery(Class<T> c,	int size,boolean isEasy) throws InstantiationException, IllegalAccessException, IOException;
		
		/**
		 * 查詢所有物件資料
		 * 
		 * @param c
		 *            物件名稱
		 * @param size
		 *            最大查詢筆數
		 * @return 物件陣列
		 * @throws IllegalAccessException 
		 * @throws InstantiationException 
		 * @throws IOException 
		 */
		public  <T extends DataContext> Vector<T> excutionQuery(Class<T> c,	int size) throws InstantiationException, IllegalAccessException, IOException ;
		
		/**
		 * 查詢所有物件資料
		 * 
		 * @param c
		 *            物件名稱
		 * @return 物件陣列
		 * @throws IOException 
		 * @throws IllegalAccessException 
		 * @throws InstantiationException 
		 */
		public  <T extends DataContext> Vector<T> excutionQuery(Class<T> c) throws InstantiationException, IllegalAccessException, IOException ;

		/**
		 * 查詢所有物件資料
		 * 
		 * @param c 物件名稱
		 * @param isEasy 是否為簡易搜尋
		 * @return
		 * @throws InstantiationException
		 * @throws IllegalAccessException
		 * @throws IOException
		 */
		public  <T extends DataContext> Vector<T> excutionQuery(Class<T> c,boolean isEasy) throws InstantiationException, IllegalAccessException, IOException;

		/**
		 * 利用條件查詢物件
		 * 
		 * @param c 物件名稱
		 * @param condition 查詢條件
		 * @param size 查詢最大筆數
		 * @param isEasy 簡易查詢
		 * @return
		 * @throws InstantiationException
		 * @throws IllegalAccessException
		 * @throws IOException
		 */
		public  <T extends DataContext> Vector<T> excutionQuery(Class<T> c,	String condition, int size,boolean isEasy) throws InstantiationException, IllegalAccessException, IOException;
		
		/**
		 * 利用條件查詢物件
		 * 
		 * @param c
		 *            物件名稱
		 * @param condition
		 *            條件
		 * @param size
		 *            查詢筆數
		 * @return 物件陣列
		 * @throws IllegalAccessException 
		 * @throws InstantiationException 
		 * @throws IOException 
		 */
		public  <T extends DataContext> Vector<T> excutionQuery(Class<T> c,	String condition, int size) throws InstantiationException, IllegalAccessException, IOException ;
		
		/**
		 * 利用條件查詢物件
		 * 
		 * @param c
		 *            物件名稱
		 * @param condition
		 *            條件
		 * @return 物件陣列
		 * @throws IOException 
		 * @throws IllegalAccessException 
		 * @throws InstantiationException 
		 */
		public  <T extends DataContext> Vector<T> excutionQuery(Class<T> c,	String condition) throws InstantiationException, IllegalAccessException, IOException;

		/**
		 * 利用條件查詢物件
		 * 
		 * @param c 物件名稱
		 * @param condition 條件
		 * @param isEasy 是否為簡易查詢
		 * @return
		 * @throws InstantiationException
		 * @throws IllegalAccessException
		 * @throws IOException
		 */
		public  <T extends DataContext> Vector<T> excutionQuery(Class<T> c,	String condition,boolean isEasy) throws InstantiationException, IllegalAccessException, IOException;

		/**
		 * 使用ID取得物件資料
		 * 
		 * @param c 物件型態
		 * @param id 查詢ID
		 * @param isEasy 是否為簡易查詢
		 * @return
		 * @throws InstantiationException
		 * @throws IllegalAccessException
		 * @throws IOException
		 */
		public  <T extends DataContext> T getDataById(Class<T> c, String id,boolean isEasy) throws InstantiationException, IllegalAccessException, IOException ;
		
		/**
		 * 使用ID取得物件資料
		 * 
		 * @param c 物件型態
		 * @param id 查詢ID
		 * @return
		 * @throws InstantiationException
		 * @throws IllegalAccessException
		 * @throws IOException
		 */
		public  <T extends DataContext> T getDataById(Class<T> c, String id) throws InstantiationException, IllegalAccessException, IOException ;

		
		/**
		 * 將物件新增進資料庫
		 * @param data
		 * @throws Exception
		 */
		public void makePersistent(DataContext data) throws Exception;

		
		/**
		 * 將物件從資料庫移除
		 * @param data
		 * @throws Exception
		 */
		public void deletePersistent(IDataContext data) throws Exception;

		/**
		 * 建立表格
		 * @param tableName
		 * @param primaryKey
		 * @throws Exception
		 */
		public void createTable(String tableName,String primaryKey) throws Exception;
}
