package AnaliseDeValorLimite;

public class Contratacao {

    public String contratacao(int idade) {
        if (idade >= 0 && idade <= 15) {
            return "Não contrata";
        } else if (idade >= 16 && idade <= 17) {
            return "Contrata como aprendiz";
        } else if (idade >= 18 && idade <= 100) {
            return "Contrata como CLT";
        } else {
            return "Idade inválida";
        }
    }
}
