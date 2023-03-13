package com.codingdojo.loginRegistration.models;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="users")
public class User {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;
 @NotEmpty
 @Size(min = 3, message="Username must be at least 3 characters long.")
 private String username;
 @NotEmpty
 @Email(message="Enter a correct email.")
 private String email;
 @NotEmpty
 @Size(min = 8, message="Password must be at least 8 characters long.")
 private String password;
 @Transient
 @NotEmpty(message="Confirm Password is required!")
 private String confirmPassword;
 
 @Column(updatable=false)
 @DateTimeFormat(pattern="yyyy-MM-dd")
 private Date createdAt;
 @DateTimeFormat(pattern="yyyy-MM-dd")

 private Date updatedAt;

 public User() {
     
 }
 public User(String username, String email, String password) {
	 this.username = username;
	 this.email = email;
	 this.password = password; 
 }
 
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public Date getCreatedAt() {
	return createdAt;
}
public void setCreatedAt(Date createdAt) {
	this.createdAt = createdAt;
}
public Date getUpdatedAt() {
	return updatedAt;
}
public void setUpdatedAt(Date updatedAt) {
	this.updatedAt = updatedAt;
}
public String getConfirmPassword() {
	return confirmPassword;
}
public void setConfirmPassword(String confirmPassword) {
	this.confirmPassword = confirmPassword;
}


@PrePersist
protected void onCreate(){
    this.createdAt = new Date();
}
@PreUpdate
protected void onUpdate(){
    this.updatedAt = new Date();
}


}
