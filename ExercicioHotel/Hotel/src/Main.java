//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Hotel hotel1 = new Hotel("Grand Hotel Maringá","Rua das Bergamotas 9811");

        System.out.println();
        System.out.println();

        System.out.printf("Bem vindos ao Hotel %s, o melhor hotel de Maringá! Desde os seus primórdios localizado na %s\n",hotel1.getNome(),hotel1.getEndereco());

        System.out.println();

        Quarto[] quartosAdicionados = {
                new Quarto(1001, Quarto.TipoQuarto.STANDART,false),
                new Quarto(1002, Quarto.TipoQuarto.STANDART,false),
                new Quarto(1003, Quarto.TipoQuarto.STANDART,false),
                new Quarto(1004, Quarto.TipoQuarto.STANDART,false),
                new Quarto(1005, Quarto.TipoQuarto.STANDART,false),
                new Quarto(1006, Quarto.TipoQuarto.STANDART,false),
                new Quarto(1007, Quarto.TipoQuarto.STANDART,false),
                new Quarto(1008, Quarto.TipoQuarto.SUITE,false),
                new Quarto(1009, Quarto.TipoQuarto.SUITE,false),
                new Quarto(1010, Quarto.TipoQuarto.SUITE,false),
                new Quarto(1011, Quarto.TipoQuarto.SUITE,false),
                new Quarto(1012, Quarto.TipoQuarto.SUITE,false),
                new Quarto(1013, Quarto.TipoQuarto.SUITE,false),
                new Quarto(1014, Quarto.TipoQuarto.SUITE,false),
                new Quarto(1015, Quarto.TipoQuarto.SUITE,false),
                new Quarto(1016, Quarto.TipoQuarto.SUITE,false),
                new Quarto(1017, Quarto.TipoQuarto.DELUXE,false),
                new Quarto(1018, Quarto.TipoQuarto.DELUXE,false),
                new Quarto(1019, Quarto.TipoQuarto.DELUXE,false),
                new Quarto(1020, Quarto.TipoQuarto.DELUXE,false)
        };

        for(Quarto q: quartosAdicionados){
            hotel1.adicionarQuarto(q);
        }

        Hospede hospede1 =  new Hospede("Carlos","07524582994");
        Hospede hospede2 =  new Hospede("Gabriel","06534585987");

        hotel1.exibirRelatorioOcupacao();

        System.out.println();
        System.out.println();



        hotel1.checkIn(hospede1,hotel1.getQuartoPerNum(1019));
        hotel1.checkIn(hospede2,hotel1.getQuartoPerNum(1019));


        hotel1.checkIn(hospede2,hotel1.getQuartoPerNum(1013));

        System.out.println();
        System.out.println();

        hotel1.exibirRelatorioOcupacao();

        System.out.println();


        hotel1.checkOut(hotel1.getQuartoPerNum(1019));

        System.out.println();

        hotel1.exibirRelatorioOcupacao();

    }
}