package Interfaz;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TextPrompt extends JLabel implements FocusListener {

    private String text;
    private JTextField textField;

    public TextPrompt(String text, JTextField textField) {
        this.text = text;
        this.textField = textField;
        textField.addFocusListener(this);
        showPrompt();
    }

    private void showPrompt() {
        if (textField.getText().isEmpty()) {
            textField.setText(text);
            textField.setForeground(Color.GRAY);

        }
    }

    private void hidePrompt() {
        if (textField.getText().equals(text)) {
            textField.setText("");
            textField.setBackground(Color.WHITE);
            textField.setForeground(Color.BLACK);

        }
    }

    @Override
    public void focusGained(FocusEvent e) {
        hidePrompt();
    }

    @Override
    public void focusLost(FocusEvent e) {
        showPrompt();
    }
}
