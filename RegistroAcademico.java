public class RegistroAcademico {

	public static void main(String[] args) {
		
		Registro Michael = new Registro("Michael", 123, 5, 5);
		
		Michael.calculaMensalidade();

	}
}

class Registro{
	
	private String nome;
	private int matricula;
	private int codigoCurso;
	private int percentualCobranca;
	
	Registro(String nome, int matricula, int codigoCurso, int percentualCobranca){
		this.setNome(nome);
		this.setMatricula(matricula);
		this.setCodigoCurso(codigoCurso);
		this.setPercentualCobranca(percentualCobranca);
	}
	
	void calculaMensalidade() {
		double mensalidade = 100* codigoCurso * percentualCobranca;
		System.out.println(mensalidade);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public int getCodigoCurso() {
		return codigoCurso;
	}

	public void setCodigoCurso(int codigoCurso) {
		this.codigoCurso = codigoCurso;
	}

	public int getPercentualCobranca() {
		return percentualCobranca;
	}

	public void setPercentualCobranca(int percentualCobranca) {
		this.percentualCobranca = percentualCobranca;
	}

}
