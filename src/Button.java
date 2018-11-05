class Button {

    private String weight, height, name;

    public Button(String weight, String height, String color) {
        this.weight = weight;
        this.height = height;
        this.name = color;
    }


    public String getWeight(){return weight;}
    public String getHeight(){return height;}
    public String getColor(){return name;}

    public void setWeight(String weigth){this.weight = weigth;}
    public void setHeight(String height){this.height = height;}
    public void setColor(String color){this.name = color;}
    
    @Override
    public String toString() {
        return "Button: weigth=" + weight + ", height=" + height + ", color=" + name + "\n";
    }
}
