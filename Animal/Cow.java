class Cow extends Animal {
    @Override
    public void speak() {
        System.out.println("MOOOOOOOOOO");
        }
    @Override    
    public void habitat() {
        System.out.println("Cows live on a farm.");
        }
    @Override    
    public void typesOf() {
        String[] types = {"Holstein", "Hereford", "Jersey"};
        System.out.print("This is a type of cow: ");
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