package Pages;

public class ScreenPage {
    private String divide_button;
    private String delete_button;
    private String multiply_button;
    private String minus_button;
    private String plus_button;
    private String equal_button;
    private String dot_button;
    private String numbers;
    private String result;

    public ScreenPage(){
        this.divide_button = "divide";
        this.delete_button = "delete";
        this.multiply_button = "multiply";
        this.minus_button = "minus";
        this.plus_button = "plus";
        this.equal_button = "equals";
        this.dot_button = "point";
        this.numbers = "com.google.android.calculator:id/digit_";
        this.result = "com.google.android.calculator:id/result_final";
    }

    public String getDivide_button() {
        return divide_button;
    }

    public String getDelete_button() {
        return delete_button;
    }

    public String getMultiply_button() {
        return multiply_button;
    }

    public String getMinus_button() {
        return minus_button;
    }

    public String getPlus_button() {
        return plus_button;
    }

    public String getEqual_button() {
        return equal_button;
    }

    public String getDot_button() {
        return dot_button;
    }

    public String getResult() {
        return result;
    }

    public String getNumberInPad(String number){
        return numbers + number;
    }


}
