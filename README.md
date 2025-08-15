Console-Based Quiz Application
Objective

Create a console-based quiz application in Java that asks the user multiple-choice questions, accepts their answers, and displays the final score.

Tools

Java (JDK 8 or later)

Console (Command Prompt / Terminal)

Deliverables

A Java class that:

Stores quiz questions and multiple-choice options

Accepts user answers

Calculates and displays the final score

Hints / Mini Guide

Store Questions

Use a List or ArrayList to store question text, options, and the correct answer.

You can create a Question class with:

String questionText;
String[] options;
int correctOption;


Display Questions

Use a loop to display each question and its options to the user.

Accept User Input

Use Scanner to take user input from the console.

Check Answers & Score

Compare user input with the correct answer index.

Maintain a score variable to count correct answers.

Display Results

After all questions, show the total score and percentage.
