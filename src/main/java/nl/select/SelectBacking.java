package nl.select;

import javax.enterprise.inject.Model;

@Model
public class SelectBacking {

    String letter;

    public String getLetter() {
        return letter;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }

}
