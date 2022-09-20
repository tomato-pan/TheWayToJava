package fundamental.designMode.javaFactoryDemo.vo;

public class CardResult {
    private String result;

    public Long getCardId() {
        return cardId;
    }

    public void setCardId(Long cardId) {
        this.cardId = cardId;
    }

    private Long cardId;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    private Integer code;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
