
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
       int n1 = 1 ;
       for (;30<n1; n1++){
               if(n1%2==1)
                   System.out.println("Impar: "+n1);
			System.out.println("Soma de impar: "+(n1+n1));
			n1 += (n1 / n1);
			System.out.println("Par: "+n1);
			System.out.println("Multiplicação de par: "+n1*n1);
    }

    }
} 



