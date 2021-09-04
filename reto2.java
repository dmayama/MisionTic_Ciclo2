import java.util.Scanner;
public class reto2 {
    public static void main(String[] args) throws Exception 
    {
        int cantidad;
        Scanner sc = new Scanner(System.in);
        cantidad = sc.nextInt();
        sc.nextLine();
        CuerpoDeAgua[] cuerpos = new CuerpoDeAgua[cantidad];
        for(int i=0; i < cantidad; i++){
            String c_agua = sc.nextLine();
            String[] datos = c_agua.split(" ");
            String nom = datos[0];
            float irca = Float.valueOf(datos[3]);
            cuerpos[i] = new CuerpoDeAgua(nom,irca);
        }
        sc.close();
        for (int ilec = 0; ilec < cuerpos.length; ilec++) {
            System.out.print(cuerpos[ilec].getnom() + " ");
            System.out.printf("%.2f",cuerpos[ilec].getirca());
            System.out.println(" ");
        }   
        int na = 0;
        float mayor = 0;
        float c_mayor = 0;
        for(int pos=0; pos<cantidad; pos++){
            float valor = cuerpos[pos].getirca();
            if (valor>=50){
                c_mayor = c_mayor+1;
            }
            if(valor>mayor){
                mayor = valor;
            }    
        }
        System.out.printf("%.2f",c_mayor);
        System.out.println(" ");
        for(int pos2=0; pos2<cantidad; pos2++){
            if (cuerpos[pos2].nivel() == "ALTO"){ 
                String nombre = cuerpos[pos2].getnom();
                System.out.print(nombre + " ");
                na=na+1;
            }
        }
        System.out.println("");
        if (na==0){
            System.out.println("NA");
        }
        System.out.printf("%.2f",mayor);
        
    }
    
}

