/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import Clases.ClsEleccion;
import Clases.ClsJdbc;
import Clases.ClsVoto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;

/**
 *
 * @author ASUS
 */
public class MdlVoto {

    ClsJdbc jdbc;

    public MdlVoto() {
        this.jdbc = new ClsJdbc();
        this.jdbc.CrearConexion();
    }

    public LinkedList<ClsVoto> ObtenerVotos() {

        try {

            LinkedList<ClsVoto> listaVotos = new LinkedList<>();

            String sql = "SELECT * FROM tbl_votos";
            PreparedStatement sentencia = this.jdbc.conexion.prepareStatement(sql);
            ResultSet resultados = sentencia.executeQuery();

            while (resultados.next()) {

                int idVoto = resultados.getInt("id_voto");
                int idVotante = resultados.getInt("id_votante");
                int idCandidato = resultados.getInt("id_candidato");
                int idEleccion = resultados.getInt("id_elecciones");
                String fechaIns = resultados.getString("fecha_ins");

                ClsVoto voto = new ClsVoto(idVoto, idVotante, idCandidato, idEleccion, fechaIns);
                listaVotos.add(voto);
            }

            return listaVotos;

        } catch (Exception e) {

            System.out.println("Uy error" + e.getMessage());
            return null;
        }

    }

    public int calcularVotos(String idCandidato) {
        
        int cantidadVotos=0;
        try {
            
            String sql = "SELECT count(*) FROM tbl_votos WHERE id_candidato= '"  + idCandidato + "'";
            PreparedStatement sentencia = this.jdbc.conexion.prepareStatement(sql);
            //ResultSet resultados = sentencia.executeQuery();
           // sentencia.setInt(1, Integer.parseInt(idCandidato));

            ResultSet rs = sentencia.executeQuery(sql);
            if (rs.next()) {             
                cantidadVotos = rs.getInt(1);
            }
            return cantidadVotos;

        } catch (Exception e) {

            System.out.println("Uy error" + e.getMessage());
            return 0;
        }

    }

}
