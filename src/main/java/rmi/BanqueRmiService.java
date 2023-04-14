package rmi;

import metier.Compte;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BanqueRmiService extends UnicastRemoteObject implements IBanqueRemote {
    protected BanqueRmiService( ) throws RemoteException {
        super();
    }

    public double conversion(double mt) throws RemoteException {
        return mt*11.3;
    }

    public Compte consulterCompte(int code) throws RemoteException {
        Compte cp=new Compte(1,Math.random()*9000, new Date());
        return cp;
    }

    public List<Compte> listComptes() throws RemoteException {
        List<Compte> cptes=new ArrayList<Compte>();
        cptes.add(new Compte(1,Math.random()*9000, new Date()));
        cptes.add(new Compte(2,Math.random()*9000, new Date()));
        cptes.add(new Compte(3,Math.random()*9000, new Date()));
        cptes.add(new Compte(4,Math.random()*9000, new Date()));

        return cptes;//
    } //quand on veut créer des objets qui contient des methods les quelle le client peut fait appelle et l'utiliser

}
