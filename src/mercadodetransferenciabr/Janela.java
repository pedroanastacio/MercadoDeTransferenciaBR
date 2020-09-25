
package mercadodetransferenciabr;


public class Janela {
    private Estado estadoAtual;
    
    public void setJanelaEstado(Estado estadoAtual){
        this.estadoAtual = estadoAtual;       
    }  
    
    public void transferirJogador(){
        this.estadoAtual.transferirJogador();
    }
}
