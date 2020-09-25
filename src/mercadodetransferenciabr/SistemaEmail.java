/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercadodetransferenciabr;

/**
 *
 * @author PedroH
 */
public class SistemaEmail implements Observador {
    public void notificar(Estado estado){
        System.out.println("Enviando emails para clubes informando que a janela está " + estado.getMsgEstado() + "...");
    }
}
