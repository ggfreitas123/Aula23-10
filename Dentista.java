package ex2;

public class Dentista extends ProfissionalSaude{

    public Dentista(String nome, String especialidade, int valorConsulta,String cro) {
        super(nome, especialidade, valorConsulta);
        //TODO Auto-generated constructor stub
    }

    protected String cro;
    public void agendarConsulta(){
        super.agendarConsulta();
        System.out.println();
    }
    

   
    

}
