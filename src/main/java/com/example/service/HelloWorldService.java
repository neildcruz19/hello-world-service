/**
 * 
 */
package com.example.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author neildcruz
 *
 */
@RestController
public class HelloWorldService {

	@RequestMapping("/")
	public String helloWorld() {
		return "Hello World!";
	}
}
