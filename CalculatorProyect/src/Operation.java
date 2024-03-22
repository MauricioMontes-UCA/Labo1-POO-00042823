//Is an operation an object tho?
public class Operation {
    //Object's attributes
    private float num1;
    private float num2;

    //------------------------------------------------------------------------------------------
    //Constructor, default values as 0
    public Operation() {
        this.num1 = 0;
        this.num2 = 0;
    }

    //------------------------------------------------------------------------------------------
    //Setters and Getters
    public float getNum1() {
        return num1;
    }

    public void setNum1(float num1) {
        this.num1 = num1;
    }

    public float getNum2() {
        return num2;
    }

    public void setNum2(float num2) {
        this.num2 = num2;
    }

    //------------------------------------------------------------------------------------------
    //Operations, from sum to division
    public float addition(){
        return getNum1() + getNum2();
    }

    public float subtraction(){
        return getNum1() - getNum2();
    }

    public float multiplication(){
        return getNum1() * getNum2();
    }

    //I'm not sure how to NOT return 0, or how would this react while running the code
    public float division(){
        if (getNum2() == 0){
            System.out.println("excuse me, tf r u doing?");
            return 0;
        }
        else{
            return getNum1() / getNum2();
        }
    }
}
