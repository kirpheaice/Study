package j2se8.ch16;

import java.io.OutputStream;

import javax.sql.rowset.RowSetProvider;
import javax.sql.rowset.WebRowSet;

public class TMessageUtil
{

	public static void main(String[] args) throws Exception
	{
		writeXml(System.out);
	}

	static void writeXml(OutputStream outputStream) throws Exception
	{
		Class.forName("oracle.jdbc.OracleDriver");
		try(WebRowSet rs=RowSetProvider.newFactory().createWebRowSet())
		{
			rs.setUrl("jdbc:oracle:thin:twStock/1qaz2wsx@127.0.0.1:51521:xe");
			rs.setCommand("select * from stock_list");
			rs.execute();
			rs.writeXml(outputStream);
		}
	}
}
