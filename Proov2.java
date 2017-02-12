// Palun lisada programmi argumentidesse silindri mass

public class Proov2 {
	public static void main(String[] argumendid) {
        Integer mass = Integer.parseInt( argumendid[0] );

		Silinder silinder1=new Silinder(3, 2, mass);
		System.out.println(silinder1.toString());
	}
}
