import exercicios.Cidade;
import exercicios.CidadeRecord;
import exercicios.PessoaRecord;
import exercicios.PessoaRecordShallow;

/**
 * Classe para você testar suas implementações.
 * Veja o README para mais detalhes.
 */
public class Principal {
    public static void main(final String[] args) {
        final var cr = new CidadeRecord("São Paulo");
        System.out.println(cr.toString());

        Cidade cidade = new Cidade("Brasilia");
        cidade.setNome("Palmeiras");
        System.out.println(cidade.toString());

        final var prs = new PessoaRecordShallow("Tandson",cidade);
        System.out.println("Antes "+prs.toString());
        prs.cidade().setNome("Palmas");
        System.out.println(prs.toString());

        System.out.println("Completamente imutavel");
        final var pr = new PessoaRecord("Manoel",cr);
        System.out.println(pr.toString());
    }
}
