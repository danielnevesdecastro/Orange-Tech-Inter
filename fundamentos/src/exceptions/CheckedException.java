package exceptions;

import javax.swing.*;
import java.io.*;

public class CheckedException {
    public static void main(String[] args)  {
        String nomeDoArquivo = "Spring.txt";//arquivo não existe ,exception

        try {
            imprimirArquivoNoConcole(nomeDoArquivo);
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog
            (null,"Nome do arquivo Errado!"+ e.getCause());
            //e.printStackTrace();
        }catch (IOException e){//erro +  genérico
            JOptionPane.showMessageDialog
            (null,"Erro Inesperado!, Entre em contato com o Suporte"
                    + e.getCause());
            e.printStackTrace();//exibi a exception
        }finally {
            System.out.println("Chegou no Finally");
        }

        System.out.println("Independente de Exception , o programa continua");
    }

    public static void imprimirArquivoNoConcole(String nomeArquivo) throws IOException {
        File file = new File(nomeArquivo);

        BufferedReader br = new BufferedReader(new FileReader(file.getName()));//armazenando em buffer
        String line = br.readLine();//ler linha por linha

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        do {
            bw.write(line);
            bw.newLine();
            line = br.readLine();
        } while (line != null);
        bw.flush();
        br.close();//fechando buffer
    }

}
