
package mercadodetransferenciabr;


public class JanelaAberta extends Estado {
    private String msgEstado = "aberta";
    
    @Override
    public String getMsgEstado(){
        return msgEstado;
    }
    
    @Override
    public void transferirJogador(){
        registrarRescisao();
        publicarRescisaoBid();
        registrarNovoContrato();
        publicarNovoContratoBid(); // bid --> sistema de registro de jogadores usado pela CBF
        
    }
    private void registrarRescisao(){
        System.out.println("Rescisão protocolada na federação...");
    }
    private void publicarRescisaoBid(){
        System.out.println("Rescisão publicada no Boletim Informativo Diário(BID)");
    }
    private void registrarNovoContrato(){
        System.out.println("Novo vínculo protocolado na federação");
    }
    private void publicarNovoContratoBid(){
        System.out.println("Novo vínculo publicado no Boletim Informativo Diário(BID)");
    }
}
