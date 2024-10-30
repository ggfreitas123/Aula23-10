package ex2;

public class Fisioterapia extends ProfissionalSaude {
    public Fisioterapia(String nome, String especialidade, int valorConsulta, String crefito) {
        super(nome, especialidade, valorConsulta);
        //TODO Auto-generated constructor stub
    }

    private String crefito;

    public void agendarConsulta(){
        super.agendarConsulta();
        System.out.println("crefito: "+crefito);
    }
    

    
}
