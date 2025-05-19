package ro.cts.models;

public class Facade {

    public String interneazaPacient(Internare candidat){
        Pacient pacient=new Pacient();
        Medic medic=new Medic();

        if(candidat.isEsteLaSpital()){
            if(medic.confirmaInternare(candidat)){
                if(pacient.problemaGrava(candidat)){
                   return "Se interneaza";
                }else{
                    return "Se asteapta verificarea problemei.";
                }
            }else{
                return "Se asteapta confirmarea medicului";
            }
        }else {
            return "Nu se incadreaza cazului de internare";
        }
    }
}
