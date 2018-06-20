
package Clases;

public class Correo {
    
    private String nombre;
    private String correoEmisor;
    private String correoReceptor;
    private String asunto;
    private String cuerpo;
    
    /*
    private String bandeja;
    private String spam;
    private String eliminados;
    private String papeleraReciclaje;
    creo que esto son clases. 
    */
    

    public Correo() {
    }

    public Correo(String correoEmisor) {
        this.correoEmisor = correoEmisor;
    }
    
    public Correo( String correoEmisor, String correoReceptor, String asunto, String cuerpo) {;
        this.correoEmisor = correoEmisor;
        this.correoReceptor = correoReceptor;
        this.asunto = asunto;
        this.cuerpo = cuerpo;
    }
    
    public String getCorreoEmisor() {
        return correoEmisor;
    }

    public void setCorreoEmisor(String correoEmisor) {
        this.correoEmisor = correoEmisor;
    }

    public String getCorreoReceptor() {
        return correoReceptor;
    }

    public void setCorreoReceptor(String correoReceptor) {
        this.correoReceptor = correoReceptor;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    @Override
    public String toString() {
        return correoEmisor;
    }
    
    
    
    
    
    
    
}
    