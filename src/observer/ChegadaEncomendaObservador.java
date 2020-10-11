package observer;

//Todos os interessados ou observadores, devem implementar o método update dessa classe

public interface ChegadaEncomendaObservador {
    
    public void chegou(ChegadaEncomendaEvento evento);
    
}
