package observer;

//Reponsável por detectar o evento e notificar todos os interessados

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;


public class Transportadora extends Thread{
    
    private List<ChegadaEncomendaObservador> observers = new ArrayList<ChegadaEncomendaObservador>(); 
    
    public void addChegadaEncomendaObservador(ChegadaEncomendaObservador observador){
        this.observers.add(observador); 
    }; 
    
    //esse método está ligado ao meu caso de uso, onde a partir dele eu consigo
    //usar o teclado para definir quando a encomenda vai chegar
    @Override
    public void run(){
        Scanner scanner = new Scanner(System.in);
        while(true){    
        int valor = scanner.nextInt();
        if(valor == 1){
            ChegadaEncomendaEvento evento = new ChegadaEncomendaEvento(new Date()); 
            //Notificar os observers
            
            for(ChegadaEncomendaObservador observer : this.observers){
                observer.chegou(evento);
            }
        }else{
                    System.out.println("Não chegou ainda.");
        }
    }
        
    
    }
    
}
