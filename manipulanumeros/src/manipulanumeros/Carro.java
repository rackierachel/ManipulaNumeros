
package manipulanumeros;


class Carro {

    static void calculaValorFinal() {
        
        double custo, custo_fab;
       System.out.println("Insira o custo de Fábrica: ");
       custo_fab = Manipulanumeros.ler.nextInt();
       
       custo = custo_fab+(custo_fab*0.28)+(custo_fab*0.45);
               
        System.out.println("Custo Ao consumidor: "+custo);
       
    }
    
}
