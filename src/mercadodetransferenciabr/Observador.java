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
public interface Observador {
    public abstract void notificar(Estado estado);
}
