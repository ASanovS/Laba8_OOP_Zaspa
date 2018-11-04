class Button {

    private String weigth, height, name;

    public Button(String weigth, String height, String color) {
        this.weigth = weigth;
        this.height = height;
        this.name = color;
    }


    public String getWeight(){return weigth;}
    public String getHeight(){return height;}
    public String getColor(){return name;}

    public void setWeight(String weight){this.weigth = weigth;}
    public void setHeight(String weight){this.height = height;}
    public void setColor(String color){this.name = color;}
    
    @Override
    public String toString() {
        return "Button: weigth=" + weigth + ", height=" + height + ", color=" + name + "\n";
    }
}
