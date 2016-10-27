package com.alg.dp.memento.solution3;

public class Driver {

	public static void main(String[] args) throws Exception {
		Inventory inventory = new Inventory();
		Movie m1 = new Movie(1, "Lord of the rings", 120, 3);
		Movie m2 = new Movie(2, "The hobbit", 100, 2);
		Movie m3 = new Movie(3, "Matrix", 500, 10);
		
		inventory.addMovie(m1);
		inventory.addMovie(m2);
		inventory.addMovie(m3);
		
		System.out.println(inventory.getMemento());
		InventoryCareTaker caretaker = new InventoryCareTaker(args[0]);
		caretaker.commit(inventory.getMemento());		

		inventory.sellMovie(2);
		inventory.sellMovie(1);
		
		System.out.println(inventory.getMemento());		
		caretaker.commit(inventory.getMemento());
		
		inventory.sellMovie(2);
		
		inventory.setmemento(caretaker.rollback());
		System.out.println(inventory.getMemento());	

	}

}
