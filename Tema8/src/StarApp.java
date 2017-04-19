
public class StarApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MiHora mh1 = new MiHora(8,10,20);
		MiHora mh2 = new MiHora(8,10,19);

		System.out.println(mh1.getMiHora());
		System.out.println(mh2.getMiHora());
		
		System.out.println(mh1);
		
		}

}
