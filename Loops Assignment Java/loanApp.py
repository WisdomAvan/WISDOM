loan_amount = float(input("Enter Loan Amount"))

years = int(input("Enter Number of Yeras"))

print("Interest Rate \t   Monthly Payment \t Total Payment")

for value in range(5.0, 10.0, 0.25):

    monthly_rate = (count)/(100 * 12)

    monthly_loan = (loan_amount * (monthly_rate * Math.pow( 1 + monthly_rate, years * 12)))/( Math.pow( 1 + monthly_rate, years * 12)-1)

    total_amount = monthly_loan * years * 12

print("\n%.3f   \t    %.2f  \t          %.2f\n" , count , monthly_loan , total_Amount)


 
