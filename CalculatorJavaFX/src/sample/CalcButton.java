package sample;
import javafx.scene.control.Button;

public class CalcButton extends Button {

    private String sign;

    public CalcButton() {
        super();
    }

    public CalcButton(String sign) {
        super();
        setText(sign);
        setMinSize(70, 30);
        setMaxSize(70, 30);
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

}