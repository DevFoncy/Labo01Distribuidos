package com.example.labo01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Labo01Application {
//	@Autowired
//	private UserDao userDao;
	
	public static void main(String[] args) {
		SpringApplication.run(Labo01Application.class, args);
	}
	
	@GetMapping("/")
    public String hello() {
            return "Hello Spring Boot!";
    }
	
//    @RequestMapping(value="/create", method = RequestMethod.GET)
//	public String create(String fname, String lname) {
//		String userId = "";
//		try {
//			User user = new User(fname, lname);
//			userDao.save(user);
//			userId = String.valueOf(user.getId());
//		} catch (Exception ex	) {
//			return "Error creating the user: " + ex.toString();
//		}
//		return "User succesfully created with id = " + userId;
//	}
//
//    @RequestMapping(value="/getAll", method = RequestMethod.GET)
//    public List<User> getByEmail() {
//    //	Iterable<User> user=null;
//        List<User> siteList;
//        siteList=userDao.findAll();
//      return siteList;
//    }
}
