package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Purchase {

	  @Id
		private String shoename;
		private String date;
		private String shoecategory;
		
		
		public String getShoename() {
			return shoename;
		}
		public void setShoename(String shoename) {
			this.shoename = shoename;
		}
		public String getDate() {
			return date;
		}
		public void setDate(String date) {
			this.date = date;
		}
		public String getShoecategory() {
			return shoecategory;
		}
		public void setShoecategory(String shoecategory) {
			this.shoecategory = shoecategory;
		}
		
		
		public Purchase(String shoename, String date, String shoecategory) {
			super();
			this.shoename = shoename;
			this.date = date;
			this.shoecategory = shoecategory;
		}
		
		
		public Purchase() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
	}

