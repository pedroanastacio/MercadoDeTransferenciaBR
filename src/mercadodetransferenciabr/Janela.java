
package mercadodetransferenciabr;

import java.util.ArrayList;
import java.util.List;


public class Janela {
    private Estado estadoAtual;
    private List<Observador> observadores = new ArrayList<>(); 
    
    public void setEstadoJanela(Estado estadoAtual){
        this.estadoAtual = estadoAtual;       
        this.notificarTodos();
    }  
    
    public void transferirJogador(){
        this.estadoAtual.transferirJogador();
    }
    
    public void addObservador(Observador obs){
        this.observadores.add(obs);
    }
    
    private void notificarTodos(){
        observadores.forEach((o)-> {
            o.notificar(estadoAtual);
        }); 
    }
}
