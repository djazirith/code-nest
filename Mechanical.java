package JavaAffinity;

public class Mechanical implements Unit{

	@Override
	public int lift(Load a) {
		// TODO Auto-generated method stub
		if(a instanceof Heavy)
			return 1;
		else if(a instanceof Light)
			return -1;
		else
			return 0;
	}

}
