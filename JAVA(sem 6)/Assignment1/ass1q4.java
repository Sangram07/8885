import java.io.*;//importing the libraries
import java.util.*;
//creating student class
class student{

	int roll,age;
	String Name;

student(int r, int a, String n)// assigning variable
{
	this.roll=r;
	this.age=a;
	this.Name=n;
	}
}

class sortName implements Comparator<student>{
	public int compare(student a, student b){
		return a.Name.compareTo(b.Name);
	
	}
}

class sortAge implements Comparator<student>{
	public int compare(student a, student b){
		return a.age-b.age;
	}
}
 
public class ass1q4{
	public static void main(String a[]) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		ArrayList<student> stud =  new ArrayList<student>();
// here we are already giving inputs in program itself 
		stud.add(new student(100,14,"yash"));
		stud.add(new student(101,25,"sangram"));
		stud.add(new student(102,35,"rajas"));

                System.out.print("\nSorted BY Name:-  ");
	        Collections.sort(stud, new sortName());
               
		for(int i=0; i<stud.size(); i++)
		{
			System.out.println("\nName: "+stud.get(i).Name+"\nRoll: "+stud.get(i).roll+"\nAge: "+stud.get(i).age);
		}
	
		System.out.print("\nSort by Age:-  ");
		Collections.sort(stud, new sortAge());
		
		for(int i=0; i<stud.size();i++)
		{
			System.out.println("\nName: "+stud.get(i).Name+"\nRoll: "+stud.get(i).roll+"\nAge: "+stud.get(i).age);
		}
}
}

