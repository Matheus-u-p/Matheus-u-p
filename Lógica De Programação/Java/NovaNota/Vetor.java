//Camilli Vitória Salvaro Honorato
//Matheus Uggioni Possamai
//2-53
//Matheus: https://drive.google.com/drive/folders/1zgywiI6SWrg60CdZLMNMSJLOWxGBm6sJ?usp=sharing
//Camilli: https://drive.google.com/drive/folders/1FBs-dmqw8QHQlaW0SSlkvnMDDwvHI6Ho?usp=drive_link

import javax.swing.JOptionPane; //Importação do Pop Up

public class Vetor {
      public static void main(String[] args) {
      String[] valores = new String[4]; //Declaração de um vetor

      for (int i = 0; i < valores.length; i++){ //Declara a variavel i. Enquanto i for menor que valores.length. Icrementa mais 1 a i. Então faça..
        valores[i] = JOptionPane.showInputDialog("Digite o valor " + (i + 1) + ":"); //Mensagem que mostra em qual linha o usuario está armazenando o que escreve
      }
      StringBuilder mensagem = new StringBuilder("Valores digitados:\n"); //Mensagem para informar que vai ser mostrado os numeros em que o usuario digitou

      for (int i = 0; i < valores.length; i++){//Declara a variavel i. Enquanto i for menor que valores.length. Icrementa mais 1 a i. Então faça..
      mensagem.append("Valor ").append(i + 1).append(": ").append(valores[i]).append("\n"); //Variavel que mostra tudo o que o usuario digitou em cada linha
      }
      JOptionPane.showMessageDialog(null, mensagem.toString(), "Valores Digitados",
      JOptionPane.INFORMATION_MESSAGE); //Mensagem que mostra o que está dentro da variavel mensagem.toString() e o titulo do pop up Valores Digitados
  } 
}
