/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factura;

/**
 *
 * @author PC22
 */
public class Partido {
 
    private String Nombre;
    private String Alias;
    private Partido partido;

    public String getNombre() {
        return Nombre;
    }

    public String getAlias() {
        return Alias;
    }

    public Partido getPartido() {
        return partido;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    public void setPartido(Partido partido) {
        this.partido = partido;
    }
                

