package com.example.library;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "books")
public class Book {
	@Id

	private String bookId;
    private String title;
    private String author;
    private double price;
    private boolean available;
    private String publisherId; 
    private String memberId; 
    private String dueDate;
    private String returnDate;
}
