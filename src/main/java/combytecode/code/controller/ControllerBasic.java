package combytecode.code.controller;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import combytecode.code.model.Post;

//Le indico a spring boot que esta clase es un controlador
@Controller 
@RequestMapping("/hola")  //Actúa de endpoint
public class ControllerBasic {
	//le digo que este es un método GET de mapeo
	@SuppressWarnings("deprecation")
	public List<Post> getPosts(){
		List<Post> posts = new ArrayList<>();
		posts.add(new Post(1,"Sabana Free Liberty","https://ep01.epimg.net/elpais/imagenes/2019/10/30/album/1572424649_614672_1572453030_noticia_normal.jpg",new Date(7,8,2021),"Free Sabana"));
		posts.add(new Post(1,"What a Lion","https://st.depositphotos.com/1020341/4233/i/600/depositphotos_42333899-stock-photo-portrait-of-huge-beautiful-male.jpg",new Date(7,8,2021),"Lion King"));
		return posts;
	}
	
	@GetMapping(path = {"/post","/"})
	public String post(Model model) {
		model.addAttribute("posts", getPosts());
		return "index";
	}
	
	/*
	 * 
	 * PÁGINA TODO
	@GetMapping(path = {"/saludar","/holamundo"})
	public String saludar() {
		return "index"; //devuelve el nombre de la vista (de index.html)
	}
	*/
	
	@GetMapping(path = {"/lion","/lionKing"})
	public String descriptionLion() {
		return "Lion";
	}
}
