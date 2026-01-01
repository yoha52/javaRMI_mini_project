import java.rmi.*;
import java.rmi.registry.*;
public class MyServer{
public static void main(String args[])
{
try{
SampleServer server=new SampleServerimpl();

Naming.rebind("rmi://localhost:1099/yohannes",server);
}catch(Exception e){System.out.println(e);}
}
}