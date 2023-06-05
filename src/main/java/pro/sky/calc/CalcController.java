package pro.sky.calc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calc")
public class CalcController {
    private final CalcServes calcServes;
    public CalcController(CalcServes calcServes) {
        this.calcServes = calcServes;
    }
    @GetMapping
    public String hello() {
        return calcServes.hello();
    }
    @GetMapping(path = "/plus")
    public String plus(@RequestParam int num1, @RequestParam int num2) {
        return calcServes.plus(num1,num2);
    }
    @GetMapping(path = "/minus")
    public String minus(@RequestParam int num1, @RequestParam int num2) {
        return calcServes.minus(num1,num2);
    }
    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam int num1, @RequestParam int num2) {
        return calcServes.multiply(num1,num2);
    }
    @GetMapping(path = "/divide")
    public String divide(@RequestParam int num1, @RequestParam int num2) {
        return calcServes.divide(num1,num2);
    }
}