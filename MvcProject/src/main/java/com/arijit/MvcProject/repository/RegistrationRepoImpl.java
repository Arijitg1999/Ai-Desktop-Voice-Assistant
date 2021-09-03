//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.List;
//
//import javax.sql.DataSource;
//import javax.swing.tree.RowMapper;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
//
//import com.arijit.MvcProject.entity.User;
//import com.mysql.cj.log.Log;

//package com.arijit.MvcProject.repository;
//
//import java.applet.Applet;
//import java.util.List;
//
//import javax.servlet.jsp.JspFactory;
//
//import org.springframework.beans.factory.annotation.Autowired;
//
//import com.arijit.MvcProject.entity.User;
//import com.jayway.jsonpath.Criteria;
//import com.mysql.cj.Session;
//import com.mysql.cj.xdevapi.SessionFactory;
//
//import javassist.tools.rmi.AppletServer;

//
//import javax.transaction.Transactional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.arijit.MvcProject.entity.User;
//
//
//@Service
//@Transactional
//public class RegistrationRepoImpl {
//    @Autowired RegistrationRepo repo;
//     
//    public void save(User customer) {
//        repo.save(customer);
////    }
////     
////   
////     
////}
////
//public abstract class RegistrationRepoImpl implements RegistrationRepo{
//	@Autowired
//	private SessionFactory sessionFactory;
////	
//	public String addAsset(String email) {
////		sessionFactory.getClass().saveOrUpdate(email);
//		sessionFactory.getSession("User").saveOrUpdate(User);
////		return email;
//	}

//	public void save() {
////	    sessionFactory.getSession().saveOrUpdate(email);
//
//	sessionFactory.getSession().save(email);
//	}
//
//	protected abstract String String();

//	public Asset updateAsset(Asset a) {
//	    sessionFactory.getCurrentSession().update(a);
//	    return a;
//	}

//	@SuppressWarnings({ "deprecation" })
//	public List<AppletServer> listAsset() {
//	    com.mysql.cj.xdevapi.Session session = sessionFactory.getSession(addAsset("String"));
//	    Criteria criteria = session.SaveSchema(AppletServer.class<save( email )>.);
//	    		
//	    return (List<AppletServer>)criteria.list();
//	}
//
//
//
//
//
////
//public abstract class RegistrationRepoImpl implements RegistrationRepo{
//	@Autowired
//	User user;
//	public void register(UserDao userDao)
//	
//}























//
//
//
//public abstract class RegistrationRepoImpl implements RegistrationRepo{
//
//  @Autowired
//  DataSource datasource;
//
//  @Autowired
//  JdbcTemplate jdbcTemplate;
//
//  public void register(User user) {
//
//    String sql = "insert into users values(?,?,?,?,?,?,?)";
//
//    jdbcTemplate.update(sql, new Object[] { user.getName(), user.getPassword(), 
//    user.getEmail() });
//    }
//
//    public User validateUser(Log login) {
//
//    String sql = "select * from users where username='" + login..getName() + "' and password='" + login.getPassword()
//    + "'";
//
//    List<User> users = jdbcTemplate..query(sql, new UserMapper());
//
//    return users.size() > 0 ? users.get(0) : null;
//    }
//
//  }
//
//  class UserMapper implements RowMapper<User> {
//
//  public User mapRow(ResultSet rs, int arg1) throws SQLException {
//    User user = new User;
//
//    user.setUsername(rs.getString("username"));
//    user.setPassword(rs.getString("password"));
//    user.setFirstname(rs.getString("firstname"));
//    user.setLastname(rs.getString("lastname"));
//    user.setEmail(rs.getString("email"));
//    user.setAddress(rs.getString("address"));
//    user.setPhone(rs.getInt("phone"));
//
//    return user;
//  }
//}






