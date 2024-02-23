import Codigojava.Empresa;
import Codigojava.Equipe;
import Codigojava.Funcionario;
import Codigojava.Localizacao;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class teste {

    @Test
    public void testGetNome() {
        Empresa empresa = new Empresa("empresaTeste", "aeronave");
        String nome = empresa.getNome();
        Assertions.assertEquals("empresaTeste", nome);
        if (nome.equals("empresaTeste")) {
            System.out.println("Teste testGetNome passou com sucesso!");
        }
    }

    @Test
    public void testSetNome() {
        Empresa empresa = new Empresa("empresaTeste", "aeronave");
        empresa.setNome("novoNometestandoSet");
        String nome = empresa.getNome();
        Assertions.assertEquals("novoNometestandoSet", nome);
        if (nome.equals("novoNometestandoSet")) {
            System.out.println("Teste testSetNome passou com sucesso!");
        }
    }

    @Test
    public void testGetRamo() {
        Empresa empresa = new Empresa("empresaTeste", "aeronave");
        String ramo = empresa.getRamo();
        Assertions.assertEquals("aeronave", ramo);
        if (ramo.equals("aeronave")) {
            System.out.println("Teste testGetRamo passou com sucesso!");
        }
    }

    @Test
    public void testSetRamo() {
        Empresa empresa = new Empresa("testeNomeset", "aeronave");
        empresa.setRamo("nomeSetado");
        String ramo = empresa.getRamo();
        Assertions.assertEquals("nomeSetado", ramo);
        if (ramo.equals("nomeSetado")) {
            System.out.println("Teste testSetRamo passou com sucesso!");
        }
    }

    @Test
    public void testLocalizacao() {
        Localizacao local = new Localizacao();
        local.setCep("123456");
        Assertions.assertEquals("123456", local.getCep());
        if ("123456".equals(local.getCep())) {
            System.out.println("Teste testLocalizacao passou com sucesso!");
        }
    }

    @Test
    public void testEquipeCadastroFuncionario() {
        Equipe equipe = new Equipe();
        equipe.cadastrarFuncionario(new Funcionario("Alberto"));

        List<Funcionario> funcionarios = equipe.getFuncionarios();
        Assertions.assertEquals("Alberto", funcionarios.get(0).getNome());
        if ("Alberto".equals(funcionarios.get(0).getNome())) {
            System.out.println("Teste testEquipeCadastroFuncionario passou com sucesso!");
        }
    }

    @Test
    public void testGetFuncionario() {
        Equipe equipe = new Equipe();
        equipe.cadastrarFuncionario(new Funcionario("Alberto"));
        equipe.cadastrarFuncionario(new Funcionario("Luiz"));
        equipe.cadastrarFuncionario(new Funcionario("Pedro"));
        equipe.cadastrarFuncionario(new Funcionario("Alonso"));

        List<Funcionario> funcionarios = equipe.getFuncionarios();
        Assertions.assertEquals(4, funcionarios.size());
        Assertions.assertEquals("Alberto", funcionarios.get(0).getNome());
        Assertions.assertEquals("Luiz", funcionarios.get(1).getNome());
        Assertions.assertEquals("Pedro", funcionarios.get(2).getNome());
        Assertions.assertEquals("Alonso", funcionarios.get(3).getNome());
        if (funcionarios.size() == 4 &&
                "Alberto".equals(funcionarios.get(0).getNome()) &&
                "Luiz".equals(funcionarios.get(1).getNome()) &&
                "Pedro".equals(funcionarios.get(2).getNome()) &&
                "Alonso".equals(funcionarios.get(3).getNome())) {
            System.out.println("Teste testGetFuncionario passou com sucesso!");
        }
    }

    @Test
    public void testGetNomeLider() {
        Equipe equipe = new Equipe();
        equipe.setNomeLider("Roger");
        String nomeLider = equipe.getNomeLider();
        Assertions.assertEquals("Roger", nomeLider);
        if ("Roger".equals(nomeLider)) {
            System.out.println("Teste testGetNomeLider passou com sucesso!");
        }
    }

    @Test
    public void testGetCep() {
        Localizacao local = new Localizacao();
        local.setCep("12247580");
        String cep = local.getCep();
        Assertions.assertEquals("12247580", cep);
        if ("12247580".equals(cep)) {
            System.out.println("Teste testGetCep passou com sucesso!");
        }
    }

    @Test
    public void testGetNomeEmpresaLocalizacao() {
        Localizacao local = new Localizacao();
        local.setCep("123456");
        local.setNomedoEndereco("rua teste da silva");
        local.setEmpresa(new Empresa("teste", "123"));

        Assertions.assertEquals("teste", local.getEmpresa().getNome());
        if ("teste".equals(local.getEmpresa().getNome())) {
            System.out.println("Teste testGetNomeEmpresaLocalizacao passou com sucesso!");
        }
    }
}
