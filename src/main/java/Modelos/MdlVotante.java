package Modelos;

import Clases.ClsJdbc;
import Clases.ClsMensaje;
import Clases.ClsVotante;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author andre
 */
public class MdlVotante {

    ClsJdbc jdbc;

    public MdlVotante() {
        this.jdbc = new ClsJdbc();
        this.jdbc.CrearConexion();
    }

    public ClsMensaje agregarVotante(ClsVotante votante) {

        ClsMensaje mensaje = new ClsMensaje();

        try {

            String sql = "INSERT INTO tbl_votantes VALUES ( ?, ?, ?, ?)";

            PreparedStatement sentencia = this.jdbc.conexion.prepareStatement(sql);
            sentencia.setString(1, votante.getNumero_documento());
            sentencia.setString(2, votante.getNombre());
            sentencia.setString(3, votante.getTelefono());
            sentencia.setString(4, votante.getCorreo());    

            int resultado = sentencia.executeUpdate();
            //System.out.println("Resultado: " + resultado);
            if (resultado == 1) {
                mensaje.CambiarMensaje(mensaje.OK, "Has creado un nuevo votante");             
            } else {
                mensaje.CambiarMensaje(mensaje.ERROR, "Error no encontrado");              
            }

            return mensaje;

        } catch (Exception e) {
            mensaje.CambiarMensaje(mensaje.ERROR, "Excepción: " + e.getMessage());
            return mensaje;
        }
    }
   
    
    public ClsMensaje ActualizarVotante(ClsVotante votante) {
        ClsMensaje mensaje = new ClsMensaje();

        try {

            String sql = "UPDATE tbl_votantes SET nombre = ?, telefono = ?, correo = ? where id_votante = ?";

            PreparedStatement sentencia = this.jdbc.conexion.prepareStatement(sql);
            sentencia.setString(1, votante.getNombre());
            sentencia.setString(2, votante.getTelefono());
            sentencia.setString(3, votante.getCorreo());
            sentencia.setString(4, votante.getNumero_documento());

            int resultado = sentencia.executeUpdate();

            if (resultado == 1) {
                mensaje.CambiarMensaje(mensaje.OK, "Has editado al votante con documento: " + votante.getNumero_documento());
            } else {

                mensaje.CambiarMensaje(mensaje.ERROR, "Error no encontrado");
            }

            return mensaje;

        } catch (Exception e) {
            mensaje.CambiarMensaje(mensaje.ERROR, "Excepción: " + e.getMessage());
            return mensaje;
        }

    }

    public ClsMensaje EliminarVotante(String idVotante) {

        ClsMensaje mensaje = new ClsMensaje();

        try {

            String sql = "DELETE FROM tbl_votantes WHERE id_votante = ?";

            PreparedStatement sentencia = this.jdbc.conexion.prepareStatement(sql);
            sentencia.setString(1, idVotante);

            int resultado = sentencia.executeUpdate();

            if (resultado == 1) {
                mensaje.CambiarMensaje(mensaje.OK, "Has eliminado al votante: " + idVotante);
            } else {

                mensaje.CambiarMensaje(mensaje.ERROR, "Error no encontrado");
            }

            return mensaje;

        } catch (Exception e) {
            mensaje.CambiarMensaje(mensaje.ERROR, "Excepción: " + e.getMessage());
            return mensaje;
        }

    }

    public LinkedList<ClsVotante> ObtenerVotantes() {

        try {

            LinkedList<ClsVotante> listaVotantes = new LinkedList<>();

            String sql = "SELECT * FROM tbl_votantes";
            PreparedStatement sentencia = this.jdbc.conexion.prepareStatement(sql);
            ResultSet resultados = sentencia.executeQuery();

            while (resultados.next()) {

                String numeroDocumento = resultados.getString("id_votante");
                String nombre = resultados.getString("nombre");
                String telefono = resultados.getString("telefono");
                String correo = resultados.getString("correo");

                ClsVotante vot = new ClsVotante(numeroDocumento, nombre, telefono, correo);

                listaVotantes.add(vot);

            }

            return listaVotantes;

        } catch (Exception e) {

            System.out.println("Uy error" + e.getMessage());
            return null;
        }

    }
    
    public ClsMensaje votar(String idVotante, String idCandidato, int idEleccion) {

        ClsMensaje mensaje = new ClsMensaje();

        try {

            String sql = "INSERT INTO tbl_votos (id_votante,id_candidato,id_elecciones, fecha_ins) VALUES ( ?, ?, ?, now())";

            PreparedStatement sentencia = this.jdbc.conexion.prepareStatement(sql);
            sentencia.setString(1, idVotante);
            sentencia.setString(2, idCandidato);
            sentencia.setInt(3, idEleccion);   

            int resultado = sentencia.executeUpdate();
            if (resultado == 1) {
                mensaje.CambiarMensaje(mensaje.OK, "Gracias por votar");             
            } else {
                mensaje.CambiarMensaje(mensaje.ERROR, "Error al votar");              
            }

            return mensaje;

        } catch (Exception e) {
            mensaje.CambiarMensaje(mensaje.ERROR, "Excepción: " + e.getMessage());
            return mensaje;
        }
    }
    
    
}
