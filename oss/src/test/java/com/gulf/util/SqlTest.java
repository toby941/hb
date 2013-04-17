package com.gulf.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbcp.BasicDataSource;
import org.nutz.dao.impl.NutDao;

import com.gulf.domain.News;
import com.gulf.service.NewsService;

public class SqlTest {

    static String driverName = "net.sourceforge.jtds.jdbc.Driver"; // 加载JDBC驱动
    static String dbURL = "jdbc:jtds:sqlserver://202.119.97.205:1433;DatabaseName=DB_XG_MIS"; // 连接服务器和数据库sample
    static String userName = "sa"; // 默认用户名
    static String userPwd = "hg6643"; // 密码

    public static void main(String[] srg) {
        Connection dbConn;

        try {
            Class.forName(driverName);
            dbConn = DriverManager.getConnection(dbURL, userName, userPwd);
            System.out.println("Connection Successful! "); // 如果连接成功 控制台输出Connection Successful!
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    // @Test
    public void test() throws SQLException {
        BasicDataSource ds = new BasicDataSource();
        ds.setDriverClassName(driverName);
        ds.setUrl(dbURL);
        ds.setUsername(userName);
        ds.setPassword(userPwd);
        NutDao dao = new NutDao();
        dao.setDataSource(ds);
        NewsService service = new NewsService();
        service.setDao(dao);
        List<News> list = service.getList(1);
        System.out.println(list.size());
        ds.close();
    }
}
