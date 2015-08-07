import java.io.*;

public class ExceptionExample {
//second commit
	public static void main(String[] args) {
		FileInputStream fis = null;
		int k;
		
		try
		{
			fis = new FileInputStream("c:\\myfile.txt");
						
			while ( (k = fis.read()) != -1)
			{
				System.out.println((char)k);
			}
		}catch (FileNotFoundException e)
		{
			System.out.println("You fool! There is no file!");
		}catch (IOException e)
		{
			System.out.println("You fool! There is an IO exception!");
		}
	}

}
