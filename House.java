package traning;

class House extends Building {
    private boolean hasGarden;

    public House(String address, String name, int size, boolean hasGarden) {
        super( name, size,address);
        this.hasGarden = hasGarden;
    }

    @Override
    public void displayDetails() {
        System.out.println("House Details: " + this.getName() + ", Address: " + this.getAdress() + ", Size: " + this.getSize() + ", Has Garden: " + hasGarden);
    }
}