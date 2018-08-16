package j2se8.ch16;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TMessageInfo
{
	private Connection conn;
	
	public TMessageInfo(Connection conn)
	{
		this.conn=conn;
	}
	
	public List<ColumnInfo> getAllColumnInfo()
	{
		List<ColumnInfo> list=null;
		try
		{
			DatabaseMetaData meta=conn.getMetaData();
			ResultSet crs=meta.getColumns(null, null, "STOCK_DAY", null);
			list=new ArrayList<>();
			while(crs.next())
			{
				ColumnInfo info=toColumnInfo(crs);
				list.add(info);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return list;
	}
	
	private ColumnInfo toColumnInfo(ResultSet crs) throws SQLException
	{
		ColumnInfo info=new ColumnInfo();
		info.setName(crs.getString("COLUMN_NAME"));
		info.setType(crs.getString("TYPE_NAME"));
		info.setSize(crs.getInt("COLUMN_SIZE"));
//		info.setNullable(crs.getBoolean("IS_NULLABLE"));
		info.setDef(crs.getString("COLUMN_DEF"));
		return info;
	}
}
