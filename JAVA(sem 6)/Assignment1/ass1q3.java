import java.util.*;
import java.io.*;

public class ass1q3
{
	public static void main(String a[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\nEnter no of flavors: ");
	
		int n=Integer.parseInt(br.readLine());
		String c,s;
		Hashtable<String,Integer> flav=new Hashtable<String,Integer>();
		for(int i=0;i<n;i++)
		{
			System.out.print("\nEnter Name of Flavor "+(i+1)+":");
			s=br.readLine();
	
			if(flav.containsKey(s))
			{
				System.out.println("\nduplicate value not allowed");
				i--;
				continue;
			}
		System.out.print("\n Enter Price: ");
		int price=Integer.parseInt(br.readLine());
		flav.put(s,price);
		}
		while(true)
		{
			System.out.print("\n1. Search Specific Flavor");
			System.out.print("\n2. Sort all flavors");
			System.out.print("\n3. Exit");
			System.out.print("\n4.Enter menu option:");
			c=br.readLine();
		switch(c)
		{
			case "1": System.out.print("\n Enter Name:");
			  	s=br.readLine();
			  	if(flav.containsKey(s))
			  	{
					System.out.print("\n Name: "+s+"\nPrice: "+flav.get(s));
			  	}
			  	else
			  	{
					System.out.print("\nFlavor Not Found");
			  	}
			  	break;

       			case "2": TreeMap<String,Integer> tm=new TreeMap<String,Integer>(flav);
			  	Set<String> keys = tm.keySet();
			  	Iterator<String> itr = keys.iterator();
			  	System.out.print("\n Flavors in Sorted Order: \n");
			  	while(itr.hasNext())
			  	{
					String i = itr.next();
					System.out.println(i + " " + tm.get(i));
			  	}
			case "3": System.exit(0);
		}
  		}
	}
}
