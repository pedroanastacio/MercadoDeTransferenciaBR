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
public class SiteCBF implements Observador {
    public void notificar(Estado estado){
        System.out.println("Alterando estado da janela no site da CBF para: janela " + estado.getMsgEstado() + "!");
    }
}
