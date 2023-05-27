package sp.senai.br.vetorlopp;

import java.util.Arrays;
import java.util.Scanner;


public class vetorLoop 
{
    
     public static void main(String[] args) 
    {
        
        Scanner teclado = new Scanner(System.in);   
              
        int numbers;
        
        double mediana= 0;
        double soma = 0;
        double media = 0;
        double maior = 0;
        double menor = 0;

        
        System.out.println("Digite a quantidade de numereros a serem digitados");
        
        numbers = teclado.nextInt();
        
        double[] numberT  = new double[numbers];
        
        for(int i = 0; i < numbers; i++)
        {
            System.out.println("Digite o 1 numero");  
            numberT[i] = teclado.nextDouble();
            
            if(numberT[i] > maior)
            {
                maior = numberT[i];
            }
            
            if(numberT[i] < menor)
            {
                menor = numberT[i];
            }
            
            soma += numberT[i];
            
            
            media = soma / numbers;
            
            
            
        }
        
        Median median = new Median();
        mediana = median.evaluate(numberT);
        
        
        System.out.println(mediana);
        
    
        System.exit(0);
    }
}
