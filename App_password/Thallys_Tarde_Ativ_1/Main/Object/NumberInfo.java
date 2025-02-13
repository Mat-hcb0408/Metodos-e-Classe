package Thallys_Tarde_Ativ_1.Main.Object;

public class NumberInfo {

    public int number;
    public String result;

    public NumberInfo(int number) {
        this.number = number;
        this.result = PositivoNegativo(number); // Determina o resultado no momento da criação
    }

    // Método para calcular se o número é positivo, negativo ou nulo
    public String PositivoNegativo(int number) {
        if (number > 0) {
            return "O numero é Positivo: ";
        } else if (number < 0) {
            return "O numero é Negativo: ";
        } else {
            return "O numero é Nulo: ";
        }
    }

    // Getters e Setters
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
        this.result = PositivoNegativo(number); // Atualiza o resultado se o número for alterado
    }

    public String getResult() {
        return result;
    }

    @Override
    public String toString() {
        return result + number;
    }
}