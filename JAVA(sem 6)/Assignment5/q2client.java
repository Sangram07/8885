import java.io.*;
import java.net.*;
public class q2client{
public static void main(String a[]) throws UnknownHostException,IOException{

Socket s = new Socket("localhost",4444);
System.out.println(" #### Client Started ####");
DataInputStream din=new DataInputStream(s.getInputStream());
DataOutputStream dout=new DataOutputStream(s.getOutputStream());
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.print("\nEnter File Name: ");
String fname=br.readLine();
dout.writeUTF(fname);

String str=din.readUTF();
System.out.println(str);
s.close();

}
}
