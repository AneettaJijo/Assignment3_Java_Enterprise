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
@AllArgsConstructor
@ToString
@NoArgsConstructor
@Document(collection="publishers")
public class Publisher {
	@Id
	private String pubId;
    private String name;
    private String address;
    
    
    
    

}
