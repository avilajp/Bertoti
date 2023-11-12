import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class teste {

    @Test
    public void testGetNome() {
        Empresa empresa = new Empresa("empresaTeste", "aeronave");
        String nome = empresa.getNome();
        Assertions.assertEquals("empresaTeste", nome);
    }

    @Test
    public void testSetNome() {
        Empresa empresa = new Empresa("empresaTeste", "aeronave");
        empresa.setNome("novoNometestandoSet");
        String nome = empresa.getNome();
        Assertions.assertEquals("novoNometestandoSet", nome);
    }

    @Test
    public void testGetRamo() {
        Empresa empresa = new Empresa("empresaTeste", "aeronave");
        String ramo = empresa.getRamo();
        Assertions.assertEquals("aeronave", ramo);
    }
    
    @Test
    public void testSetRamo(){
        Empresa empresa = new Empresa("testeNomeset","aeronave");
        empresa.setRamo("nomeSetado");
        String ramo = empresa.getRamo();
        Assertions.assertEquals("nomeSetado",ramo);
    }

    @Test
    public void testLocalizacao() {
        Localização local = new Localização();
        local.setCep("123456");
        Assertions.assertEquals(local.getCep(),local.cep);
        
    }

    @Test
    public void testEquipeCadastroFuncionario() {
        Equipe equipe = new Equipe();
        equipe.cadastrarFuncionario(new Funcionario("FuncionarioTeste1"));
        
        Assertions.assertEquals("FuncionariosTeste1",equipe.getFuncionarios().get(0));
        
        
    }
    @Test
    public void testGetFuncionario(){
        Equipe equipe = new Equipe();
        equipe.cadastrarFuncionario(new Funcionario("FuncionarioTeste1"));
        equipe.cadastrarFuncionario(new Funcionario("FuncionarioTeste2"));
        equipe.cadastrarFuncionario(new Funcionario("FuncionarioTeste3"));
        equipe.cadastrarFuncionario(new Funcionario("FuncionarioTeste4"));

        List<Funcionario> funcionarios = equipe.getFuncionarios();
        Assertions.assertEquals(4, funcionarios.size());
        Assertions.assertEquals("FuncionarioTeste1", funcionarios.get(0).getNome());
        Assertions.assertEquals("FuncionarioTeste2", funcionarios.get(1).getNome());
        Assertions.assertEquals("FuncionarioTeste3", funcionarios.get(2).getNome());
        Assertions.assertEquals("FuncionarioTeste4", funcionarios.get(3).getNome());
    }
    
    @Test
    public void testGetNomeLider(){
        Equipe equipe = new Equipe();
        equipe.setNomeLider("teste1");
        String nomeLider = equipe.getNomeLider();
        Assertions.assertEquals("teste1",nomeLider);
    }
    
    @Test
    public void testgetCep(){
        Localização local = new Localização();
        local.setCep("12247580");
        String cep = local.getCep();
        Assertions.assertEquals(cep,"12247580");
    }

    
}
