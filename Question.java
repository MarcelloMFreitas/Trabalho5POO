package com.domain.quiz;

public class Question {
    private String question;
    private String answer;
    private String[] alternatives;

    public Question(String question, String answer, String[] alternatives) {
        this.question = question;
        this.answer = answer;
        this.alternatives = alternatives;
    }

    public String[] getAlternatives() {
        return alternatives;
    }

    public void setAlternatives(String[] alternatives) {
        this.alternatives = alternatives;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
    
}