package ex2;

public class ProfissionalSaude {

        protected String nome;
        protected String especialidade;
        protected int valorConsulta;
        public ProfissionalSaude(String nome, String especialidade, int valorConsulta) {
            this.nome = nome;
            this.especialidade = especialidade;
            this.valorConsulta = valorConsulta;
        }

        public void agendarConsulta(){
            System.out.println("Nome: "+nome);
            System.out.println("Especialidade: "+especialidade);
            System.out.println("Valor Consulta: "+valorConsulta);
        }
    }
