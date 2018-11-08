import java.util.*;


public class Keyboard {

    LinkedList<Button> buttons = new LinkedList<>();

    public void addButton (Button button){
        buttons.add(button);
    }

    public LinkedList<Button> getButtons(){
        return this.buttons;
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

    public String buttonsGetText(){
        String text = "Get of my buttons: \n";
        int i = 0;
        for(Button button : buttons){
            i++;
            text += ""+i + ") " + button.toString();
        }
        return text;
    }

    public String deleteButtonsText(){
        String text = "Remove of my buttons: \n";
        int i = 0;
        for(Button button : buttons){
            i++;
            text += ""+i + ") " + button.toString() + "\n";
        }
        return text;
    }
}
