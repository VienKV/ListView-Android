package vn.hust.edu.clonegmailui;


public class EmailItem {

    private String sender;
    private String subject;
    private String brief;
    private String date;
    private boolean isImportant = false;

    public EmailItem(String sender, String subject, String brief, String date) {
        this.sender = sender;
        this.subject = subject;
        this.brief = brief;
        this.date = date;
    }

    public EmailItem(String sender, String subject, String brief, String date, boolean isImportant) {
        this.sender = sender;
        this.subject = subject;
        this.brief = brief;
        this.date = date;
        this.isImportant = isImportant;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public boolean isImportant() {
        return isImportant;
    }

    public void setImportant(boolean important) {
        isImportant = important;
    }

    public static EmailItem[] samples(){
        //Retorna um vetor de exemplos de ítens
        EmailItem[] emails = {
                new EmailItem("Christian Tavares", "Dúvida TP3",
                        "Boa noite, professor, gostaria de tirar uma dúvida a respeito do TP3.", "1 de jun"),
                new EmailItem("Roger Villar", "TableLayout com problemas",
                        "Boa noite, professor, estou enviando em anexo o meu projeto.", "2 de mai"),
                new EmailItem("Jéssica Maria", "FrameLayout",
                        "Boa noite, professor, onde posso encontrar uma referêcia sobre o FrameLayout.", "8 de jun"),
                new EmailItem("Lucas Lange", "Falta (greve de caminhoneiros)",
                        "Boa noite, professor, não poderei comparecer à aula amanhã devido à greve dos caminhoneiros.", "8 de jun"),
                new EmailItem("Bernardo Boquimpani", "Dúvida TP3",
                        "Bom dia, professor, gostaria de tirar uma dúvida a respeito do TP3.", "28 de abr"),
                new EmailItem("Camila Costa", "Dúvida TP3",
                        "Boa noite, professor, gostaria de tirar uma dúvida a respeito do TP3.", "13 de mai"),
                new EmailItem("João Pedro", "Dúvida TP3",
                        "Boa noite, professor, gostaria de tirar uma dúvida a respeito do TP3.", "4 de jun"),
                new EmailItem("Luiz Paulo", "Dúvida Assessment",
                        "Bom dia, professor, gostaria de tirar uma dúvida a respeito do AT.", "6 de jun"),
                new EmailItem("Maynara Angélica", "(Sem assunto)",
                        "Boa tarde, professor, gostaria de tirar uma dúvida a respeito do TP3.", "22 de mai"),
                new EmailItem("Igor Imperiali", "Falta (greve de caminhoneiros)",
                        "Boa tarde, professor, não poderei comparecer à aula amanhã devido à greve dos caminhoneiros..", "30 de abr"),
                new EmailItem("Marcos Antônio", "Dúvida TP3",
                        "Boa noite, professor, gostaria de tirar uma dúvida a respeito do TP3.", "8 de jun"),
                new EmailItem("Elizabeth Maria", "Aulas durante a Copa",
                        "Bom dia, professor, gostaria de saber se haverá aulas durante a Copa.", "8 de jun"),
        };

        return emails;
    }
}
