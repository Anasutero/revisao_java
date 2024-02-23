public class Treinamento {
    String nome;
    double preco;//precisao pois e valor real
    boolean exclusivoParaGestores;
    Instrutor instrutor;

    public Treinamento() {
        this.nome="Sem nome";
        this.preco=10;
        this.exclusivoParaGestores=true;

    }

    public Treinamento(String nome, double preco, boolean exclusivoParaGestores,Instrutor instrutor) {
        this.nome = nome;
        this.preco = preco;
        this.exclusivoParaGestores = exclusivoParaGestores;
        this.instrutor= instrutor;

    }

    @Override
    public String toString() {
        return  String.format("O treinamneto de  %s está com o valor de  %.2f ele é  exclusivo para gestores = %b  com o instrutor %s"
                ,this.nome,this.preco,this.exclusivoParaGestores,this.instrutor.nome);
    }
}
