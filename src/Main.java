public class Main {
    public static void main(String[] args){

//        //Instanciando o objeto
//        //nao e uma boa classe acessar os obejtos diretamente
//        Colaborador maria = new Colaborador();//metodo construtor e esse e o contrutor padrão
//        maria.nome = "Maria";
//        maria.cargo = "Técnica de Qualidade";
//        maria.edv = 928976454;
//        System.out.println(maria);
//
//        Colaborador jose = new Colaborador("jose");
//        System.out.println(jose);
//
//        Colaborador antonio = new Colaborador(9865320, "Antonio");
//        System.out.println(antonio);
//
//        Colaborador ana = new Colaborador( 92903532,"Ana","aprendiz");
//        System.out.println(ana);

       // criação de uma nova classe
        Treinamento treinamento = new Treinamento("Power BI",900, false,new Instrutor("Leonardo"));
        System.out.println(treinamento);


    }
}
