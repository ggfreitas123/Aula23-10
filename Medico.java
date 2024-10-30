package ex2;

public class Medico extends ProfissionalSaude{
    public Medico(String nome, String especialidade, int valorConsulta, String crm) {
        super(nome, especialidade, valorConsulta);
        //TODO Auto-generated constructor stub
    }

    protected String crm;
    @Override
    public void agendarConsulta(){
        super.agendarConsulta();
        System.out.println("crm: "+crm);
    }

    
}
