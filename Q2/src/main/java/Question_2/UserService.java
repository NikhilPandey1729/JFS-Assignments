package Question_2;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserService
{
    @RequestMapping(value = "/validate/{username}/{password}",method = RequestMethod.GET)
    public String validateUser(@PathVariable String  username, @PathVariable String password)
    {
        if(username.equals("Nikhil") && password.equals("Nikhil@1729"))
            return "Valid User";
        else
            return "Invalid User";
    }
}