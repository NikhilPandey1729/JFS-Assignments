package Spring_Rest_Q4;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreditCardValidatorController
{
    @RequestMapping(value = "/validate/{cardNo}",method = RequestMethod.GET)   //demo card no. = 8975642561051321
    public String validateCreditCard(@PathVariable("cardNo") String cardNo)
    {
        CardValidator cardValidator = new CardValidator();
        cardValidator.setCardNo(cardNo);
        String res = cardValidator.isValidCard();
        return  res;
    }
}