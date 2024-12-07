/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.student1;


/**
 *
 * @author Administrator
 */




import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exam {

    private int ID;
    private String Title;
    private String Category;
    private double Duration;
    private int TotalMarks;
    private List<Question> questions;


    public Exam(int ID, String Title, String Category, double Duration, int TotalMarks) {
        this.ID = ID;
        this.Title = Title;
        this.Category = Category;
        this.Duration = Duration;
        this.TotalMarks = TotalMarks;
        this.questions = new ArrayList<>();
    }
    
     public String getTitle() {
        return Title;
    }

    public String getCategory() {
        return Category;
    }

    public double getDuration() {
        return Duration;
    }

    public int getTotalMarks() {
        return TotalMarks;
    }

    public void submitExam() {
        System.out.println("If you want to submit the exam, please enter 1:");
        Scanner s = new Scanner(System.in);
        int submit = s.nextInt();
        if (submit == 1) {
            System.out.println("Exam submitted successfully!");
        } else {
            System.out.println("Invalid choice.");
        }
    }

    public void addQuestion() {
        System.out.print("Enter the new question: ");
        Scanner input = new Scanner(System.in);
        String questionText = input.nextLine();
        Question newQuestion = new Question(questionText);
        questions.add(newQuestion);
        System.out.println("Question added successfully!");
    }


    public void removeQuestion() {
        Scanner input = new Scanner(System.in);
        if (questions.isEmpty()) {
            System.out.println("No questions available to remove.");
            return;
        }

        System.out.println("Available Questions:");
        for (int i = 0; i < questions.size(); i++) {
            System.out.println((i + 1) + ". " + questions.get(i).getText());
        }

        System.out.print("if you want to remove questions please enter 1 : ");
        System.out.println("\nif you do not want to remove a question please enter 0 : ");

        Scanner in = new Scanner(System.in);
        int n;
        n = in.nextInt();

        if (n==1) {
            System.out.print("Enter the number of the question to remove: ");
            int questionIndex = input.nextInt() - 1;

            if (questionIndex >= 0 && questionIndex < questions.size()) {
                questions.remove(questionIndex);
                System.out.println("Question removed successfully!");
            } else {
                System.out.println("Invalid question number. Please try again.");
            }
        }

        else if (n == 0) {
            System.out.println("Thank You!");

        }
        else
            System.out.println("Invalid Number!");


    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }


    public static class Question {
        private String text;

        public Question(String text) {
            this.text = text;
        }

        public String getText() {
            return text;
        }

        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null || getClass() != obj.getClass())
                return false;
            Question question = (Question) obj;
            return text.equals(question.text);
        }
    }
}

