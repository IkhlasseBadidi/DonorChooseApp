package Project;

import java.util.GregorianCalendar;
import User.*;

public class Message {

    private GregorianCalendar date;
    private String text;
    private Account member;

    public Message(GregorianCalendar date, String text, Account member) {
        this.date = date;
        this.text = text;
        this.member = member;
    }

    public GregorianCalendar getDate() {
        return date;
    }

    public void setDate(GregorianCalendar date) {
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Account getMember() {
        return member;
    }

    public void setMember(Account member) {
        this.member = member;
    }

    @Override
    public String toString() {
        return "Message{" + "date=" + date + ", text=" + text + ", member=" + member + '}';
    }

}
