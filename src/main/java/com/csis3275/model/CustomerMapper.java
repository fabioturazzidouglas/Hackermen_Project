package com.csis3275.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

/**
 * @author Hackermen
 * Hotel Management System
 */

public class CustomerMapper implements RowMapper<Customer> {

	/**
	 *Customer mapRow Method
	 *@return customer
	 */
	public Customer mapRow(ResultSet resultSet, int i) throws SQLException {

		Customer customer = new Customer();
		customer.setId(resultSet.getInt("id"));
		customer.setfName(resultSet.getString("fName"));
		customer.setlName(resultSet.getString("lName"));
		customer.setEmail(resultSet.getString("email"));
		customer.setAddress(resultSet.getString("address"));
		customer.setPassword(resultSet.getString("password"));
		customer.setPhoneNumber(resultSet.getString("phoneNumber"));
		customer.setUsername(resultSet.getString("username"));
		customer.setUserType(resultSet.getString("userType"));
		customer.setRegistrationDate(resultSet.getString("registrationDate"));
		customer.setProfileUpdated(resultSet.getString("profileUpdated"));
		customer.setPassQuestion(resultSet.getString("passQuestion"));
		customer.setPassAnswer(resultSet.getString("passAnswer"));

		return customer;

	}

}
