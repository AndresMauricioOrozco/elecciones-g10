package Clases;

public class ClsVoto {
    int idVoto;
    int idVotante;
    int idCandidato;
    int idElecciones;
    String fechaVoto;
    
    public ClsVoto(){
        
    }
    
    public ClsVoto(int idVotante, int idCandidato, int idElecciones, String fechaVoto){
        this.idVotante = idVotante;
        this.idCandidato = idCandidato;
        this. idElecciones = idElecciones;
        this.fechaVoto = fechaVoto;
    }
    
    public ClsVoto(int idVoto, int idVotante, int idCandidato, int idElecciones, String fechaVoto){
        this.idVoto = idVoto;
        this.idVotante = idVotante;
        this.idCandidato = idCandidato;
        this. idElecciones = idElecciones;
        this.fechaVoto = fechaVoto;
    }

    public int getIdVoto() {
        return idVoto;
    }

    public void setIdVoto(int idVoto) {
        this.idVoto = idVoto;
    }

    public int getIdVotante() {
        return idVotante;
    }

    public void setIdVotante(int idVotante) {
        this.idVotante = idVotante;
    }

    public int getIdCandidato() {
        return idCandidato;
    }

    public void setIdCandidato(int idCandidato) {
        this.idCandidato = idCandidato;
    }

    public int getIdElecciones() {
        return idElecciones;
    }

    public void setIdElecciones(int idElecciones) {
        this.idElecciones = idElecciones;
    }

    public String getFechaVoto() {
        return fechaVoto;
    }

    public void setFechaVoto(String fechaVoto) {
        this.fechaVoto = fechaVoto;
    }
    
    
    
}

