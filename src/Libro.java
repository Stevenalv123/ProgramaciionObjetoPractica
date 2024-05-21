public class Libro extends Publicacion{
     private int num_paginas;

    public Libro(String titulo, int año_publicacion, String autor, int num_paginas) {
        super(titulo, año_publicacion, autor);
        this.num_paginas=num_paginas;
    }

    public void MostrarInfo(){
        super.MostrarInfo();
        System.out.println("Numero de Paginas: "+num_paginas);
    }

    public int getnum_paginas(){
        return num_paginas;
    }
    
    public void setNum_Paginas(int num_paginas){
        this.num_paginas=num_paginas;
    }
}
