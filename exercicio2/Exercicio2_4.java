public class Aluno {
    String nome, numeroMatricula;
    int idade;
    public void ImprimirDadosCadastrais () {
        System.out.println("Nome:" + this.nome + " - Idade:"+ this.idade + " - Matrícula:"+ this.numeroMatricula);

    }
  public static void main(String[] args) {
 Aluno aluno1 = new Aluno(); 
 Aluno aluno2 = new Aluno();
 Aluno aluno3 = new Aluno();
 Aluno aluno4 = new Aluno();
 
 	aluno1.nome = " Rafaela ";
	aluno1.idade = 16;
 	aluno1.numeroMatricula = "201418110221";
 	aluno1.ImprimirDadosCadastrais();

 aluno2.nome = " Bruna ";
 aluno2.idade = 17;
 aluno2.numeroMatricula = "201418110336";
 aluno2.ImprimirDadosCadastrais();

 aluno3.nome = " Sabrina ";
 aluno3.idade = 17;
 aluno3.numeroMatricula = "201418110745";
 aluno3.ImprimirDadosCadastrais();

 aluno4.nome = " Caio ";
 aluno4.idade = 17;
 aluno4.numeroMatricula = "201418110880";
 aluno4.ImprimirDadosCadastrais();

	}
}




