
public class CRACHA
{
    String nome;
    double hr1;
    double min1;
    double hr2;
    double min2;
    
    public CRACHA() {
        this.nome = nome;
        this.hr1 = 0;
        this.min1 = 0;
        this.hr2 = 0;
        this.min2 = 0;
    }
    
    public CRACHA(String nome, double hr1, double min1, double hr2, double min2)
    {
        this.nome = nome;
        this.hr1 = hr1;  
        this.min1 = min1;
        this.hr2 = hr2;
        this.min2 = min2;
    }

    public double calcular()
    {
        if (this.hr1 <= 0 || this.min1 <=0 || this.hr2 <= 0 || this.min2 <=0)
            return 0;
        return ((this.hr2 * 60 + this.min2) - (this.hr1 * 60 + this.min1))/60;
    }
    
    public String interpretar()
    {
        String resultado = "";
        double cracha = this.calcular();
        if (cracha == 0)
            resultado += "Dados incompletos ou inválidos";
        else
            resultado += "Calculo feito com sucesso";
        return resultado;
    }
}
