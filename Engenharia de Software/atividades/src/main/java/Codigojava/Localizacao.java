package Codigojava;

public class Localizacao {
    private String nomedoEndereco;
    private String cep;
    private Empresa empresa;

    public String getNomedoEndereco() {
        return nomedoEndereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Localizacao() {}

    public void setNomedoEndereco(String nomedoEndereco) {
        this.nomedoEndereco = nomedoEndereco;
    }
}
