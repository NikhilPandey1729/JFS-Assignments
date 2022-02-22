import java.util.LinkedList;
import java.util.List;
public class collectionQ4 {
	public static void main(String[] args) {
		List<String> date = new LinkedList<>();
	date.add("29-08-1998");
	date.add("29-08-1999");
	date.add("29-08-2001");
	date.add("29-08-2002");
	date.add("29-08-2003");
	date.add("29-08-2007");
		for(String it : date) 
		{
			String[] strings = it.split("-");
			if((int)Integer.parseInt(strings[2])%4==0)
			{
				if((int)Integer.parseInt(strings[2])%100==0) 
				{
					if((int)Integer.parseInt(strings[2])%400==0)
						System.out.println("Your Date of Birth is "+it+" and it was Leap Year");
					else {
						System.out.println("Your Date of Birth is "+it+" and it was not Leap Year");
					}
				}
				else {
					System.out.println("Your Date of Birth is "+it+" and it was Leap Year");
				}				
			}
			else {
				System.out.println("Your Date of Birth is "+it+" and it was not Leap Year");
			}
		}
	}
}
