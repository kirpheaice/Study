package j2se8.ch16;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.sql.ConnectionPoolDataSource;

public class MetaDataDemo
{

	public static void main(String[] args)
	{
		test();
	}
	static void test()
	{
		Connection conn=null;
		Statement stmt=null;
		try
		{
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("Oracle JDBC driver loaded ok.");
			conn=DriverManager.getConnection("jdbc:oracle:thin:twStock/1qaz2wsx@127.0.0.1:51521:xe");
			System.out.println("Connect with @oracle:51521:xe");
			stmt=conn.createStatement();
			DatabaseMetaData mataData=conn.getMetaData();
			System.out.println(mataData.supportsTransactionIsolationLevel(Connection.TRANSACTION_NONE));
			System.out.println(mataData.supportsTransactionIsolationLevel(Connection.TRANSACTION_READ_COMMITTED));
			System.out.println(mataData.supportsTransactionIsolationLevel(Connection.TRANSACTION_READ_UNCOMMITTED));
			System.out.println(mataData.supportsTransactionIsolationLevel(Connection.TRANSACTION_REPEATABLE_READ));
			System.out.println(mataData.supportsTransactionIsolationLevel(Connection.TRANSACTION_SERIALIZABLE));
			
		}
		catch(Exception e)
		{
			
		}
		finally
		{
			if(stmt!=null)
			{
				try
				{
					stmt.close();
					System.out.println("Stmt Closed.");
				}
				catch(Exception ex)
				{
					System.out.println(ex);
				}
			}
			
			if(conn!=null)
			{
				try
				{
					conn.close();
					System.out.println("Conn Closed.");
				}
				catch(Exception ex)
				{
					System.out.println(ex);
				}
			}
		}
		
	}
}
