package facade.after;

public class EmailMessage {
    private String from;
    private String To;
    private  String subject;
    private String text ;

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return To;
    }

    public void setTo(String to) {
        this.To = to;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
