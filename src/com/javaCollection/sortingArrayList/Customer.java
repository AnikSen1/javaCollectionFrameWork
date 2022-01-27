package com.javaCollection.sortingArrayList;

public class Customer {
		private int id;
		private String name;
		private int age;
		private long buy;
		
		
		public Customer(int id, String name, int age, long buy) {
			super();
			this.id = id;
			this.name = name;
			this.age = age;
			this.buy = buy;
		}
		
		
		public int getId() {
			return id;
		}
		
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		

		public void setAge(int age) {
			this.age = age;
		}
		public long getBuy() {
			return buy;
		}
		public void setBuy(long buy) {
			this.buy = buy;
		}
		@Override
		public String toString() {
			return "Customer [id=" + id + ", name=" + name + ", age=" + age + ", buy=" + buy + "]";
		}

	}


