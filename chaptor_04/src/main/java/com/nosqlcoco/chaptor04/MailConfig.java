package com.nosqlcoco.chaptor04;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 使用@ConfigurationProperties注解，将properties文件中前缀为mail的属性映射到MailConfig属性
 * @author nosqlcoco
 *
 */
@ConfigurationProperties(prefix="mail")
public class MailConfig {
	private String username;
	private String password;
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
}
