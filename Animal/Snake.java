class Snake extends Animal {
    @Override
    public void speak() {
        System.out.println("Ssssssssss");
    }
    @Override
    public void habitat() {
        System.out.println("Snakes live in the jungle");
    }
    @Override
    public void typesOf() {
        String[] types = {"Rattlesnake", "Cobra", "Mamba"};
        System.out.print("This is a type of snake: ");
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