package fundamental.designMode.javaFactoryDemo.vo;

import java.util.Map;

public class GoodsResult {
    private String result;

    public Map getExtMap() {
        return extMap;
    }

    public void setExtMap(Map extMap) {
        this.extMap = extMap;
    }

    private Map extMap;

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
