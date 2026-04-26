# 📦 Inventory Management System

## Project Description

The **Inventory Management System for End User Equipment** is a web-based application developed using Spring Boot MVC.

The system is designed to help organizations efficiently manage and track IT assets such as laptops, desktops, and mobile devices. It improves visibility of asset ownership, simplifies assignment processes, and keeps records of device usage and history.

---

##  Features

*  User Authentication (Login & Registration)
*  Employee Management
*  Department Management
*  Device Management
*  Assignment Tracking
*  Dashboard Overview
*  History Tracking

---

##  Technologies Used

* Java (JDK 17)
* Spring Boot (MVC Architecture)
* Thymeleaf (Frontend Templates)
* MySQL (Database)
* Maven (Build Tool)
* HTML / CSS

---

##  Project Structure

```
src/main/java/com/inventory
│
├── InventoryApplication.java      # Main class
├── controller/                   # Controllers (MVC)
├── models/                       # Entity classes
├── repository/                   # Database access layer
│
src/main/resources/
├── templates/                    # Thymeleaf HTML pages
├── static/                       # CSS / JS
└── application.properties        # Configuration file
```

---


How to Navigate the System

After logging in as SysAdmin:

* **Dashboard** → View system overview
* **Employees** → Add and manage employees
* **Departments** → Manage departments
* **Devices** → Register and track devices
* **Assignments** → Assign devices to employees
* **History** → View past records and transactions

Use the navigation menu to move between different sections of the system.
##  Login Credentials

 System Administrator Credentials

Use the following credentials to access the system as a System Administrator (SysAdmin):

* **Username:** `RegNo1` → `24rp04287`
* **Password:** `RegNo2` → `24rp06650`


### 5. Open in browser

```
http://localhost:8080
```

---

## ⚙️ Configuration

Update your database settings in:

```
src/main/resources/application.properties
```

Example:

```
spring.datasource.url=jdbc:mysql://localhost:3306/inventory
spring.datasource.username=root
spring.datasource.password=''
spring.jpa.hibernate.ddl-auto=update
```


## 👨‍💻 Author

Developed by **Claire Nuwayo AND Theogen Sinzabakwira**
IT Department
