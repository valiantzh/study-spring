package com.study.spring.mybatis.test;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.study.spring.mybatis.entity.OPRole;
import com.study.spring.mybatis.service.IRoleService;

@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class TestRoleService {
    private static Logger log = Logger.getLogger(TestRoleService.class);
    

//  private ApplicationContext ac = null;
    @Resource
    private IRoleService roleService;
    
//  @Before
//  public void before() {
//      ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//      userService = (IUserService) ac.getBean("userService");
//  }
    
    @Test
    public void testAdd(){
        int id = 5;
        OPRole role = roleService.getRoleById(id);
        if(role != null){
            //log.info(role);
            log.info(JSON.toJSONString(role));
            return;
        }
        role = new OPRole();
        role.setRoleID(id);
        role.setRoleName("管理员"+id);
        role.setOperID("181818");
        try {
            roleService.addRole(role);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            log.error(""+e.getMessage());
        }
    }
    @Test
    public void testUpdate(){
        int id = 5;
        OPRole role = new OPRole();
        role.setRoleID(id);
        role.setRoleName("管理员"+id);
        role.setOperID("181818-"+id);
        roleService.update(role);
    }
}
