package entidade;

import java.util.ArrayList;

public class GerenciarAlunos {
    private ArrayList<Aluno> alunos = new ArrayList<Aluno>();

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
        System.out.println("Aluno adicionado com sucesso");

    }
    public void listarAluno() {
        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno encontrado");

        } else {
            for (int i = 0; i < alunos.size(); i++) {
                System.out.println("|" + i + alunos.get(i).toString());

            }
        }
    }
        public void atualizarValor(int id, String nome, Double nota1,  Double nota2) {
            var aluno = alunos.get(id);
            aluno.setNome(nome);
            aluno.setNota1(nota1);
            aluno.setNota2(nota2);
        }

      public void excluirAluno(int id){
          alunos.remove(id);
          System.out.println("Aluno removido com sucesso");
        }






}
