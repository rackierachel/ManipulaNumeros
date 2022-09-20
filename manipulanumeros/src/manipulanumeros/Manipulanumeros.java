
package manipulanumeros;

import java.util.Scanner;


public class Manipulanumeros {
    
    public static Scanner ler = new Scanner(System.in);
    public static int x,y;
    public static void main(String[] args) {

        int op;
        do{
            System.out.println("Menu de Operação com Números");
            System.out.println("1- Maior de 2 números");
            System.out.println("2- Ordenar valores em descrescente");
            System.out.println("3- Soma impares, Multiplica Pares");
            System.out.println("4- Troca Numero");
            System.out.println("5- Compara Numero");
            System.out.println("6- Calcular Media do Aluno");
            System.out.println("7- Calcular Custo de Carro");
            
            
            System.out.println("0- Sair");
            System.out.println("Selecione a opção pretendida");
            op = ler.nextInt();
            switch (op) {
                case 0: break;
                case 1:
                    leValores("Insira um valor","Insira outro valor");
                    MaiorNumero.maior2(x,y);
                    break;
                case 2: 
                    do{
                       le1Valor("Insira um valor: ");
                    }while(x<=0);
                        NumeroDecrescente.ordenaDecrescente(x);
                    break;
                case 3: somaImparesMultiplicaPares(); 
                break;
                case 4: leValores("Insira um valor","Insira outro valor");
                TrocaNumero.trocaValoresEntreVariaveis(x,y);
                break;
                case 5: leValores("Insira um valor","Insira outro valor");
                ComparaNumero.comparar2Valores(x,y);
                break;
                case 6: 
                    MediaAluno.registaNotas();
                    break;
                case 7: 
                    Carro.calculaValorFinal();
                    break;
                case 8: 
                    SaldoMedio.valorCredito();
                default: System.out.println("Selecione a opção válida");
            }
       
        }while (op!=0);
        
   }

    private static void leValores(String s1, String s2) {
        System.out.println(s1);
        x = ler.nextInt();
        System.out.println(s2);
        y = ler.nextInt();
        
       
    }

    private static void le1Valor(String s1) {
        System.out.println(s1);
        x = ler.nextInt();
        
    }

    private static void somaImparesMultiplicaPares() { 
        int i;
        long par = 0;
        int impar = 0;
        
                
        for ( i = 0; i < 30; i++ ){
            if (i%2 == 0){
                if (i>2){
                par = par*i;
                }
            else{
            par = i;
            }
        }
        
        else{
                impar = impar+i;
                }
        
        }
        System.out.println("O valor da soma dos números impares é "+impar);
        System.out.println("A multiplicação dos valores pares é "+ par);
        } 
} 



