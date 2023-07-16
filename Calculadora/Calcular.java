package Calculadora;

import java.util.Scanner;

public class Calcular {

    private int num1;
    private int num2;
    public  int opcao;

    public void bemVindo() {
        System.out.println("------------------CALCULADORA-------------------");
    }
    public void tipoCalculo() {
        Scanner op = new Scanner(System.in);
            System.out.println("\n * ---> QUAL CALCULO DESEJAR REALIZAR ? \n");
            System.out.println("<---( DIGITE )---> [1] PARA SOMAR, [2] PARA SUBTRAIR, [3] PARA MULTIPLICAR, [4] PARA DIVIDIR )---)");
            opcao  = op.nextInt();
             while (opcao < 1 || opcao > 4) {
                 erroRepeat();
                  tipoCalculo();
             }
    }
    public void erroRepeat() {
         System.out.println("# ERRO ! DE DIGITO (--> " + this.opcao + " <--)  ESCOLHA APENAS \n");
         System.out.println("--> [1] para SOMA \n--> [2] para SUBTRACAO \n--> [3] para MULTIPLICACAO \n--> [4] para DIVIDIR ");
    }
    public void tipoOperacao() {
        switch (this.opcao) {
            case 1:
                System.out.println("- - - - - - - - - - - - ");
                System.out.println(" TIPO OPERAÇÃO : SOMA ");
                System.out.println("- - - - - - - - - - - - ");
                break;
            case 2:
                System.out.println("- - - - - - - - - - - - - - -  ");
                System.out.println(" TIPO OPERAÇÃO : SUBTRACAO ");
                System.out.println("- - - - - - - - - - - - - - -  ");
                break;
            case 3:
                System.out.println("- - - - - - - - - - - - - - - - - - - -");
                System.out.println(" TIPO OPERAÇÃO : MULTIPLICACAO ");
                System.out.println("- - - - - - - - - - - - - - - - - - - -");
                break;
            case 4:
                System.out.println("- - - - - - - - - - - - - ");
                System.out.println(" TIPO OPERAÇÃO : DIVIDIR ");
                System.out.println("- - - - - - - - - - - - - ");
                break;
        }
    }
    public void entradaDados() {
        Scanner d = new Scanner(System.in);
        System.out.println("--------------------------");
        System.out.println(" DIGITE PRIMEIRO VALOR ");
        setNum1(d.nextInt());
        System.out.println(" DIGITE SEGUNDO VALOR ");
        setNum2(d.nextInt());
        System.out.println("--------------------------");
      }

    public void resultado() {
        switch (this.opcao) {
            case 1:
                System.out.println("[------------RESULTADO--------------- ]");
                System.out.println("\n SOMA = " + soma());
                break;
            case 2:
                System.out.println("[-------------RESULTADO--------------- ]");
                System.out.println("\n SUBTRACAO = " + subtracao());
                break;
            case 3:
                System.out.println("[------------RESULTADO--------------- ]");
                System.out.println("\n MULTIPLICACAO  = " + multiplicar());
                break;
            case 4:
                System.out.println("[------------RESULTADO--------------- ]");
                System.out.println("\n--> DIVISAO = " + dividir());
                break;
        }

    }
    public void obrigadoFinal() {
        System.out.println("\n\nOBRIGADO POR USA NOSSA CALCULADORA !!!");

    }
    public int getNum1() {
            return num1;
        }

        public int getNum2() {
            return num2;
        }

        public void setNum2(int num2) {
            this.num2 = num2;
        }

        public void setNum1(int num1) {
            this.num1 = num1;
    }

    public int soma() {
        return this.getNum1() + this.getNum2();
    }

    public int subtracao() {
        return getNum1() - getNum2();
    }

    public int multiplicar() {
        return this.getNum1() * this.getNum2();
    }

    public int dividir() {
        return this.getNum1()  / this.getNum2();
    }

}