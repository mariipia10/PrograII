package ej12;

public class Documento {

    private Fecha fecha;

    private String cuerpo;

    private String titulo;

    public Documento(Fecha fecha, String cuerpo, String titulo) {
        this.fecha = fecha;
        setCuerpo(cuerpo);
        setTitulo(titulo);
    }

    public void setCuerpo(String cuerpo) {
        if(cuerpo != null && cuerpo.length() >= 5) {
           this.cuerpo = cuerpo; 
        }
    }

    public void setTitulo(String titulo) {
        if(titulo != null && titulo.length() >= 5) {
           this.titulo = titulo; 
        }
    }
    

    public String getFecha() {
        return fecha.getFecha();
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public String getTitulo() {
        return titulo;
    }
    public int getCharsCuerpo(){
        return cuerpo.length();
    }
    
    
}
