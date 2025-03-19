package assign1;

public class Drink extends Consumable{
    //This class has to have 2 extra attributes compared from Consumable
    private boolean isCarbonated;
    private boolean isAlcoholic;

    public Drink() {
        super();
        isCarbonated = false;
        isAlcoholic = false;
    }
    public Drink(String name, double price, boolean isCarbonated, boolean isAlcoholic) {
        super(name, price);
        this.isCarbonated = isCarbonated;
        this.isAlcoholic = isAlcoholic;
    }

    public boolean getIsCarbonated() {
        return isCarbonated;
    }
    public boolean getIsAlcoholic() {
        return isAlcoholic;
    }
    public void setIsCarbonated(boolean isCarbonated) {
        this.isCarbonated = isCarbonated;
    }
    public void setIsAlcoholic(boolean isAlcoholic) {
        this.isAlcoholic = isAlcoholic;
    }
    @Override
    public String toString() {
        if (isCarbonated && isAlcoholic) {
            return super.toString() + " This drink is carbonated and alcoholic. \n Debug Values: isCarbonated: " + isCarbonated + " isAlcoholic: " + isAlcoholic;
        } else if (isCarbonated) {
            return super.toString() + " This drink is carbonated. \n Debug Values: isCarbonated: " + isCarbonated + " isAlcoholic: " + isAlcoholic;
        } else if (isAlcoholic) {
            return super.toString() + " This drink is alcoholic. \n Debug Values: isCarbonated: " + isCarbonated + " isAlcoholic: " + isAlcoholic;
        } else {
            return super.toString() + " This drink is neither carbonated nor alcoholic. \n Debug Values: isCarbonated: " + isCarbonated + " isAlcoholic: " + isAlcoholic;
        }
    }
}
