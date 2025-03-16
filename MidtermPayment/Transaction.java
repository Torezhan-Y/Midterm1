class Transaction{  // Class representing a transaction status
    String status;
    double amount;
    public Transaction(double amount){
        this.amount=amount;
        this.status="Pending..."; // Default status is pending
    }
    public void complete() {
        this.status = "Completed!"; // Mark transaction as completed
    }

    public void fail(){
        this.status="Failed!"; // Mark transaction as failed
    }
    public String getStatus(){
        return status;
    }
}


