package rmi;

import metier.Compte;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface IBanqueRemote extends Remote {
    public double conversion (double mt) throws RemoteException;
    public Compte consulterCompte(int code) throws RemoteException;
    public List<Compte> listComptes() throws RemoteException;


}
