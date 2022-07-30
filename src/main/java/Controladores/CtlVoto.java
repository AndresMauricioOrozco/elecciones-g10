/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Clases.ClsEleccion;
import Clases.ClsVoto;
import Modelos.MdlVoto;
import java.util.LinkedList;

/**
 *
 * @author ASUS
 */
public class CtlVoto {
    
    MdlVoto modelo;

    public CtlVoto() {
        this.modelo = new MdlVoto();
    }
    
    public LinkedList<ClsVoto> ObtenerVotos() {
        return this.modelo.ObtenerVotos();
    }
    
    public int CalcularVotos(String idCandidato){
        return this.modelo.calcularVotos(idCandidato);
    }
}
