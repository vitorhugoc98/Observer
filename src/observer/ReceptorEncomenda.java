package observer;

//O ReceptorEncomenda é a pessoa que vai receber a encomenda

public class ReceptorEncomenda implements ChegadaEncomendaObservador{
    
    //Nesse método cada observador deve definir como trata o evento
    @Override
    public void chegou(ChegadaEncomendaEvento evento) {
        System.out.println("Atender a porta.");
        System.out.println("Assinar.");
        System.out.println("Pegar a encomenda.");
    }
}
