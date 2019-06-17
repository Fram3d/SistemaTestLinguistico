package Domain;
import java.util.ArrayList;
import java.util.List;

public class TestClinico extends Test {
	
	private List<Domanda> domande;
	private Valutazione diagnosi;

	public TestClinico(String nome,Sezione sezione) {
		super(nome);
		this.domande=new ArrayList<Domanda>();
	}
	
	public void produciDiagnosi(Valutazione valutazione) {
		this.diagnosi = valutazione;
	}

}
