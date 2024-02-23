public class Colaborador {
    int edv; //utilização de long , para colocar numeros maiores do que com int.ou seja 8bits , pq int e so 4 bits
    String nome;
    String cargo;

    //definição do contrutor
    Colaborador(){

    }

    //criação do construtor
    //parametros que são esperados do metodo construtor
    Colaborador (String nome){
        this.nome=nome; //this ele faz referenciação
    }

    //criação do construtor comn parametros alt + insert
    public Colaborador(int edv, String nome) {
        this.edv = edv;
        this.nome = nome;
    }

    public Colaborador(int edv, String nome, String cargo) {
        this.edv = edv;
        this.nome = nome;
        this.cargo = cargo;
    }
    // para mostrar que o obejto que ja existe e que ele e da classe colaborador
    @Override
    public String toString(){
        return String.format("Colaborador %s com edv %d tem o cargo de %s",this.nome,this.edv ,this.cargo);
    }
}
