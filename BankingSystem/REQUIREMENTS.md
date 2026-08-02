Requirements

Design a small banking system.

There are two types of accounts:

Savings Account
Current Account

Every account has:

Account Number
Account Holder Name
Balance

Every account should support:

Deposit money
Withdraw money
Display account details
Rules

Savings Account

Cannot withdraw if the balance would go below ₹500.

Current Account

Can withdraw even if balance becomes negative.
Overdraft limit is ₹20,000.
Example:
Balance = ₹5,000
Withdraw ₹24,000 ✅
New Balance = -₹19,000
Withdraw ₹2,000 ❌ (would exceed overdraft)
