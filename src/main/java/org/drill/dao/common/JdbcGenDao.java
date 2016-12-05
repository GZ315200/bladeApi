package org.drill.dao.common;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 * Created by gygesM on 2016/12/2.
 */
public class JdbcGenDao extends JdbcDaoSupport{

    @Resource(name = "dataSource")
    public void setSuperDataSource(DataSource dataSource) {
        super.setDataSource(dataSource);
    }

}
