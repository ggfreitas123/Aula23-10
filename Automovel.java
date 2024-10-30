package g;

public class Automovel extends Veiculo {
    private String motor;
    private int numeroPortas;
    public Automovel(String marca, String modelo, int ano, String cor, String motor, int numeroPortas) {
        super(marca, modelo, ano, cor);
        //TODO Auto-generated constructor stub
    }
    
    

    @Override
    public void exibirInfo(){
        super.exibirInfo();
        System.out.println("Numero de Portas: "+numeroPortas);
        System.out.println("Motor: "+motor);
    }

}
