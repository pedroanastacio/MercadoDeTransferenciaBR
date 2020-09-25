
package mercadodetransferenciabr;


public class JanelaFechada extends Estado{
    private String msgEstado = "fechada";
    
    @Override
    public String getMsgEstado(){
        return msgEstado;
    }
    
    @Override
    public void transferirJogador(){
        System.out.println("Janela fechada, não é possível realizar transferência de jogadores.");
    }
}
