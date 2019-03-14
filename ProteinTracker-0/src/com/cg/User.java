package com.cg;



import java.util.Objects;

public class User {

	
	public User() {
		System.out.println("inside User()...");
	}
	
/*	{
		
		goal = 2;
	}
	*/
	
	
	private int id;
	private String name;
	private int total;
	private int goal;

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

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getGoal() {
		return goal;
	}

	public void setGoal(int goal) {
		this.goal = goal;
	}

	

/*	@Override
	public int hashCode() {
		System.out.println("hashcode of " + name + ": " + Objects.hash(goal));
//		return super.hashCode();
		return Objects.hash(goal);
//		return goal;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("inside equals()");
		boolean flag = (this.name.equals(((User)obj).name))
				
				&& (this.goal== ((User)obj).goal);
		
		return flag;
		
	}*/
		
}
