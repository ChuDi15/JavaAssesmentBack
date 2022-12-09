package com.usersddbb.javaassesment.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


	@Entity
	@Table(name="my_test_table")
	public class Users{
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		
		
		private String firstName;
		private String lastName;
		private String phoneNumber;
		private String email;
		
		
		public Users() {
			
		}

		public Users(int id, String firstName, String lastName, String  phoneNumber, String email) {
			this.id = id;
			this.firstName = firstName;
			this.lastName = lastName;
			this.phoneNumber = phoneNumber;
			this.email = email;
		}
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getPhoneNumber() {
			return phoneNumber;
		}
		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}

		@Override
		public String toString() {
			return "Users [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", phoneNumber="
					+ phoneNumber + ", email=" + email + "]";
		}
		
		
		
	}


