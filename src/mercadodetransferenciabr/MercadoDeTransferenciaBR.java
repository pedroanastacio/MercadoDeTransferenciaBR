
package mercadodetransferenciabr;

public class MercadoDeTransferenciaBR {

   
    public static void main(String[] args) {
        Janela j = new Janela();
        j.addObservador(new SiteCBF());
        j.addObservador(new SistemaEmail());
        
        j.setEstadoJanela(new JanelaAberta());
        j.transferirJogador();
        
        j.setEstadoJanela(new JanelaFechada());
        j.transferirJogador();
    }
    
}
