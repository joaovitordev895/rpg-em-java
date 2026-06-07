package Personagens;

//clase do protagonista//
public class Principal {

    //seus atributos//
    String nome;
    public int vida = 100;
    public int espada = 25;
    public int moeadas = 75;
    public char escolha;
    public char opcao;

    //seu construtor,que faz o jogador ter seu nome//
    public Principal(String nome) {
        this.nome = nome;
    }

    //suas ações//

    //a função atacar serve para tirar a vida do bixo e ganhar o jogo utilizando a espada//
    public void atacar(Inimigo inimigo) {
         inimigo.vidadobixo -= espada;
    }
    //mostra o status do jogador//
    public void mostrarStatus() {
        System.out.println("Vida: " + vida);
        System.out.println("Moedas: " + moeadas);
        System.out.println("Espada: " + espada);
    }
}
