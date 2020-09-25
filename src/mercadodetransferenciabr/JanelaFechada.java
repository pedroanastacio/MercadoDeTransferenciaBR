
package mercadodetransferenciabr;


public class JanelaFechada extends Estado{
    @Override
    public void transferirJogador(){
        System.out.println("Janela fechada, não é possível a transferência de jogadores.");
    }
}
