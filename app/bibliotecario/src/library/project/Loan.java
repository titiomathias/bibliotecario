package library.project;

import java.time.LocalDate;

public class Loan {
    private int loan_id;
    private int book_id;
    private int client_id;
    private LocalDate data_loan;
    private LocalDate data_limit;
    private short renews;
    private float amount;
    private float fine;
}
