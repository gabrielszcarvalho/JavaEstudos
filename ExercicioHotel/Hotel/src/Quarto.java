public class Quarto {
    private int num;
    public enum TipoQuarto{ SUITE, DELUXE, STANDART;}
    private TipoQuarto tipo;
    private Boolean ocupado;
    private Hospede hospedeAtual;

    public Quarto(int num, TipoQuarto tipo, Boolean ocupado){
        this.num = num;
        this.tipo = tipo;
        this.ocupado = ocupado;
    }

    public void setOcupacao(Boolean bool){
        ocupado = bool;
    }
    public void setHospedeAtual(Hospede hospede){
        this.hospedeAtual = hospede;
    }




    public boolean getOcupacao(){
        return ocupado;
    }
    public TipoQuarto getTipo(){
        return tipo;
    }
    public int getNum(){
        return num;
    }

    public Hospede getHospedeAtual() {
        return hospedeAtual;
    }

    public String getNomeHospedeAtual() {
        return hospedeAtual.getNome();
    }
}
