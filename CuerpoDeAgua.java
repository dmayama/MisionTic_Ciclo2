public class CuerpoDeAgua extends ObjetoGeografico{
    private String nombre, municipio, nivel;
    public String getNivel() {
        return nivel;
    }
    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    private Double id,irca;

    public CuerpoDeAgua(){

    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public Double getId() {
        return id;
    }

    public void setId(Double id) {
        this.id = id;
    }

    public Double getIrca() {
        return irca;
    }

    public void setIrca(Double irca) {
        this.irca = irca;
    }

    public String toString(){
        return nombre+" "+String.valueOf(id)+" "+municipio+" "+getTipo_agua()+" "+getTipo_cuerpo()+" "+String.valueOf(irca);
    }
    public String toString2(){
        return nombre+" "+String.valueOf(irca);
    }
    
}
