public class Publicacion {
    private String titulo;
    private int año_publicacion;
    private String autor;

    public Publicacion(String titulo, int año_publicacion, String autor){
        this.titulo=titulo;
        this.año_publicacion=año_publicacion;
        this.autor=autor;
    }

    public void MostrarInfo(){
        System.out.println(" Titulo: "+titulo+" Año de Publicacion: "+año_publicacion+" Autor: "+autor);
    }

    public String gettitulo(){
        return gettitulo();
    }

    public String getautor(){
        return autor;
    }

    public int getaño_publicacion(){
        return año_publicacion;
    }

    public void setTitulo(String titulo){
        this.titulo=titulo;
    }

    public void setAutor(String autor){
        this.autor=autor;
    }

    public void setAño_Publicacion(int año_publicacion){
        this.año_publicacion=año_publicacion;
    }
}
