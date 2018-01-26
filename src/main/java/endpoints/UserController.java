package endpoints;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class UserController{

	@RequestMapping("/")
	public String index(){
		return "Hello from Controller!";
	}
}