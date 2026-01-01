import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;
public class SampleServerimpl extends UnicastRemoteObject implements SampleServer
{
SampleServerimpl()throws RemoteException{
super();
}
public int add(int a , int b) throws RemoteException
{
return a+b;
}


public int minus(int a,int b)
{
return a-b;
}


public int multiply(int a , int b) throws RemoteException
{
return a*b;
}

public int divide(int a , int b) throws RemoteException
{
return a/b;
}

}