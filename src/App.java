public class App {
    public static void main(String[] args) throws Exception {
        Libro libro=new Libro(null, 0, null, 0);
        Revista revista=new Revista(null, 0, null, 0);

        libro.setTitulo("Azul");
        libro.setAutor("Ruben Dario");
        libro.setAño_Publicacion(1896);
        libro.setNum_Paginas(56);

        libro.MostrarInfo();

        revista.setTitulo("Sandino");
        revista.setAutor("La prensa");
        revista.setAño_Publicacion(2019);
        revista.setNum_Edicion(3);

        revista.MostrarInfo();
    }
}
