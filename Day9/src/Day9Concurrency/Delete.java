package Day9Concurrency;

import java.util.concurrent.Callable;

class Vaman {

}

public class Delete implements Callable<Vaman> {
	
	int num;

	// parameters

	@Override
	public Vaman call() throws Exception {
		Vaman vam = new Vaman();
		return vam;
	}

	public static void main(String[] args) {

	}

}