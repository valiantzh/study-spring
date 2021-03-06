package com.hzdongcheng.persistent.dao;

import java.util.List;
import javax.sql.RowSet;
import com.hzdongcheng.persistent.entity.*;
import com.hzdongcheng.toolkits.EduException;
import com.hzdongcheng.toolkits.db.*;

public interface OPOperatorLogDAO{

    public int insert(OPOperatorLog obj) throws EduException;

    public int update(JDBCFieldArray setCols,JDBCFieldArray whereCols) throws EduException;

    public int delete(OPOperatorLog obj) throws EduException; 

    public int delete(JDBCFieldArray whereCols) throws EduException; 

    public boolean isExist(OPOperatorLog obj) throws EduException;

    public int isExist(JDBCFieldArray whereCols) throws EduException;

    public OPOperatorLog find(OPOperatorLog obj) throws EduException;

    public RowSet select(JDBCFieldArray whereCols) throws EduException;

    public RowSet select(JDBCFieldArray whereCols,List<String> orderCols) throws EduException;

    public RowSet select(JDBCFieldArray whereCols,int recordBegin,int recordNum) throws EduException;

    //必须对返回结果进行null判断后才能使用
    public String selectFunctions(String fName,JDBCFieldArray whereCols) throws EduException;

}