class Button {

    private String name, weight, height;

    public Button(String name, String height, String weight) {
        this.weight = weight;
        this.height = height;
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("Button - name: %s heigth: %s weigth: %s \n", name, height, weight);
        //return "Button: name=" + name + ", height=" + height + ", weight=" + weight + "\n";
    }
}
