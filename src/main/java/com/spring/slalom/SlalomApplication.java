package com.spring.slalom;

import com.spring.slalom.model.TrickDAOImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SpringBootApplication
public class SlalomApplication {
	public static TrickDAOImpl trickDAO;
	public static void main(String[] args) {
		SpringApplication.run(SlalomApplication.class, args);

	}
}
