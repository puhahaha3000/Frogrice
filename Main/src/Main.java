import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String base;
		int n = Integer.parseInt(br.readLine());
		base = "***\n* *\n***";
		bw.write(grow(base, n));
		bw.flush();
	}
	public static String grow(String base, int n) throws IOException
	{
		if(n == 3) return base;
		String line[] = base.toString().split("\n");
		String result = "";
		for(int i = 0; i < line.length; i++)
		{
			result += line[i] + line[i] + line[i] + "\n";
		}
		for(int i = 0; i < line.length; i++)
		{
			result += line[i];
			for(int j = 0; j < line[i].length(); j++) result += " ";
			result += line[i] + "\n";
		}
		for(int i = 0; i < line.length; i++)
		{
			result += line[i] + line[i] + line[i] + "\n";
		}
		return grow(result, n/3);
	}
	
}