package Files;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuizApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		List<Question> li = new ArrayList<Question>();

		Question q1 = new Question("What is the capital of India?", 
		    new String[]{"Delhi", "Mumbai", "Pune", "Nashik"}, 1); 
		li.add(q1);

		Question q2 = new Question("Which planet is known as the Red Planet?", 
		    new String[]{"Earth", "Mars", "Jupiter", "Venus"}, 2); 
		li.add(q2);

		Question q3 = new Question("Who wrote 'Ramayana'?", 
		    new String[]{"Valmiki", "Tulsidas", "Kalidas", "Veda Vyasa"}, 1); 
		li.add(q3);

		Question q4 = new Question("Which gas is essential for humans to breathe?", 
		    new String[]{"Carbon Dioxide", "Oxygen", "Nitrogen", "Hydrogen"}, 2); 
		li.add(q4);

		Question q5 = new Question("Which is the largest ocean in the world?", 
		    new String[]{"Indian Ocean", "Atlantic Ocean", "Pacific Ocean", "Arctic Ocean"}, 3); 
		li.add(q5);

		Question q6 = new Question("Who was the first Prime Minister of India?", 
		    new String[]{"Mahatma Gandhi", "Jawaharlal Nehru", "Sardar Patel", "Subhash Chandra Bose"}, 2); 
		li.add(q6);

		Question q7 = new Question("What is the national currency of Japan?", 
		    new String[]{"Yen", "Won", "Dollar", "Rupee"}, 1); 
		li.add(q7);

		Question q8 = new Question("Which is the smallest prime number?", 
		    new String[]{"1", "2", "3", "5"}, 2); 
		li.add(q8);

		Question q9 = new Question("In which year did India gain independence?", 
		    new String[]{"1945", "1946", "1947", "1950"}, 3); 
		li.add(q9);

		Question q10 = new Question("Which is the largest mammal on Earth?", 
		    new String[]{"Elephant", "Blue Whale", "Giraffe", "Hippopotamus"}, 2); 
		li.add(q10);
		
		
		int score=0;
		
		for(Question q:li) {
			System.out.println(q.question);
			for(int i=0;i<q.opt.length;i++) {
				System.out.println((i+1)+ ". "+q.opt[i]);
			}
			
			System.out.println("Enter Your Answer (1-4) :");
			int ans=sc.nextInt();
			
			if(ans==q.correctOpt) {
				score++;
			}
		}
		
		System.out.println("Quiz Completed.....");
		System.out.println("Your Score: "+score+" / "+li.size());
		double per=(score*100)/li.size();
		System.out.println("Percentage :"+per);
		
	}

}
