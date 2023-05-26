package demoprojectforsprihgboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class СalculatorController {
    private CalculatorService calculatorService;

    public СalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public  String greetings() {
        return calculatorService.greetings();
    }
    @GetMapping(path = "/calculator")
    public  String CalculatorGreetings() {
        return calculatorService.CalculatorGreetings();
    }


    @GetMapping(path = "/calculator/plus")
    public String plus(@RequestParam("name1")int n1, @RequestParam("name2") int n2) {

       return calculatorService.plus(n1,n2);
    }

   @GetMapping(path =  "/calculator/minus")
   public String minus(@RequestParam("name1")int n1, @RequestParam("name2") int n2) {

       return calculatorService.minus(n1,n2);
   }
    @GetMapping(path =  "/calculator/multiply")
    public String multiply(@RequestParam("name1")int n1, @RequestParam("name2") int n2) {

        return calculatorService.multiply(n1,n2);
    }
    @GetMapping(path =  "/calculator/divide")
    public String divide(@RequestParam("name1")int n1, @RequestParam("name2") int n2) {

        return calculatorService.divide(n1,n2);
    }
}

