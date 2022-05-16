import java.io.*;
import java.net.*;
public class q4server{
public static void main(String a[]) throws UnknownHostException,IOException{

ServerSocket ss = new ServerSocket(4444);
System.out.println(" #### Server Started ####");
Socket s = ss.accept();
DataInputStream din=new DataInputStream(s.getInputStream());
DataOutputStream dout=new DataOutputStream(s.getOutputStream());
String str=din.readUTF();
int n =Integer.parseInt(str);
int f=0;
for(int i=2;i*i<=n;++i)if(n%i==0){f=1;break;}

if(f==0)dout.writeUTF("Is Prime");

else dout.writeUTF("Is Not Prime");

s.close();
ss.close();
}
}
