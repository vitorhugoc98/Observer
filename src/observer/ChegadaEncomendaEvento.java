package observer;

//Essa classe define todas as informações relevantes ao evento

import java.util.Date;


public class ChegadaEncomendaEvento {

    private final Date horaDaChegada; 

    public ChegadaEncomendaEvento(Date horaDaChegada){
        super();
        this.horaDaChegada = horaDaChegada;
    }

    public Date getHoraDaChegada(){
        return horaDaChegada;
    }
}
