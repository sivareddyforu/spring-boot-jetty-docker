package com.spring.docker.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author svippala
 *
 */
@RestController
public class HelloworldApplication 
{
	@RequestMapping("/hello")
	public String home() 
	{
		return "Welcome to Spring Boot Jetty with Docker....!";
	}
}
