package ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;

@WebService(name = "BanqueWS")
public class BanqueService {

    @WebMethod
    public Compte getCompte(@WebParam(name = "code") int code){
        return new Compte(code,Math.random()*9000,new Date());
    }

    @WebMethod(operationName = "Convert")
    public double converision(@WebParam(name = "montant") double mt){
        return mt*11;
    }

    @WebMethod
    public List<Compte> listecompte(){
        return List.of(
                new Compte(1,Math.random()*90000,new Date()),
                new Compte(2,Math.random()*90000,new Date()),
                new Compte(3,Math.random()*90000,new Date())
        );
    }
}
