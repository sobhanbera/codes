package codechef;

public class Lapindromes {

	public static void main(String ...strings) throws Exception{
		isLapindromes("ga","ga");
	}
	private static boolean isLapindromes(String...s) throws Exception{
		if(s.length == 2) {
			
		}else if(s.length > 2)
			throw new Exception("isLapindromes take 2 arguments but more are provided");
		else if(s.length < 2)
			throw new Exception("isLapindromes take 2 arguments but less are provided");
		return false;
	}
}
