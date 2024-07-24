package Practice;

public class Elephant extends Animal{
    private String name;
    public Elephant(int age, float weight, String name) {
        super(age, weight);
        this.name = name;
    }
    @Override
    public void speak(){
        super.speak();
        System.out.println("name: " + name);
    }
}
