public class Revista extends Publicacion{
    private int num_edicion;

    public Revista(String titulo, int año_publicacion, String autor, int num_edicion) {
        super(titulo, año_publicacion, autor);
        this.num_edicion=num_edicion;
    }

    public void MostrarInfo(){
        super.MostrarInfo();
        System.out.println("Numero de edicion: "+num_edicion);
    }

    public int getnum_edicion(){
        return num_edicion;
    }

    public void setNum_Edicion(int num_edicion){
        this.num_edicion=num_edicion;
    }
}
