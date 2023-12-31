package com.java;

class Immutable {
	private final int id;
	private final String name;
	
	public Immutable(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Immutable [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Immutable other = (Immutable) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}


	
	
	
}

class ImmutableChild1 extends Immutable{
	ImmutableChild1 (int id, String name) {
		super(id, name);
	}
	
}

public class ImmutableTest{
	
	public static void main(String[] args) {
		Immutable object1 = new Immutable(0, "Test1");
		System.out.println(object1 + ":::" + object1.hashCode());
		Immutable object2 = new Immutable(1, "Test2");
		System.out.println(object2 + ":::" + object2.hashCode());
	}
	
}
