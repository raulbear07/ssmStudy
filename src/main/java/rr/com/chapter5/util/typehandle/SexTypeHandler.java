package rr.com.chapter5.util.typehandle;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;
import org.apache.ibatis.type.TypeHandler;
import rr.com.chapter5.pojo.SexEum;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SexTypeHandler  implements TypeHandler<SexEum> {


    public void setParameter(PreparedStatement preparedStatement, int i, SexEum sexEum, JdbcType jdbcType) throws SQLException {
        preparedStatement.setInt(i,sexEum.getId());

    }

    public SexEum getResult(ResultSet resultSet, String s) throws SQLException {
        int id =resultSet.getInt(s);
        return null;
    }

    public SexEum getResult(ResultSet resultSet, int i) throws SQLException {
        int id =resultSet.getInt(i);
        return null;
    }

    public SexEum getResult(CallableStatement callableStatement, int i) throws SQLException {
        return null;
    }
}
