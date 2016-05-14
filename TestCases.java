package JavaAffinity;

public class TestCases {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mechanical mech = new Mechanical();
		Biological bio = new Biological();
		Heavy heavy = new Heavy();
		Light light = new Light();
		System.out.println("Biological lifts light: "+bio.lift(light));
		System.out.println("Biological lifts heavy: "+bio.lift(heavy));
		
		
		System.out.println("Light is lifted by Mechanical: "+light.isLiftBy(mech));
		System.out.println("Heavy is lifted by Mechanical: "+heavy.isLiftBy(mech));
	}

}
