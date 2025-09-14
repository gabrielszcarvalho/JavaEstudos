import java.util.ArrayList;

public class Hotel {
    private String nome;
    private String endereco;
    private ArrayList<Quarto> quartos;

    public Hotel(String nome, String endereco){
        this.nome = nome;
        this.endereco= endereco;
        this.quartos = new ArrayList<>();
    }

    public void exibirRelatorioOcupacao(){
        for(Quarto quarto : quartos){
            int numeroDoQuarto = quarto.getNum();
            Quarto.TipoQuarto tipoDoQuarto = quarto.getTipo();
            String ocupadoOuNao;

            if (quarto.getOcupacao())
            {ocupadoOuNao = "Ocupado";}
            else
            {ocupadoOuNao = "Desocupado";}

            System.out.printf("Quarto %s - numero '%d': %s\n",tipoDoQuarto,numeroDoQuarto,ocupadoOuNao);

        }
    }

    public void adicionarQuarto(Quarto quarto){
        quartos.add(quarto);
    }

    public Quarto getQuartoPerNum(int numeroEscolhido){
        for(Quarto q: quartos){
            int numeroDoQuarto = q.getNum();
            if(numeroEscolhido == numeroDoQuarto){
                 return q;
            }
        }
        return null;
    }

    public void checkIn(Hospede hospede, Quarto quarto){
        if (!quarto.getOcupacao()){
            quarto.setHospedeAtual(hospede);
            System.out.printf("Hospede %s adicionado ao quarto %d\n",hospede.getNome(),quarto.getNum());
            quarto.setOcupacao(true);
        }else{
            System.out.printf("Quarto %d já está ocupado\n",quarto.getNum());
        }

    }

    public void checkOut(Quarto quarto){
        String nomeHospede = quarto.getNomeHospedeAtual();
        quarto.setOcupacao(false);
        quarto.setHospedeAtual(null);
        System.out.printf("Hospede %s foi embora...\n",nomeHospede);
    }


    public String getNome(){
        return nome;
    }
    public String getEndereco(){
        return endereco;
    }
}
