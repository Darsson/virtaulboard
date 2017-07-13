package com.virtualboard.springmvc.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.virtualboard.springmvc.dao.User;
import com.virtualboard.springmvc.service.BoardsService;
import com.virtualboard.springmvc.service.CardsService;
import com.virtualboard.springmvc.service.UsersService;


@Controller 
public class BoardsController {

	@Autowired
	private BoardsService boardService;
	
	@Autowired
	private CardsService cardService;
	
	@Autowired
	private UsersService userService;
	
	@RequestMapping("/")
	public String showHome(Model model, Principal principal){		
			
		User user = userService.getUser(principal.getName());

		model.addAttribute("user", user);
						
		return "home";
	}
	
	@RequestMapping(value="/board", method=RequestMethod.GET)
	public String showBoad(Model model, Principal principal, @RequestParam("id") int id){		
			
		User user = userService.getUser(principal.getName());

		model.addAttribute("user", user);
		
		model.addAttribute("cards", cardService.getCards());
				
		model.addAttribute("board", boardService.getBoard(id));
				
		return "board";
	}
	
	
	@RequestMapping("/login")
	public String showLogin(Model model){		
			
	System.out.println("login");
		
		return "login";
	}
	
}