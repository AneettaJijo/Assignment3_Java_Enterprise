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
@Document(collection = "members")

public class Member {
	@Id
	 
	    private String membId;
	    private String name;
	    private String address;
	    private String expiryDate;
	    private String membType;
	    private String membDate;

}
