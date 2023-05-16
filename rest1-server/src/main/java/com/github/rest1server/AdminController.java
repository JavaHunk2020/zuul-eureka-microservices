package com.github.rest1server;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


class Dog {
	String name="tommy";
	String color="red";
	int price=199;
	Dog(){
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}

@RestController()
@RequestMapping("/admin")
public class AdminController {

    @GetMapping()
    public String hello() {
        return "Hello from Rest1";
    }
    
    @GetMapping("/dog/{did}")
    public Dog getDog(@PathVariable  int did) {
    	return new Dog();
    }

    @GetMapping("/page1")
    public List<Admin> getAllAdmin() {
        List<Admin> out = new ArrayList<>();

        out.add(new Admin("bobo"));
        out.add(new Admin("baba"));
        out.add(new Admin("baba2"));

        return out;
    }

}
