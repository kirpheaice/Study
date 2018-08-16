package j2se8.ch16;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class TMessageInfoDemo
{

	public static void main(String[] args)
	{
		test();
	}
	static void test()
	{
		Connection conn=null;
		try
		{
			Class.forName("oracle.jdbc.OracleDriver");

			JdbcRowSet jrs=RowSetProvider.newFactory().createJdbcRowSet();
			jrs.setUrl("jdbc:oracle:thin:twStock/1qaz2wsx@127.0.0.1:51521:xe");
			jrs.setCommand("select count(*) from STOCK_DAY ");
			jrs.execute();
			if(jrs.next())
				System.out.printf("JRS=%d %n",jrs.getInt(1));
			
			System.out.println("Oracle JDBC driver loaded ok.");
			conn=DriverManager.getConnection("jdbc:oracle:thin:twStock/1qaz2wsx@127.0.0.1:51521:xe");
			System.out.println("Connect with @oracle:51521:xe");
			TMessageInfo info=new TMessageInfo(conn);
			System.out.printf("%-15s%-10s%10s%n","Name","Type","Size");
			System.out.println("===================================");
			info.getAllColumnInfo().forEach(x->System.out.printf("%-15s%-10s%10d%n",x.getName(),x.getType(),x.getSize()));
			System.out.println("===================================");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			
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
