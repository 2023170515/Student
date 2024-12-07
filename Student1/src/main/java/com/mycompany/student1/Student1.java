/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */




package com.mycompany.student1;

import java.util.ArrayList;
import java.util.List;

public class Student1 extends person {
     public static void main(String[] args) {
    }

    private List<String> examHistory;

    public Student1(int id, String name, String email, String password, String role) {
        super(id, name, email, password, role);
        this.examHistory = new ArrayList<>();
    }

    public void startExam(Exam exam) {
        System.out.println("Starting the exam: " + exam.getTitle());
        System.out.println("Category: " + exam.getCategory());
        System.out.println("Duration: " + exam.getDuration() + " minutes");
        System.out.println("Total Marks: " + exam.getTotalMarks());

        // محاكاة البدء
        System.out.println("\nExam is now in progress...");

        // إضافة الامتحان إلى السجل بعد الانتهاء
        examHistory.add("Exam: " + exam.getTitle() + " - Completed");
        System.out.println("Exam completed and recorded in history.");
    }

    public void viewResults() {
        System.out.println("Results for " + getName() + ":");
        for (String result : examHistory) {
            System.out.println("Exam Result: " + result);
        }
    }

    public void trackProgress() {
        System.out.println(getName() + " has completed " + examHistory.size() + " exams.");
    }

    public void addResult(String result) {
        examHistory.add(result);
        System.out.println("Result added: " + result);
    }

    public List<String> getExamHistory() {
        return examHistory;
    }

    public void setExamHistory(List<String> examHistory) {
        this.examHistory = examHistory;
    }
}
