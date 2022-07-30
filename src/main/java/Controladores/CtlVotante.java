package Controladores;

import Clases.ClsMensaje;
import Clases.ClsVotante;
import Modelos.MdlVotante;
import java.util.LinkedList;

/**
 *
 * @author mao
 */
public class CtlVotante {

    MdlVotante modelo;

    public CtlVotante() {

        this.modelo = new MdlVotante();
    }

    public ClsMensaje AgregarVotante(ClsVotante votante) {

        ClsMensaje respuesta = this.modelo.agregarVotante(votante);
        return respuesta;
    }

    public ClsMensaje ActualizarVotante(ClsVotante votante) {

        ClsMensaje respuesta = this.modelo.ActualizarVotante(votante);
        return respuesta;
    }

    public ClsMensaje EliminarVotante(String candidato) {
        ClsMensaje respuesta = this.modelo.EliminarVotante(candidato);
        return respuesta;
    }

    public LinkedList<ClsVotante> ObtenerVotantes() {

        return this.modelo.ObtenerVotantes();

    }
    
    public ClsMensaje Votar(String idVotante, String idCandidato, int idEleccion){
        return this.modelo.votar(idVotante, idCandidato, idEleccion);
    }
    
    /*public ClsMensaje BuscarVotante(String documentoVotante){
        ClsMensaje respuesta = this.modelo.
    }*/

}
