public class CuerpoDeAgua {
    private String nom;
    private float irca;
    private String n_irca;

    public CuerpoDeAgua(String nom,float irca) {
        this.nom = nom;
        this.irca = irca;
    }

    public String getnom() {
        return nom;
    }

    public float getirca() {
        return irca;
    }

    public void setnom(String nom) {
        this.nom = nom;
    }

    public void setcBodega(int irca) {
        this.irca = irca;
    }

    public String nivel(){
        
        if (irca>=80.1 && irca<=100){
            n_irca = "INVIABLE SANITARIAMENTE";
        }
        if (irca>=35.1 && irca<=80){
            n_irca = "ALTO";
        } 
        if (irca>=14.1 && irca<=35){
            n_irca = "MEDIO";
        } 
        if (irca>=5.1 && irca<=14){
            n_irca = "BAJO";
        } 
        if (irca>=0 && irca<=5){
            n_irca = "SIN RIESGO";
        }
        return n_irca;

    }
}
