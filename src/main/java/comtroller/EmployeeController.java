package comtroller;


import model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("employee/")
public class EmployeeController {
    @GetMapping("/showform")
    public String createCustomerForm(Model model){

        model.addAttribute("employee", new Employee());
        return "/employee/create";
    }

    @PostMapping("/addEmployee")
    public String submit(@ModelAttribute Employee employee, BindingResult result, ModelMap model) {
        model.addAttribute("name", employee.getName());
        model.addAttribute("contactNumber", employee.getContactNumber());
        model.addAttribute("id", employee.getId());
        return "employee/info";
    }
}
