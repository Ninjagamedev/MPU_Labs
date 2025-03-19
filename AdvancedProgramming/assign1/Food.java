package assign1;

public class Food extends Consumable{
    //This class has to have 2 extra attributes compared from Consumable
    private boolean isVegan;
    private boolean isGlutenFree;

    public Food() {
        super();
        isVegan = false;
        isGlutenFree = false;
    }

    public Food(String name, double price, boolean isVegan, boolean isGlutenFree) {
        super(name, price);
        this.isVegan = isVegan;
        this.isGlutenFree = isGlutenFree;
    }

    public boolean getIsVegan() {
        return isVegan;
    }
    public boolean getIsGlutenFree() {
        return isGlutenFree;
    }
    public void setIsVegan(boolean isVegan) {
        this.isVegan = isVegan;
    }
    public void setIsGlutenFree(boolean isGlutenFree) {
        this.isGlutenFree = isGlutenFree;
    }

    @Override
    public String toString() {
        if (isVegan && isGlutenFree) {
            return super.toString() + " This food is vegan and gluten free. \n Debug Values: isVegan: " + isVegan + " isGlutenFree: " + isGlutenFree;
        } else if (isVegan) {
            return super.toString() + " This food is vegan. \n Debug Values: isVegan: " + isVegan + " isGlutenFree: " + isGlutenFree;
        } else if (isGlutenFree) {
            return super.toString() + " This food is gluten free. \n Debug Values: isVegan: " + isVegan + " isGlutenFree: " + isGlutenFree;
        } else {
            return super.toString() + " This food is neither vegan nor gluten free. \n Debug Values: isVegan: " + isVegan + " isGlutenFree: " + isGlutenFree;
        }
    }
}
