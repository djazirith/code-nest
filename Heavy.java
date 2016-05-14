package JavaAffinity;

public class Heavy implements Load{

	@Override
	public int isLiftBy(Unit a) {
		// TODO Auto-generated method stub
		if(a instanceof Mechanical)
			return 1;
		else if(a instanceof Biological)
			return -1;
		else return 0;
	}
}
