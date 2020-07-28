package rr.com.chapter5.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class SqlSessionFactoryUtils {
    private final  static  Class<SqlSessionFactoryUtils> LOCK=SqlSessionFactoryUtils.class;
    private static SqlSessionFactory sqlSessionFactory;
    private  SqlSessionFactoryUtils(){}
    public static SqlSessionFactory getSqlSessionFactory(){
        if(sqlSessionFactory!=null)
            return sqlSessionFactory;
        synchronized (LOCK){
            String resource= "mybatis_config.xml";
            InputStream ins;
            try{
                ins = Resources.getResourceAsStream(resource);
                sqlSessionFactory =(new SqlSessionFactoryBuilder()).build(ins);
            } catch (IOException e) {
                e.printStackTrace();
                return null;
            }
            return sqlSessionFactory;
        }
    }
    public static SqlSession openSqlSession(){
        if(sqlSessionFactory==null)
            getSqlSessionFactory();
        return sqlSessionFactory.openSession();
    }
}
