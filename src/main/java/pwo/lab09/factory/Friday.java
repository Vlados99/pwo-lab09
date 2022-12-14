/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pwo.lab09.factory;

/**
 *
 * @author bubur
 */
public class Friday implements MessageFactory{
    @Override
    public String createIntroMessage() {
        return "Dzień dobry Piątek.";
    }

    @Override
    public String createMainMessage() {
        return "Praca w piątek idzie lepiej";
    }

    @Override
    public String createClosingMessage() {
        return "Piąty dzień pracy w tym tygodniu minął";
    }
}
