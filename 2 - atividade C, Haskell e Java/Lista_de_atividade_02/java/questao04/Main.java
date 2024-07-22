package Lista_de_atividade_02.java.questao04;

import java.util.ArrayList;  
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        final Integer QUANTIDADEDEQUESTOES = 10;
        final Integer QUANTIDADEALUNOS = 10;

        ArrayList<Integer> gabarito = new ArrayList<>();
        HashMap<String, Integer> alunos = new HashMap<String, Integer>();

        try (Scanner scan = new Scanner(System.in)) {

            for (int i = 1; i <= QUANTIDADEDEQUESTOES; i++) {
                System.out.println("Qual é o gabarito da " + i + "° alternativa");
                gabarito.add(scan.nextInt());
            }

            for (int i = 0; i < QUANTIDADEALUNOS; i++) {
                Integer nota = 0;
                System.out.println("Informe seu nome:");
                String nome = scan.next();
                for (int j = 1; j <= 10; j++) {
                    System.out.println("Informe o gabarito da " + j + "° questão:");
                    Integer escolha = scan.nextInt();
                    if (escolha.equals(gabarito.get(j - 1))) {
                        nota++;
                    }
                }
                alunos.put(nome, nota);
            }
            
            /*Lista alfabetica*/ 
            List<Map.Entry<String, Integer>> listaDeAlunos = new ArrayList<>(alunos.entrySet());
            Collections.sort(listaDeAlunos, Comparator.comparing(Map.Entry::getKey));
            System.out.println("Lista dos alunos em ordem alfabetica:");
            for (Map.Entry<String, Integer> entrada : listaDeAlunos) {
                System.out.println("Aluno: " + entrada.getKey() + ", Nota: " + entrada.getValue());
            }

            /*Exibir as duas melhores notas*/
            List<Map.Entry<String, Integer>> duasMelhoresNotas = listaDeAlunos.stream()
                    .sorted(Comparator.comparing(Map.Entry::getValue, Comparator.reverseOrder()))
                    .limit(2)
                    .collect(Collectors.toList());
            System.out.println("\nDuas melhores notas:");
            for (Map.Entry<String, Integer> entrada : duasMelhoresNotas) {
                System.out.println("Aluno: " + entrada.getKey() + ", Nota: " + entrada.getValue());
            }

            /*Exibir as duas piores notas*/
            List<Map.Entry<String, Integer>> duasPioresNotas = listaDeAlunos.stream()
                    .sorted(Comparator.comparing(Map.Entry::getValue))
                    .limit(2)
                    .collect(Collectors.toList());
            System.out.println("\nDuas piores notas:");
            for (Map.Entry<String, Integer> entrada : duasPioresNotas) {
                System.out.println("Aluno: " + entrada.getKey() + ", Nota: " + entrada.getValue());
            }

            /*Alunos com mais de 50% de acerto*/
            List<String> alunosComMaisDaMetade = new ArrayList<>();
            for (Map.Entry<String, Integer> entry : alunos.entrySet()) {
                if (entry.getValue() > QUANTIDADEDEQUESTOES / 2) 
                    alunosComMaisDaMetade.add(entry.getKey());
            }
            System.out.println("\nAlunos com mais da metade das questões certas:");
            for (String aluno : alunosComMaisDaMetade) {
                System.out.println("Aluno: " + aluno + ", Nota: " + alunos.get(aluno));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}