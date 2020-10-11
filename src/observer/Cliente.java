package observer;
public class Cliente {

    public static void main(String[] args) {
        
        ReceptorEncomenda receptor = new ReceptorEncomenda();   
        Transportadora transportadora = new Transportadora(); 
        
        //Abaixo vamos registrar o receptor na transportadora 
        //Isso serve para que o recptor possa ser notificado que o evento ocorreu
        transportadora.addChegadaEncomendaObservador(receptor);
        //Abaixo chamamos o método Start da Thread para que a transportadora passe
        // a monitorar os eventos
        
        transportadora.start(); 
        
    }
    
}
