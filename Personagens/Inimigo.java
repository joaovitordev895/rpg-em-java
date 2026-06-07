package Personagens;

//classe do bixo que luta contra o protagonista//
public class Inimigo {

   //seus atributos//
   public int vidadobixo = 120;
   public int dano = 25;

   //suas ações//

    //a função 'atacar' serve para o bixo dar dano no protagonista//
    public void atacar(Principal principal){
        principal.vida -= dano;
    }

}

