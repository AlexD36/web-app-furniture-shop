# Furniture E-Commerce Platform

![Java](https://img.shields.io/badge/Java-17+-brightgreen) 
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen) 
![HTML](https://img.shields.io/badge/HTML-5-orange)  ![CSS](https://img.shields.io/badge/CSS-3-blue)  ![JavaScript](https://img.shields.io/badge/JavaScript-ES6+-yellow)  


https://github.com/user-attachments/assets/6e865b4d-e12a-4255-85df-66c7bc331901


## **Overview**

This project is a complete furniture e-commerce platform, consisting of both a backend and a frontend. The backend, developed with **Java** and **Spring Boot**, provides RESTful APIs for managing furniture products, user accounts, orders, and shopping carts. The frontend, built using **HTML**, **CSS**, and a bit of **JavaScript**, delivers an intuitive and visually appealing interface for browsing and purchasing furniture.

🛠️ Note: Security is temporarily disabled to facilitate API testing during development.

---

## **Features**

### **User Management**
- User registration and authentication (JWT-based).
- Role-based access control (Admin and Customer).
- CRUD operations for user profiles.

### **Furniture Product Management**
- CRUD operations for furniture items.
- Category-based product organization.
- Product listing with pagination and filtering.

### **Order Management**
- Place, view, and manage furniture orders.
- Order history for users.
- Status updates for orders (e.g., pending, shipped, delivered).

### **Shopping Cart**
- Add, update, and remove furniture items from the cart.
- Dynamically calculate cart totals.

### **Category Management**
- Organize furniture items by categories.
- Manage categories via admin panel.

### **Frontend Integration**
- The frontend application enhances user experience by providing:
  - A clean and responsive UI for browsing furniture products.
  - Real-time updates for product listings and cart changes.
  - Smooth workflows for placing orders and managing user accounts.

---

## **Technologies Used**

### **Backend Frameworks**
- **Spring Boot**: REST API development and application logic.
- **Spring Security**: For authentication and authorization.

### **Database**
- **H2 Database**: Lightweight in-memory database for rapid development and testing.
- **JPA/Hibernate**: ORM for database operations.

### **Frontend**
- **HTML**, **CSS**, and **JavaScript**: Technologies used to create the user interface.

### **Tools & Build**
- **Maven**: Dependency management and build automation.
- **Lombok**: Reduce boilerplate code.
- **Swagger**: API documentation.

### **Testing**
- **JUnit**: Unit testing.
- **Postman**: Manual API testing.

---

## **Project Structure**

```plaintext
src/
├── main/
│   ├── java/
│   │   └── com/
│   │       └── furniture/
│   │           ├── config/              # Configuration classes
│   │           │   ├── SecurityConfig   # Security configuration
│   │           │   └── SwaggerConfig    # API documentation config
│   │           ├── controller/          # REST API controllers
│   │           │   ├── CategoryController
│   │           │   ├── OrderController
│   │           │   ├── ProductController
│   │           │   ├── CartController
│   │           │   └── UserController
│   │           ├── model/               # Data models
│   │           │   ├── dto/             # Data Transfer Objects
│   │           │   │   ├── cart/        # Cart-related DTOs
│   │           │   │   ├── category/    # Category-related DTOs
│   │           │   │   ├── order/       # Order-related DTOs
│   │           │   │   ├── product/     # Product-related DTOs
│   │           │   │   └── user/        # User-related DTOs
│   │           │   └── entity/          # JPA entities
│   │           ├── repository/          # Data access layer
│   │           ├── service/             # Business logic
│   │           ├── util/                # Utility classes
│   │           └── FurnitureApplication.java # Main application class
│   └── resources/
│       └── application.properties          # Application configuration
└── test/
    └── java/
        └── com/
            └── furniture/
                └── FurnitureApplicationTests.java
```

---

## **API Documentation**

### **User Management**
- **PUT** `/api/users/{email}` - Update user's email address
- **DELETE** `/api/users/{email}` - Delete user account by email
- **POST** `/api/users/register` - Register new user account
- **POST** `/api/users/login` - Authenticate user and receive JWT token
- **POST** `/api/users/addCart` - Add a new cart to user's account
- **GET** `/api/users` - Retrieve list of all users (admin only)
- **GET** `/api/users/{id}` - Get user details by ID

### **Cart Management**
- **POST** `/api/users/{userId}/cart` - Add furniture item to user's cart
- **DELETE** `/api/users/{userId}/cart/{productId}` - Remove furniture item from cart

### **Furniture Product Management**
- **GET** `/api/v1/products` - Get all furniture items (with pagination)
- **GET** `/api/v1/products/{id}` - Get furniture item by ID
- **POST** `/api/v1/products` - Create new furniture item
- **PUT** `/api/v1/products/{id}` - Update existing furniture item
- **DELETE** `/api/v1/products/{id}` - Delete furniture item

### **Order Management**
- **POST** `/api/orders` - Create a new order
- **GET** `/api/orders/user/{userId}` - Get orders by user
- **PUT** `/api/orders/{orderId}/status` - Update order status

### **Category Management**
- **GET** `/api/categories` - Get all categories
- **POST** `/api/categories` - Create new category

All endpoints are documented with Swagger UI, accessible at:
`http://localhost:8080/swagger-ui.html`

API documentation is available at:
`http://localhost:8080/api-docs`

---

## **Setup Instructions**

### **Prerequisites**
1. Install **Java 17** or higher.
2. Install **Maven** for build management.

### **Clone the Repository**

```bash
git clone https://github.com/AlexD36/furniture-ecommerce-springboot-app

cd furniture-ecommerce-springboot-app
```

### **Run the Application**
1. Build the project:
   ```bash
   mvn clean install
   ```
2. Run the application:
   ```bash
   mvn spring-boot:run
   ```

### **Test the APIs**
1. Open your browser and navigate to:
   - **Swagger UI**: `http://localhost:8080/swagger-ui/index.html`.
2. Use **Postman** or Swagger to interact with the APIs.

---

## **Contributing**

### **Guidelines**
- Fork the repository and create a new branch.
- Follow clean code practices and write unit tests for new features.
- Ensure that all tests pass before creating a pull request.

---

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for more details.


