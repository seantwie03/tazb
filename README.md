# Totally Awesome Zero-Based Budget
TAZB is a monthly budgeting app.  At the start of the month, a user can create budget categories and assign
dollar values to them.  As the month goes on, the user enters their expenses and assigns them to a category.
Throughout the month, the user is able to see how closely their expected values compare to what was actually spent
in each category.

## Minimum Viable Product (MVP)
TAZB is a side-project. Thus, the developer wants to start simply with a Minimum Viable Product.

### Application Components
To get started quickly, the TAZB MVP will be developed as a monolithic Spring Boot application.

-  Spring Boot Application
    - Thymeleaf - Template Engine to structure and display data
    - Bootstrap 5 - Reactive CSS Framework to style the display
    - Spring Security - Username and Password Authentication
    - Spring MVC - Model View Controller Framework
    - Spring Data JPA - Database Access (Create, Read, Update, Delete)
    - Flyway - Database migrations

### Database
PostgreSQL was chosen as the database due to the developer's familiarity with it. In the MVP, PostgreSQL will be
installed directly on the operating system. Flyway will be used for database migrations.

### Operating System
Ubuntu was chosen as the Operating System due to the Raspberry Pi support offered by Canonical. 

### Hardware
The TAZB MVP will be ran on a Raspberry Pi 3B+.

### Code Quality
To ensure a high level of code quality, the developer will use SonarLint and write unit and integration tests as needed.

### Deployment
Deployment of the TAZB MVP will be done manually using Linux utilities such as ssh and scp.

