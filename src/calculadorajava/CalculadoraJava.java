/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorajava;
import java.util.Scanner;
/**
 *
 * @author papac
 */
public class CalculadoraJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner (System.in);
        System.out.print("Digite o primeiro número: ");
        double num1 = teclado.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = teclado.nextDouble();
        
        //SELEÇÃO DE OPERAÇAO DESEJADA PELO USUARIO
        
        
        
        double resultado = 0;
        char operacao; 
           
        
            do{
                
                System.out.print("Digite a operação desejada (Mais (+), Menos (-), Vezes (*), Dividir (/))");
                 operacao = teclado.next().charAt(0);

                //LOGICA DA ESCOLHA DE OPERAÇÃO
                switch(operacao){

                    case '+':
                        resultado = num1 + num2;
                        System.out.println(num1 +" " +operacao+" "+num2+"= "+resultado);
                        break;
                    case '-':
                        resultado = num1 - num2;
                        System.out.println(num1 +" " +operacao+" "+num2+"= "+resultado);
                        break;
                    case '*':
                        resultado = num1 * num2;
                        System.out.println(num1 +" " +operacao+" "+num2+"= "+resultado);
                        break;
                    case '/':
                        if (num2 != 0) {
                        resultado = num1 / num2;
                        System.out.println(num1 + " / " + num2 + " = " + resultado);
                    } else {
                        System.out.println("Não é possível dividir por zero!");
                    }
                        break;
                    case 'S':
                    case 's':
                    System.out.println("Encerrando...");
                    break;    

                    default:
                        System.out.println("OPERAÇÃO INVALIDA");
                        
                        
                
                }

                  
            }while (operacao != 'S' && operacao != 's'); 
            teclado.close();
    }
    
}
