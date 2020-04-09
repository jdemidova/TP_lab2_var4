package view;
import model.OperatorEnum;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

public class OperatorParser {
    private Map<String, OperatorEnum> operatorMap = new HashMap<>();
    public OperatorParser() {
        operatorMap.put("mult", OperatorEnum.OPERATOR_MULTIPLICATION);
        operatorMap.put("rot", OperatorEnum.OPERATOR_ROTATION);
    }

    public OperatorEnum parseOperator(String token) throws ParseException {
        OperatorEnum operator = operatorMap.get(token);
        if (operator == null) {
            throw new ParseException(String.format(CalcUI.ERROR_TOKEN_PARSE_PATTERN, token), 0);
        }
        return operator;
    }
}
