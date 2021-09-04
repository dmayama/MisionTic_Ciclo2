import java.util.ArrayList;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.collections.FXCollections;

public class Controller {

    @FXML
    private TextField textFieldTipoAgua;

    @FXML
    private TextField textFieldIrca;

    @FXML
    private TextField textFieldNombre;

    @FXML
    private TextField textFieldId;

    @FXML
    private TextField textFieldMunicipio;

    @FXML
    private TextField textFieldCuerpo;
    
    @FXML
    private ListView<String> datosIngresados;
    
    @FXML
    private ListView<String> datosProcesador;

    static ObservableList<String> list = FXCollections.observableArrayList();
    static ObservableList<String> list2 = FXCollections.observableArrayList();
    static ObservableList<String> altos = FXCollections.observableArrayList();

    static ArrayList<CuerpoDeAgua> datos = new ArrayList<>();
    

    public void capturar_datos(){
        String dato_nombre = textFieldNombre.getText();
        String dato_id  = textFieldId.getText();
        String dato_municipio = textFieldMunicipio.getText();
        String dato_cuerpo = textFieldCuerpo.getText();
        String dato_agua = textFieldTipoAgua.getText();
        String dato_irca = textFieldIrca.getText();
        CuerpoDeAgua ec1 = new CuerpoDeAgua();
        ec1.setNombre(dato_nombre);
        ec1.setId(Double.parseDouble(dato_id));
        ec1.setMunicipio(dato_municipio);
        ec1.setTipo_cuerpo(dato_cuerpo);
        ec1.setTipo_agua(dato_agua);
        ec1.setIrca(Double.parseDouble(dato_irca));
        datos.add(ec1);
        list.add(ec1.toString());
        list2.add(ec1.toString2());
        datosIngresados.setItems(list);
    }
    public void procesar_datos(){
        int cantidad = datos.size();
        int na = 0;
        Double mayor=0.0 ;
        Double c_mayor=0.0 ;
        for(int i=0; i < cantidad ; i++){
            String c_agua = datos.get(i).toString();
            String[] parts = c_agua.split(" ");
            String nom = parts[0];
            Double irca_pros = Double.valueOf(parts[5]);
            Double valor = irca_pros;
            if (valor>=50){
                c_mayor = c_mayor+1;
            }
            if(valor>mayor){
                mayor = valor;
            }  
            if (irca_pros>=35.1 && irca_pros<=80){
                //alto
                altos.add(nom);
                na=na+1;
            } 
        }
        String altos_s = altos.toString();
        list2.add(Double.toString(c_mayor));
        if (na==0){
            list2.add("NA");
        }else{
            list2.add(altos_s);
        }
        list2.add(Double.toString(mayor)); 
        datosProcesador.setItems(list2); 
    }
    
}

