package rmi;

import metier.Compte;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IBanqueRemote extends Remote {
    public double conversion (double mt) throws RemoteException;
    public Compte consulterCompte(int code) throws RemoteException;


}
