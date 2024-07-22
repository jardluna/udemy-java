package application;

import java.time.LocalDateTime;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) {
		
		/*
		 * NÃO HÁ NECESSIDADE DE USAR O MÉTODO ABAIXO,
		 * POIS FOI CRIADA UMA CONSTANTE NA CLASSE POST (MEMBRO ESTÁTICO).
		 * DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		 */
		
		Comment c1 = new Comment("Have a nice trip");
		Comment c2 = new Comment("Wow that's awesome!");
		Post p1 = new Post(
				LocalDateTime.parse("21/06/2018 13:05:44", Post.dtf), 
				"Traveling to New Zealing", 
				"I'm going to visit this wonderful contry!", 
				12);
		p1.addComment(c1);
		p1.addComment(c2);
		System.out.println(p1);
		
		System.out.println();
		
		Comment c3 = new Comment("Good night");
		Comment c4 = new Comment("May the force be with you");
		Post p2 = new Post(
				LocalDateTime.parse("28/07/2018 23:14:19", Post.dtf),
				"Good night guys!",
				"See you tomorrow",
				5);
		p2.addComment(c3);
		p2.addComment(c4);
		System.out.println(p2);
		
		
		
		
		
	}
}
