class Fish extends Animal {
    @Override
    public void speak() {
        System.out.println("Blub blub");
    }
    @Override
    public void habitat() {
        System.out.println("Fish live in the water");
    }
    @Override
    public void typesOf() {
        String[] types = {"Salmon", "Barracuda", "Clownfish"};
        System.out.print("This is a type of fish: ");
        for (String x : types) {
        if (x.equals(types[2])) {
                System.out.print(x + ".");
            } else {
                System.out.print(x + ", ");
            }
        }
        System.out.print("\n\n");
    } 
}   