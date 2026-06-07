package Personagens;

//a classe do vendendor serve para vender itens para o protagonista,como melhoria de sua espada para dar mais dano e poção de cura//
public class Vendendor {

    //seus atributos
    public int melhorarespada = 25;
    public int poçaodecura = 25;

    //suas ações//

    //se o jogador escolher a primeira opção,ele ira melhorar sua espada para dar mais dano,mas ira gastar moedas//
    public char escolheropacao1(Principal principal) {
        if (principal.escolha == '1') {
            System.out.println("voce escolheu melhorar a espada");
            principal.espada += melhorarespada;
            principal.moeadas -= melhorarespada;
            System.out.println();
            System.out.println("sua espada esta 25% mais afiada");
            System.out.println("dano da sua espada atual " + principal.espada + "%");

             if (principal.moeadas <= melhorarespada) {
                System.out.println("voce esta sem dinheiro");
                return principal.opcao;
            }
        }
        return principal.opcao;
    }
//se o jogador escolher a sugunda opção,ele ira aumentar sua vida com a poção de cura,mas ira gastar moedas//
    public char escolheropcao2(Principal principal) {
        if (principal.escolha == '2') {
            System.out.println("voce escolheu ter mais vida");
            principal.vida += poçaodecura;
            principal.moeadas -= poçaodecura;
            System.out.println();
            System.out.println("sua vida aumentou 25%");
            System.out.println("sua vida atual é " + principal.vida + "%");

            if (principal.moeadas <= poçaodecura) {
                System.out.println("voce esta sem dinheiro");

                return principal.opcao;
            }
        }
        return principal.opcao;
    }

}
