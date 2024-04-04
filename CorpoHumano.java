package Projeto_Poo;

public class CorpoHumano {
    private String nome;
    private int idade;
    private String genero;


public CorpoHumano(String nome, int idade, String genero ) {
    this.nome = nome;
    this.idade = idade;
    this.genero = genero;



}

public String getNome(){
    return nome;
}

public int getIdade(){
    return idade;
}

public String getGenero(){
    return genero;
}

// setter
public void setNome(String nome) {
    this.nome = nome;
}

public void setIdade(int idade) {
    this.idade = idade;
}

public void setGenero(String genero) {
    this.genero = genero;
}


public class Main {
    public static void main(String [] args){
        CorpoHumano pessoa = new CorpoHumano("Paulo",22,"Masculino");

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: "+ pessoa.getIdade());
        System.out.println("Genero: " + pessoa.getGenero());

        pessoa.setNome("Julia Francine");
        pessoa.setIdade(18);
        pessoa.setGenero("Feminino");

        System.out.println("\nInformações atualizadas:");
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Gênero: " + pessoa.getGenero());
        }
    }
}