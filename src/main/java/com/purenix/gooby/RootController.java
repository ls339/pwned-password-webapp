package com.purenix.gooby;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(path="/")
public class RootController {
	@Autowired // This means to get the bean called userRepository
	           // Which is auto-generated by Spring, we will use it to handle the data
	@GetMapping(path="/")
	public ModelAndView RootView() {
		return new ModelAndView("redirect:/pwnedcheck");
	}

}
