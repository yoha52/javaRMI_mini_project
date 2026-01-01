import java.rmi.*;
public interface SampleServer extends Remote
{
public int add(int a , int b) throws RemoteException;
public int minus(int a , int b) throws RemoteException;
public int multiply(int a , int b) throws RemoteException;
public int divide(int a , int b) throws RemoteException;
}