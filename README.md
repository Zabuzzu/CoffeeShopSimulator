# Smart Home & Coffee Shop System 🏠☕

This project demonstrates two systems implemented using design patterns:

## 1. Coffee Shop Simulator (40 points)
**Design Patterns**: Factory Method, Decorator

### 🚀 Features:
- Create coffee types (`Espresso`, `Latte`) via a factory
- Dynamically add toppings (`Milk`, `Chocolate`) using decorators
- Calculate total order cost

```java
Coffee coffee = new Espresso();
coffee = new MilkDecorator(coffee); // +$0.5
coffee = new ChocolateDecorator(coffee); // +$0.7
System.out.println(coffee.getDescription()); // "Espresso, Milk, Chocolate"

2. Online Payment Gateway (60 points)
Design Patterns: Factory Method, Adapter

💡 Functionality:
Payment methods: credit cards, PayPal

Integration with PayPal API via adapter

Transaction logging

PaymentMethod paypal = new PayPalAdapter("user@mail.com");
paypal.processPayment(30.0); // Adapts to PayPal API

🛠 Technologies
Language: Java 17+

Build Tool: Maven/Gradle (optional)

Testing: JUnit 5 (can be added)

📂 Project Structure
src/
├── coffeeshop/          # Coffee shop simulator
│   ├── decorator/       # Decorator implementation
│   ├── factory/         # CoffeeFactory
│   ├── model/           # Coffee interfaces & implementations
│   └── demo/            # Usage examples
│
└── payment/             # Payment system
    ├── adapter/         # PayPalAdapter
    ├── factory/         # PaymentFactory
    ├── service/         # PaymentMethod implementations
    └── util/            # TransactionLogger
