package com.marco.core.controllers;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.marco.core.configuration.Pages;
import com.marco.core.model.Post;

@Controller
@RequestMapping("/home")
public class ControllerBasic {
	public List<Post> getPosts(){
		ArrayList<Post> post=new ArrayList<>();
		post.add(new Post(1,"Es una Version de Java","https://cdn.hobbyconsolas.com/sites/navi.axelspringer.es/public/media/image/2021/08/naruto-naruto-uzumaki-2425679.jpg",new Date(),"Naruto"));
		post.add(new Post(2,"Es una Version de Java","https://media.revistagq.com/photos/6061de8b7e6648d674c91a59/master/pass/attack%20on%20titan.jpeg",new Date(),"Attack on Titan"));
		post.add(new Post(3,"Es una Version de Java","https://static.bandainamcoent.eu/high/dragon-ball/dragonball-project-z/00-page-setup/dbzk_game-thumbnail.jpg",new Date(),"Dragon Ball Z"));
		return post;
	}

	/*
	 * @GetMapping(path = {"/post","/"}) public String saludar(Model model){
	 * model.addAttribute("posts",this.getPosts()); return "index"; }
	 */
	@GetMapping(path= {"/public"})
	public ModelAndView post() {
		ModelAndView modelandview = new ModelAndView(Pages.HOME);
		modelandview.addObject("posts",this.getPosts());
		return modelandview;
	}
	
}
