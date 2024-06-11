import javafx.stage.Stage;
import javafx.event.Event;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;

/**
 * Controla os dados do modelo e a interação com a interface (visão)
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class CRACHAController
{
    CRACHAView crachaView;
    Stage stage;
    CRACHA cracha;
    public TextField textFieldNome;
    public TextField textFieldHr1;
    public TextField textFieldMin1;
    public TextField textFieldHr2;
    public TextField textFieldMin2;
    public Label labelResultado;
    
    /**
     * Construtor para objetos da classe CRACHAController
     */
    public CRACHAController()
    {
        this.stage = new Stage();
        this.crachaView = new CRACHAView();
        this.crachaView.setController(this);
    }
    
    public void iniciar() throws Exception {
        this.crachaView.start(this.stage);
        this.stage.show();
    }
    
    public void botaoCalcularClicado(Event e) {
        try {
            String nome = textFieldNome.getText().toString();
            double hr1 = Double.parseDouble(textFieldHr1.getText());
            double min1 = Double.parseDouble(textFieldMin1.getText());
            double hr2 = Double.parseDouble(textFieldHr2.getText());
            double min2 = Double.parseDouble(textFieldMin2.getText());
            CRACHA cracha = new CRACHA(nome, hr1, min1, hr2, min2);
            this.labelResultado.setText(cracha.interpretar());
        } catch (NumberFormatException exception) {
            labelResultado.setText("Dados de entrada incompletos ou inválidos");
        }
    }
    
    public void botaoLimparClicado(Event e) {
        textFieldHr1.setText("");
        textFieldMin1.setText("");
        textFieldHr2.setText("");
        textFieldMin2.setText("");
        labelResultado.setText("");
    }    
}