class Button {

    private String name, weight, height;

    public Button(String name, String height, String weight) {
        this.weight = weight;
        this.height = height;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Button: name=" + name + ", height=" + height + ", weight=" + weight + "\n";
    }
}
