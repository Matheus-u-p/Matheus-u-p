//Camilli Vitória Salvaro Honorato
//Matheus Uggioni Possamai
//2-53
//Matheus: https://drive.google.com/drive/folders/1zgywiI6SWrg60CdZLMNMSJLOWxGBm6sJ?usp=sharing
//Camilli: https://drive.google.com/drive/folders/1FBs-dmqw8QHQlaW0SSlkvnMDDwvHI6Ho?usp=drive_link

import javax.swing.JOptionPane; //Importação do Pop Up

public class DiferencaParaCem {
        public static void main(String[] args) {
            int continuar = JOptionPane.YES_OPTION; //Variavel recebe a opção sim
            while(continuar == JOptionPane.YES_OPTION){ //Enquanto continuar for igual opção sim, entao...
              String inputLinhas = JOptionPane.showInputDialog("Digite um número:"); //Variavel que recebe o valor que o usuario informar
              int numero = Integer.parseInt(inputLinhas); //Converte a variavel string para uma variavel int
              int diferenca = 100 - numero; //Faz a conta para saber quantos numeros faltam para chegar a 100
              String mensagem = "Falta " +diferenca + " para chegar a 100"; //Variavel com mensagem que mostra quantos numeros faltam para chegar a 100
              JOptionPane.showMessageDialog(null,mensagem); //Mostra o que está escrito dentro da variavel mensagem
              continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Continuar", JOptionPane.YES_NO_OPTION); //Pop up com resposta de sim ou não, se o usuario clicar em sim, o programa começa novamento, se não, ele para
            }
        }
}
