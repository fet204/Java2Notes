package thursday;

public class inclassactivity {

	public static int digit(int x, int y) {
		
		if (x < 0 || y < 0)  {
			throw new IllegalArgumentException();
		}
		
		else if(x < 10 || y < 10) {
			if (x % 10 == y % 10) {
				return 1;
			}
			
			else 
				return 0;
		}
		
		else if (x % 10 == y % 10) {
			return 1 + digit(x/10, y/10);
		}
		
		else 
			return digit(x/10, y/10);
			
			
		}
		
	 
	}


