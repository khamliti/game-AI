package rmi;

import metier.Compte;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

public class BanqueRmiService extends UnicastRemoteObject implements IBanqueRemote {
    protected BanqueRmiService( ) throws RemoteException {
        super();
    }

    public double conversion(double mt) throws RemoteException {
        return 0;
    }

    public Compte consulterCompte(int code) throws RemoteException {
        return null;
    }

    public List<Compte> listComptes() throws RemoteException {
        return null;
    } //quand on veut créer des objets qui contient des methods les quelle le client peut fait appelle et l'utiliser

}
