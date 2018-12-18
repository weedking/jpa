package com.billy.jpa;

import com.billy.jpa.conf.JpaConfiguration;
import com.billy.jpa.dao.DepartmentRepository;
import com.billy.jpa.dao.RoleRepository;
import com.billy.jpa.dao.UserRepository;
import com.billy.jpa.pojo.Department;
import com.billy.jpa.pojo.Role;
import com.billy.jpa.pojo.User;
import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

//import java.util.logging.Logger;
import org.slf4j.Logger;
import org.springframework.util.Assert;

//import java.awt.print.Pageable;
import org.springframework.data.domain.Pageable;

@RunWith(SpringRunner.class)
@SpringBootTest
//@ContextConfiguration(classes = {JpaConfiguration.class})
public class JpaApplicationTests {

    private static Logger logger = org.slf4j.LoggerFactory.getLogger(JpaApplicationTests.class);
	@Autowired
    UserRepository userRepository;
	@Autowired
	DepartmentRepository departmentRepository;
	@Autowired
	RoleRepository roleRepository;
	@Before
	public void initData(){
		userRepository.deleteAll();
		departmentRepository.deleteAll();
		roleRepository.deleteAll();
		Department department = new Department();
		long a1 =4;
		department.setId(a1);
		department.setName("霸道总裁1");
		departmentRepository.save(department);
		Role role = new Role();
		long a2 =4;
		role.setId(a2);
		role.setName("霸道总裁2");
		roleRepository.save(role);
		User user = new User();
		long a3 =6;
		user.setId(a3);
		user.setName("霸道总裁3");
		userRepository.save(user);

//		Assert.notNull(department);
	}
//	@Test
//	public void findPage(){
//
//	}

	@Test
	public void contextLoads() {
//		Pageable pageable = new PageRequest(0,10,new Sort(Sort.Direction.ASC,"id"));
//        Pageable pageable = new PageRequest(0,10,new Sort(Sort.Direction.ASC,"id"));
//        Page<User> page = userRepository.findAll(pageable);
//        for(User user:page.getContent()){
//            logger.info("===user=== user name:{},department name:{},role name:{}",user.getName(),user.getDepartment().getName(),user.getRoles().get(0).getName());
//        }
	}
}

