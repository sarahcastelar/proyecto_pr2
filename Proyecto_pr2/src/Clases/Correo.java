
package Clases;

public class Correo {
    
    private String correo;
    private String nombre;
    private String apellido;
    private int edad;
    private String nacionalidad;
    private String preguntaSeguridad;
    private String respuestaSeguridad;
    

    public Correo() {
    }

    public Correo(String correo, String nombre, String apellido, int edad, String nacionalidad, String preguntaSeguridad, String respuestaSeguridad) {
        this.correo = correo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.preguntaSeguridad = preguntaSeguridad;
        this.respuestaSeguridad = respuestaSeguridad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
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

    @Override
    public String toString() {
        return "Correo{" + "correo=" + correo + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", nacionalidad=" + nacionalidad + ", preguntaSeguridad=" + preguntaSeguridad + ", respuestaSeguridad=" + respuestaSeguridad + '}';
    }
    
    
    
    
}
