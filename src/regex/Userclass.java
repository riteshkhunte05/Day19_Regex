package regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Userclass {
	public void ValidName()
	{
			String line="Ritesh";
			String pattern="[A-Z][a-z]*";
			Pattern p=Pattern.compile(pattern);
			Matcher matcher=p.matcher(line);
			if(matcher.matches())
			{
				System.out.println("Pattern Match");
			}
			else {
				System.out.println("No Match");
				}
		}
	public void  LastName()
	 {
	        String line="Khunte";
	        String pattern="[A-Z][a-z]*";
	        Pattern p=Pattern.compile(pattern);
	        Matcher matcher=p.matcher(line);
	        if(matcher.matches())
	        {
		        System.out.println("Pattern Match");
	        }
	        else {
		        System.out.println("No Match");
		         }
     }
	       public void Email()
	{
		   String line="abc.xyz@bl.com.in";
		   String pattern="[a-z \\. a-z]+[@][a-z]+\\.[a-z]{3}+\\.[a-z]{2}";
		   Pattern p=Pattern.compile(pattern);
	   	   Matcher matcher=p.matcher(line);
		   if(matcher.matches())
		   {
		       System.out.println("Pattern Match");
		   }
		   else {
		       System.out.println("No Match");
			}
	        }
	public void Mobilenumb()
	 {
				String line="91 9168112901";
				String pattern="[0-9]{2} [98]{1}[0-9]{9}";
				Pattern p=Pattern.compile(pattern);
				Matcher matcher=p.matcher(line);
				if(matcher.matches())
				{
					System.out.println("Pattern Match");
				}
				else {
					System.out.println("No Match");
					}

			}
	public void PasswordRule1()
	 {
		String line="pass";
		String pattern="[a-z]{1,}";
		Pattern p=Pattern.compile(pattern);
		Matcher matcher=p.matcher(line);
		if(matcher.matches())
		{
			System.out.println("Pattern Match");
		}
		else {
			System.out.println("No Match");
			}
	}
	public void PasswordRule2()
	 {
		String line="PASSword@123";
		String pattern="^[A-Z]{4}[a-z]*@[0-9]*$";
		Pattern p=Pattern.compile(pattern);
		Matcher matcher=p.matcher(line);
		if(matcher.matches())
		{
			System.out.println("Pattern Match");
		}
		else {
			System.out.println("No Match");
			}
}
	public void PasswordRule3()
	 {
		String line="Pass12";
		String pattern="[A-Z]{1}[a-z]{1,}[0-9]{2}";
		Pattern p=Pattern.compile(pattern);
		Matcher matcher=p.matcher(line);
		if(matcher.matches())
		{
			System.out.println("Pattern Match");
		}
		else {
			System.out.println("No Match");
			}
}
	public void PasswordRule4()
	 {
		String line="Pass@12";
		String pattern="[A-Z]{1}[a-z]{1,}[@][0-9]{2}";
		Pattern p=Pattern.compile(pattern);
		Matcher matcher=p.matcher(line);
		if(matcher.matches())
		{
			System.out.println("Pattern Match");
		}
		else {
			System.out.println("No Match");
			}
}
}