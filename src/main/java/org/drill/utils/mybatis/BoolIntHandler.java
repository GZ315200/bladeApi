package org.drill.utils.mybatis;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BoolIntHandler extends BaseTypeHandler<Boolean> {

	
	
	@Override
	public Boolean getNullableResult(ResultSet rs, String columnName) throws SQLException {
        int i = rs.getInt(columnName);  
        if (rs.wasNull()) {  
            return null;  
        } else {  
            return locateEnumStatus(i);  
        }  
	}

	@Override
	public Boolean getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        int i = rs.getInt(columnIndex);
        if (rs.wasNull()) {  
            return null;  
        } else {  
            return locateEnumStatus(i);  
        }  
	}

	@Override
	public Boolean getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        int i = cs.getInt(columnIndex);
        if (cs.wasNull()) {  
            return null;  
        } else {  
            return locateEnumStatus(i);  
        }  
	}

	@Override
	public void setNonNullParameter(PreparedStatement ps, int i, Boolean parameter, JdbcType jdbcType) throws SQLException {
        ps.setInt(i, parameter?1:0);  
		
	}
	
    private Boolean locateEnumStatus(int code) {  
        return   code==0?false:true;
    }  

}
