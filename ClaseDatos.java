package tarea;

public class ClaseDatos {
    
  private String nombre;
  private String aleas;
  private String codigo;
  private String telefono;
  private String correo;
  private String Codigocurso;
  private String NombreCurso;
  private String CodigoGrado;
  private String descripcion;
  
  public ClaseDatos(){
     nombre = "";
     aleas = "";
  }

   public String getNombre() {
      return nombre;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   public String getAleas() {
      return aleas;
   }

   public void setAleas(String aleas) {
      this.aleas = aleas;
   }
   
    public String getCodigo() {
      return codigo;
   }

   public void setCodigo (String codigo) {
      this.codigo = codigo;
   }
   
      public String getTelefono() {
      return telefono;
   }

   public void setTelefono (String telefono) {
      this.telefono = telefono;
   }
   
     public String getCorreo() {
      return correo;
   }

   public void setCorreo (String correo) {
      this.correo = correo;
   }
   
        public String getCodigoCurso() {
      return Codigocurso;
   }

   public void setCodigoCurso (String codigoc) {
      this.Codigocurso = codigoc;
   }
   
    public String getNombreCurso() {
      return NombreCurso;
   }

   public void setNombreCurso (String nombrec) {
      this.NombreCurso = nombrec;
   }
   
  public String getCodigoGrado() {
      return CodigoGrado;
   }

   public void setCodigoGrado (String codigog) {
      this.CodigoGrado = codigog;
   }
   
    public String getDescripcion() {
      return descripcion;
   }

   public void setDescripcion (String des) {
      this.descripcion = des;
   }
    
}
