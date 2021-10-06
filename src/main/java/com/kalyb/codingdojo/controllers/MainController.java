package com.kalyb.codingdojo.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
 
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}

	@RequestMapping("/counter")
    public String index(HttpSession session, Model model) {
        // If the count is not already in session
        if (session.getAttribute("count") == null) {
            // Use setAttribute to initialize the count in session
        	session.setAttribute("count", 0);
        }
        else {
            // increment the count by 1 using getAttribute and setAttribute
        	Integer currentCount = (Integer) session.getAttribute("count");
        	currentCount++;
        	session.setAttribute("count", currentCount);
        }
        return "counter.jsp";
    }
}
