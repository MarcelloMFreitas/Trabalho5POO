package com.projeto05.quiz;

import java.util.ArrayList;

public class Quiz {

    private static int testsCount = 0;
    private static double testsGradeSum = 0.0;
    private static double lastGrade = 0.0;
    private static ArrayList<Question> test;
    private static ArrayList<Users> user;

    public static ArrayList<Users> getUser() {
        if (user == null) {
            user = new ArrayList();
            Users u0 = new Users("teste", 0, 0, 0);
            Users u1 = new Users("teste2", 0, 0, 0);
            user.add(u0);
            user.add(u1);
        }
        return user;
    }

    public static ArrayList<Question> getTest() {
        if (test == null) {
            test = new ArrayList<>();
            Question q1 = new Question("1+1?", "2", new String[]{"0", "2", "1"});
            test.add(q1);
            Question q2 = new Question("1+2?", "3", new String[]{"3", "2", "1"});
            test.add(q2);
            Question q3 = new Question("3+4?", "7", new String[]{"7", "1", "12"});
            test.add(q3);
            Question q4 = new Question("2+3?", "5", new String[]{"3", "2", "5"});
            test.add(q4);
        }
        return test;
    }

    public static void setUser(String nome) {

        Users u = new Users(nome, 0, 0, 0);
        user.add(u);
    }

    public static void validateTest(String userAnswers[], String userName) {
        int count = 0;
        for (Users u : user) {
            if (u.getName().equals(userName)) {
                for (int i = 0; i < test.size(); i++) {
                    if (test.get(i).getAnswer().equals(userAnswers[i])) {
                        count++;
                    }
                }
                double grade = (double) count / (double) test.size();
                u.setUserLastGrade(grade);
                u.setUserTestsGradeSum(grade);
                u.setUserTestsCount(u.getUserTestsCount() + 1);
            }
        }
    }

    public static double getLastGrade() {
        return Quiz.lastGrade;
    }

    public static double getGradeAverage() {
        return Quiz.testsGradeSum / (double) Quiz.testsCount;
    }
}
