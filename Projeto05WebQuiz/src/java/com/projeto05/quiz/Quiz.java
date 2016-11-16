package com.projeto05.quiz;

import java.util.ArrayList;
import java.util.Collections;

public class Quiz {

    private static ArrayList<Question> teste;
    private static ArrayList<Users> user;

    public static ArrayList<Users> getUser() {
        if (user == null) {
            user = new ArrayList();
            Users u0 = new Users("Leonardo da Vinci", 0, 0, 0);
            Users u1 = new Users("Isaac Newton", 0, 0, 0);
            Users u2 = new Users("Charles Darwin", 0, 0, 0);
            Users u3 = new Users("Nikola Tesla", 0, 0, 0);
            Users u4 = new Users("Albert Einstein", 0, 0, 0);
            user.add(u0);
            user.add(u1);
            user.add(u2);
            user.add(u3);
            user.add(u4);
        }
        return user;
    }

    public static ArrayList<Question> getTeste() {
        if (teste == null) {
            teste = new ArrayList<>();
            Question q1 = new Question("1. Três caminhões transportam 200m³ de"
                    + " areia. Para transportar 1600m³ de areia, quantos "
                    + "caminhões iguais a esse seriam necessários?", "24", new String[]{"20", "24", "21"});
            teste.add(q1);
            Question q2 = new Question("2. A comida que restou para 3 náufragos "
                    + "seria suficiente para alimentá-los por 12 dias. Um deles "
                    + "resolveu saltar e tentar chegar em terra nadando. Com um "
                    + "náufrago a menos, qual será a duração dos alimentos?", "18", new String[]{"18", "20", "21"});
            teste.add(q2);
            Question q3 = new Question("3. Para atender todas as ligações feitas"
                    + " a uma empresa são utilizadas 3 telefonistas, atendendo "
                    + "cada uma delas, em média, a 125 ligações diárias. "
                    + "Aumentando-se para 5 o número de telefonistas, quantas "
                    + "ligações atenderá diariamente cada uma delas em média?", "75", new String[]{"75", "100", "120"});
            teste.add(q3);
            Question q4 = new Question("4. Um pintor, trabalhando 8 horas por "
                    + "dia, durante 10 dias, pinta 7.500 telhas. Quantas horas "
                    + "por dia deve trabalhar esse pintor para que ele possa "
                    + "pintar 6.000 telhas em 4 dias?", "16", new String[]{"18", "20", "16"});
            teste.add(q4);
            Question q5 = new Question("5. Dez guindastes móveis carregam 200 "
                    + "caixas num navio em 18 dias de 8 horas de trabalho. "
                    + "Quantas caixas serão carregadas em 15 dias, por 6 "
                    + "guindastes, trabalhando 6 horas por dia?", "7", new String[]{"75", "101", "120"});
            teste.add(q5);
            Question q6 = new Question("6. Em uma disputa de tiro, uma "
                    + "catapulta, operando durante 6 baterias de 15 minutos "
                    + "cada, lança 300 pedras. Quantas pedras lançará em 10 "
                    + "baterias de 12 minutos cada?", "400", new String[]{"300", "200", "400"});
            teste.add(q6);
            Question q7 = new Question("7. Com a velocidade de 75 Km/h, um "
                    + "ônibus faz um trajeto em 40 min. Devido a um "
                    + "congestionamento, esse ônibus fez o percurso de volta em "
                    + "50 min. Qual a velocidade média desse ônibus?", "60", new String[]{"60", "100", "70"});
            teste.add(q7);
            Question q8 = new Question("8. Uma tábua com 1,5 m de comprimento "
                    + "foi colocada na vertical em relação ao chão e projetou "
                    + "uma sombra de 53 cm. Qual seria a sombra projetada no "
                    + "mesmo instante por um poste que tem 10,5 m de altura?", "371", new String[]{"370", "280", "371"});
            teste.add(q8);
            Question q9 = new Question("9. Uma certa quantidade de suco foi "
                    + "colocado em latas de 2 litros cada uma, obtendo-se assim "
                    + "60 latas. Se fossem usadas latas de 3 litros, quantas "
                    + "latas seriam necessárias para colocar a mesma quantidade "
                    + "de suco?", "40", new String[]{"40", "41", "42"});
            teste.add(q9);
            Question q10 = new Question("10.Uma usina produz 500 litros de "
                    + "álcool com 6 000 kg de cana – de – açúcar. Determine "
                    + "quantos litros de álcool são produzidos com 15 000 kg de "
                    + "cana. ", "1250", new String[]{"3100", "2125", "1250"});
            teste.add(q10);
        }
        Collections.shuffle(teste);
        return teste;
    }

    public static void setUser(String nome) {
        Users u = new Users(nome, 0, 0, 0);
        user.add(u);
    }

    public static void validaTeste(String userAnswers[], String userName) {
        int count = 0;
        for (Users u : user) {
            if (u.getName().equals(userName)) {
                for (int i = 0; i < teste.size(); i++) {
                    if (teste.get(i).getResposta().equals(userAnswers[i])) {
                        count++;
                    }
                }
                double grade = (double) count / (double) teste.size();
                u.setUserLastGrade(grade);
                u.setUserTestsGradeSum(grade);
                u.setUserTestsCount(u.getUserTestsCount() + 1);

            }
        }
    }
}
