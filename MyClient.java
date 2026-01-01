import java.rmi.*;
public class MyClient
{
public static void main(String args[])
{
try
{
String url="rmi://localhost:1099/yohannes";
SampleServer rmiobj=(SampleServer)Naming.lookup(url);
System.out.println("accessed");
System.out.println("50+40= "+rmiobj.add(50,40));
System.out.println("50-40= "+rmiobj.minus(50,40));
System.out.println("50*40= "+rmiobj.multiply(50,40));
System.out.println("50/40= "+rmiobj.divide(50,40));

}catch(Exception e){System.out.println(e);}
}
}

