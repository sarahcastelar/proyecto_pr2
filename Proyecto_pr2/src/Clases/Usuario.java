
package Clases;


public class Usuario {
    
    
    
    private String nombre;
    private String apellido;
    private String user;
    private String pass;
    private Correo correo;
    private String preguntaSeguridad;
    private String respuestaSeguridad;

    public Usuario() {
    }


    public Usuario(String nombre, String apellido, String user, String pass, Correo correo, String preguntaSeguridad, String respuestaSeguridad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.user = user;
        this.pass = pass;
        this.correo = correo;
        this.preguntaSeguridad = preguntaSeguridad;
        this.respuestaSeguridad = respuestaSeguridad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Correo getCorreo() {
        return correo;
    }

    public void setCorreo(Correo correo) {
        this.correo = correo;
    }
    
    public void deleteCorreo() {
        this.correo = null;
    }

    public String getPreguntaSeguridad() {
        return preguntaSeguridad;
    }

    public void setPreguntaSeguridad(String preguntaSeguridad) {
        this.preguntaSeguridad = preguntaSeguridad;
    }

    public String getRespuestaSeguridad() {
        return respuestaSeguridad;
    }

    public void setRespuestaSeguridad(String respuestaSeguridad) {
        this.respuestaSeguridad = respuestaSeguridad;
    }

    
    
    
    
    
    
    
}
