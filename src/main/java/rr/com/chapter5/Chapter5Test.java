package rr.com.chapter5;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;
import rr.com.chapter5.mapper.EmployeeMapper;
import rr.com.chapter5.mapper.TaskMapper;
import rr.com.chapter5.pojo.Employee;
import rr.com.chapter5.pojo.MaleEmployee;
import rr.com.chapter5.pojo.Task;
import rr.com.chapter5.util.SqlSessionFactoryUtils;

public class Chapter5Test {
    public static void main(String[] args) {

        Logger logger =Logger.getLogger(Chapter5Test.class);
        SqlSession sqlSession =null;
        SqlSession sqlSession2 =null;
        try{
            SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();
            sqlSession =sqlSessionFactory.openSession();
            EmployeeMapper employeeMapper =sqlSession.getMapper(EmployeeMapper.class);
            Employee e =employeeMapper.getEmployee(1L);
            System.out.println(e.getBirthday());
            sqlSession2 =sqlSessionFactory.openSession();
            EmployeeMapper employeeMapper2 =sqlSession2.getMapper(EmployeeMapper.class);
            Employee e2 =employeeMapper2.getEmployee(1L);
            System.out.println(e2.getBirthday());
            //MaleEmployee male =(MaleEmployee)e;
            //System.out.println(male.getMaleHealthForm().getLiver());
            System.out.println("End");
        }
        finally {
            if(sqlSession!=null)
                sqlSession.close();;
        }


    }
}
