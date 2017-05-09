package com.alg.dp.project2.solution3;

public class GumballsNoCoin implements IState {
	private static GumballsNoCoin instance;
	
	private GumballsNoCoin() {
	}
	
	public static synchronized IState getInstance() {
		if(instance == null)
			instance = new GumballsNoCoin();
		return instance;
	}
	
	@Override
	public void addGumballs(GumballMachine gbm, int count) {
		// TODO Auto-generated method stub

	}

	@Override
	public void insertCoin(GumballMachine gbm) {
		// TODO Auto-generated method stub

	}

	@Override
	public void turnHandle(GumballMachine gbm) {
		// TODO Auto-generated method stub

	}

}
