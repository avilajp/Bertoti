package Codigojava;

import java.util.List;

public class Empresa {
    private String nome;
    private String ramo;

    public Empresa(String nome, String ramo) {
        this.nome = nome;
        this.ramo = ramo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRamo() {
        return ramo;
    }

    public void setRamo(String ramo) {
        this.ramo = ramo;
    }

    public static void main(String[] args) {

        Empresa empresa = new Empresa("Altave", "aeronave");
        System.out.println("Nome da empresa: " + empresa.getNome());
        System.out.println("Área de atuação da empresa: " + empresa.getRamo());

        System.out.println();

        System.out.println("Cadastrando local da empresa:");

        Localizacao local = new Localizacao();
        local.setCep("12231800");
        local.setNomedoEndereco("rua marco antonio dos santos");
        local.setEmpresa(new Empresa("Autaza", "automobilistico"));

        System.out.println("Cep da empresa: " + local.getCep());
        System.out.println("Nome da empresa: " + local.getEmpresa().getNome());
        System.out.println("Nome do endereço: " + local.getNomedoEndereco());

        System.out.println();

        System.out.println("***Cadastrando uma equipe em uma empresa***");

        Equipe equipe = new Equipe();
        equipe.cadastrarFuncionario(new Funcionario("Alberto"));
        equipe.cadastrarFuncionario(new Funcionario("Luiz"));
        equipe.cadastrarFuncionario(new Funcionario("Pedro"));
        equipe.cadastrarFuncionario(new Funcionario("Alonso"));

        System.out.println("Lista de funcionarios da empresa");
        List<Funcionario> funcionarios = equipe.getFuncionarios();
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario.getNome());
        }
    }
}
