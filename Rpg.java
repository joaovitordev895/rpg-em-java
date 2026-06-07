 import Personagens.Principal;
import Personagens.Inimigo;
import Personagens.Vendendor;

void main() {
    Scanner sc = new Scanner(System.in);

    //digitar o nome do protagonista//
    System.out.println("Digite seu nome: ");
    String nome = sc.nextLine();

    //os objetos que sao os personagens//
    Principal principal = new Principal(nome);
    Inimigo inimigo = new Inimigo();
    Vendendor vendendor = new Vendendor();

    //as opções de ações do jogo//
    while (principal.vida > 0) {
        System.out.println("===========================j");
        System.out.println(nome + ",voce tem 4 opções");
        System.out.println("===========================j");
        System.out.println("1-lutar com o bixo");
        System.out.println("2-comprar item ");
        System.out.println("3-mostra status");
        System.out.println("4-sair");
        principal.opcao = sc.next().charAt(0);

//as ações que cada opção faz//

//1-ação voce luta com o bixo//
//2-ação voce compra itens com o vendendor//
//3-ação voce vê os status do protagonista,onde tem sua espada,quantas moeadas e sua vida//
//4-ação voce encerra o progama
        if (principal.opcao == '1') {
            System.out.println("voce esta bringando com o bixo @!33$!@321133!!@***");
            principal.atacar(inimigo);
            inimigo.atacar(principal);
            System.out.println("o resultado da batalha:");
            System.out.println(principal.vida + " de vida do " + nome);
            System.out.println(inimigo.vidadobixo + " de vida do bixo");
        }
        else if (principal.opcao == '2') {
                System.out.println("voce quer melhorar a sua espada ou poçao de cura? ");
                System.out.println("1 - Espada");
                System.out.println("2 - Poção");

                principal.escolha = sc.next().charAt(0);

                vendendor.escolheropacao1(principal);
                vendendor.escolheropcao2(principal);

        }
        else if (principal.opcao == '3') {
            principal.mostrarStatus();
        }

        if (inimigo.vidadobixo <= 0) {
            System.out.println("O bixo morreu!!!!!!");
            System.out.println("Você ganhou!!!!!!!!!!");
            break;
        }
    }

}
