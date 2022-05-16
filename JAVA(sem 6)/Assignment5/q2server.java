import java.io.*;
import java.net.*;
public class q2server{
public static void main(String a[]) throws UnknownHostException,IOException{
ServerSocket ss = new ServerSocket(4444);
System.out.println(" #### Server Started ####");
Socket s = ss.accept();
DataInputStream din=new DataInputStream(s.getInputStream());
DataOutputStream dout=new DataOutputStream(s.getOutputStream());

String str=din.readUTF();
File f=new File(str);

if(f.exists() && !f.isDirectory())
{
	String data;
	BufferedReader br=new BufferedReader(new FileReader(str));
	while((data=br.readLine())!=null)
		dout.writeUTF(data);
}
else dout.writeUTF("File Not Found");


s.close();
ss.close();
}
}
