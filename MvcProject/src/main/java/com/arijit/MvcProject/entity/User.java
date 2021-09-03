package com.arijit.MvcProject.entity;



	import javax.persistence.Entity;
	import javax.persistence.Column;
	import javax.persistence.Id;

//import org.hibernate.usertype.UserType;

import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;

	import lombok.Getter;
	import lombok.Setter;
	import lombok.RequiredArgsConstructor;
	import lombok.NonNull;

	
	
	
	@Entity
	@RequiredArgsConstructor
	public class User {
		
	

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private Long uid;
		
		
		@Column(name = "Email")
		@Getter
		@Setter
		@NonNull
		private String email;
		
		@Column(name = "NAME")
		@Getter
		@Setter
		@NonNull
		@GeneratedValue()
		private String name;
		
		@Column(name = "PASSWORD")
		@Getter
		@Setter
		@NonNull
		private String password;

		public User(Long uid, String email, String name, String password) {
			super();
			this.uid = uid;
			this.email = email;
			this.name = name;
			this.password = password;
		}

		@Override
		public String toString() {
			return "User [uid=" + uid + ", email=" + email + ", name=" + name + ", password=" + password + "]";
		}

		public User() {
			super();
			// TODO Auto-generated constructor stub
		}

	
		
			
		

			
		}


	
