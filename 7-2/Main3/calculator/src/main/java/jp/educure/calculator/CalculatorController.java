package jp.educure.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    
    @GetMapping("/calculate")
    public String calculate(
        @RequestParam(value = "num1", required = false) String num1Str,
        @RequestParam(value = "num2", required = false) String num2Str){
            
        if(num1Str == null || num2Str == null) {
           return "エラー:パラメータが不足しています"; 
        }
        
        try {
            int number1 = Integer.parseInt(num1Str);
            int number2 = Integer.parseInt(num2Str);
            int result = number1+number2;

            String html = "<!DOCTYPE html>"
                    +    "<html>"
                    +    "<head>"
                    +        "<title>計算結果</title>"
                    +        "<style>"
                    +           ".result { color: blue; font-size: 24px; }"
                    +       "</style>"
                    +    "</head>"
                    +    "<body>"
                    +        "<div class= 'result'>"
                    +           "" + number1 + "+" + number2 + "=" + result + ""
                    +        "</div>"
                    +    "</body>"
                    +    "</html>";

        return html;

        } catch (NumberFormatException e) {
            // TODO: handle exception
            return "エラー:数値として認識できません";
        }
    }
}