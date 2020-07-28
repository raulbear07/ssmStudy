package rr.com.chapter5;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;
import rr.com.chapter5.mapper.TaskMapper;
import rr.com.chapter5.pojo.Task;
import rr.com.chapter5.util.SqlSessionFactoryUtils;

public class Chapter5Test {
    public static void main(String[] args) {

        Logger logger =Logger.getLogger(Chapter5Test.class);
        SqlSession sqlSession =null;
        try{
            SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();
            sqlSession =sqlSessionFactory.openSession();
            TaskMapper taskMapper= sqlSession.getMapper(TaskMapper.class);
            Task task=new Task();
            task.setContext("new Context");
            task.setNote("new note");
            task.setTitle("title1");
            taskMapper.insertTask(task);
            sqlSession.commit();
            Task task1=taskMapper.getTask(task.getId());
            System.out.println(task1.getContext());
        }
        finally {
            if(sqlSession!=null)
                sqlSession.close();;
        }


    }
}
