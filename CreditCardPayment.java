package traning;

class CreditCardPayment implements Payment {
    private String cardNumber;
    private String cardHolderName;
    private String cardType;

    public CreditCardPayment(String cardNumber, String cardHolderName, String cardType) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.cardType = cardType;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using " + cardType + " card. Card Holder: " + cardHolderName + ", Card Number: " + cardNumber);
    }
    }
