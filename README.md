# 💳 Payment System Design (Java)

## 📌 Overview

This project is a simple object-oriented design for a flexible payment system built using Java.
The main goal was to design a system that is easy to extend and maintain without modifying existing code.

The system supports multiple payment methods and allows applying different discount strategies in a clean and scalable way.

---

## 🚀 Features

* Supports multiple payment methods:

  * Cash
  * Credit Card (with limit validation)
  * Wallet (with balance validation)

* Supports flexible discount strategies:

  * No discount
  * 10% discount
  * 20% discount

* Uses a Factory pattern to create payment methods

* Designed with loose coupling and high flexibility

---

## 🧠 Design Approach

The system is built following core OOP principles:

### 1. Abstraction

A common interface (`PaymentMethod`) is used so all payment types share the same behavior.

### 2. Encapsulation

Each payment method manages its own internal data (like balance or credit limit).

### 3. Polymorphism

Different payment types implement the same interface but behave differently.

---

## 🏗️ Design Patterns Used

### ✔ Strategy Pattern

Used for handling discount logic.
Each discount is implemented as a separate class, making it easy to add new discount types.

### ✔ Factory Pattern

Used to create payment objects based on a given type without exposing the creation logic.

### ✔ Dependency Injection

The `PaymentProcessor` receives its dependencies (payment method & discount strategy) instead of creating them internally.

---

## 📂 Project Structure

* `PaymentMethod` → Interface for all payment types
* `CashPayment`, `CreditCardPayment`, `WalletPayment` → Implementations
* `DiscountStrategy` → Interface for discounts
* `PaymentProcessor` → Handles the payment flow
* `PaymentFactory` → Creates payment objects

---

## ▶️ How It Works

1. A payment method is created using the factory
2. A discount strategy is selected
3. The `PaymentProcessor` applies the discount
4. The selected payment method processes the payment

---

## 💡 Example

```java
PaymentMethod method = PaymentFactory.createPayment(PaymentType.CREDIT_CARD);
DiscountStrategy discount = new TenPercentDiscount();

PaymentProcessor processor = new PaymentProcessor(method, discount);
processor.process(1000);
```

---

## 🎯 Key Takeaways

* The system is designed to be **open for extension, closed for modification**
* New payment methods or discounts can be added without changing existing code
* Focus on clean architecture and separation of concerns

---

## 🔮 Future Improvements

* Add support for more payment methods (e.g., mobile wallets)
* Integrate logging and error handling
* Add unit testing
* Support async payment processing

---

## 👨‍💻 Author

Mohamed Fouad
Computer Science Student & .NET Developer
