import br.com.poliveira.classes.PessoaFisica;
import br.com.poliveira.classes.PessoaJuridica;

public class App {
    public static void main(String[] args) throws Exception {
        // Criando uma instância de Pessoa Física
        PessoaFisica pf = new PessoaFisica(1, "Patrick", "123.456.789-12");

        // Criando uma instância de Pessoa Jurídica
        PessoaJuridica pj = new PessoaJuridica(2, "Empresa EBAC", "12.345.678/0001-99");

        // Exibindo os resultados
        System.out.println("=== Teste de Herança e Classes Abstratas ===");
        System.out.println(pf);
        System.out.println(pj);
    }
}
