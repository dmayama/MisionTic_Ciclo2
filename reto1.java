import java.util.Scanner;
public class reto1 {
    public static void main(String[] args) throws Exception 
    {
        int cantidad, inviable;
        float promedio,promedio_med,sum;
        Scanner sc = new Scanner(System.in);
           cantidad = sc.nextInt();
           sc.nextLine();
           String cadena = sc.nextLine();
           String[] porcentaje = cadena.split(" ");
           sum = 0;
           promedio_med = 0;
           for(int i=0; i < cantidad; i++){
               String valorstr = porcentaje[i];
               float valor = Float.valueOf(valorstr); 
               sum = valor+sum;
               if (valor>=14.1 && valor<=35){
                  promedio_med=1+promedio_med;
                } 
               if (valor>=5.1 && valor<=14){
                  promedio_med=1+promedio_med;
                } 
           }
        sc.close(); 
        inviable = 0;
        promedio = sum/cantidad;
        float promedio_2=(promedio_med/cantidad)*100;
        if (promedio>=80.1 && promedio<=100){
            System.out.println("INVIABLE SANITARIAMENTE");
            inviable = inviable+1;
        }
        if (promedio>=35.1 && promedio<=80){
            System.out.println("ALTO");
        } 
        if (promedio>=14.1 && promedio<=35){
            System.out.println("MEDIO");
        } 
        if (promedio>=5.1 && promedio<=14){
            System.out.println("BAJO");
        } 
        if (promedio>=0 && promedio<=5){
            System.out.println("SIN RIESGO");
            System.out.println("Continuar el control y la vigilancia");
        } 
        
        System.out.printf("%.2f",promedio_2);
        System.out.println(" ");
        if (inviable>0){
            System.out.println("SI");
        }
        if (inviable==0){
            System.out.println("NO");
        }   
    }
    
}
