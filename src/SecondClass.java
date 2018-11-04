import java.util.LinkedList;
import java.util.List;

public class SecondClass {

    List<Button> buttons = new LinkedList<>();

    public void addButton (Button button){
        buttons.add(button);
    }

    public List<Button> getButtons(){
        return this.buttons;
    }

    public void deleteButton(Button button){
        buttons.remove(button);
    }

    public String myButtonsText(){
        String text = "list of my buttons: \n";
        int i = 0;
        for(Button button : buttons){
            i++;
            text += ""+i + ") " + button.toString()+ "\n";
        }
        return text;
    }

    public String ButtonsGet(){
        String text = "Get of my buttons: \n";
        int i = 0;
        for(Button button : buttons){
            i++;
            text += ""+i + ") " + button.toString();
        }
        return text;
    }

    public String deleteButtons(){
        String text = "Remove of my buttons: \n";
        int i = 0;
        for(Button button : buttons){
            i++;
            text += ""+i + ") " + button.toString();
        }
        return text;
    }
}
