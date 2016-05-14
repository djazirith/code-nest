package JavaAffinity;

public class Light implements Load{

	public int isLiftBy(Unit a) {
		// TODO Auto-generated method stub
		if(a instanceof Biological)
			return 1;
		else if(a instanceof Mechanical)
			return -1;
		else return 0;
	}
}
