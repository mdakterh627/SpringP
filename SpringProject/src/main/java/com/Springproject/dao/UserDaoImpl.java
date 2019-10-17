/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Springproject.dao;

import com.Springproject.model.Login;
import com.Springproject.model.User;
import com.Springproject.repository.UserService;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author user
 */
public class UserDaoImpl implements UserService{

    
  @Autowired
  DataSource datasource;
  @Autowired
  JdbcTemplate jdbcTemplate;
  @Override
  public void register(User user) {
    String sql = "insert into user values(?,?,?,?,?,?,?)";
    jdbcTemplate.update(sql, new Object[] { user.getUsername(), user.getPassword(), user.getFirstname(),
    user.getLastname(), user.getEmail(), user.getAddress(), user.getPhone() });
    }
  @Override
    public User validateUser(Login login) {
    String sql = "select * from user where username='" + login.getUsername() + "' and password='" + login.getPassword()
    + "'";
    List<User> users = jdbcTemplate.query(sql, new UserMapper());
    return users.size() > 0 ? users.get(0) : null;
    }
  }
  class UserMapper implements RowMapper<User> {
  @Override
  public User mapRow(ResultSet rs, int arg1) throws SQLException {
    User user = new User();
    user.setUsername(rs.getString("username"));
    user.setPassword(rs.getString("password"));
    user.setFirstname(rs.getString("firstname"));
    user.setLastname(rs.getString("lastname"));
    user.setEmail(rs.getString("email"));
    user.setAddress(rs.getString("address"));
    user.setPhone(rs.getString("phone"));
    return user;
  }
    
}
