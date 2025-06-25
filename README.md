# Restaurant Management Application

This Restaurant Management Application is built using Spring Boot and provides functionality to manage restaurants. The application includes RESTful APIs for adding, updating, retrieving, and deleting restaurant records, along with database integration using MySQL.

## Features

1. **Retrieve Restaurants**

   * Endpoint: `/restaurants`
   * Method: `GET`
   * Description: Retrieves a list of all restaurants.

2. **Add a New Restaurant**

   * Endpoint: `/addRestaurant`
   * Method: `POST`
   * Description: Adds a new restaurant to the system.
   * Request Body: JSON object containing restaurant details.

3. **Update Restaurant Information**

   * Endpoint: `/updateRestaurant/{restaurant_id}`
   * Method: `PUT`
   * Description: Updates the information of an existing restaurant.
   * Request Body: JSON object containing updated restaurant details.
   * Path Variable: `restaurant_id` - ID of the restaurant to update.

4. **Delete Restaurant**

   * Endpoint: `/deleteRestaurant/{restaurant_id}`
   * Method: `DELETE`
   * Description: Deletes a restaurant by its ID.
   * Path Variable: `restaurant_id` - ID of the restaurant to delete.

## Technologies Used

1. **Backend**

   * Spring Boot
   * Spring Data JPA
   * RESTful APIs

2. **Database**

   * MySQL

3. **Development Tools**

   * Spring Boot DevTools
   * Lombok (optional)

4. **Testing**

   * Spring Boot Starter Test

## Prerequisites

* Java 17 or later
* Maven 3.6+
* MySQL Server

## Setup Instructions

1. **Clone the Repository**

   ```
   git clone <repository_url>
   cd hotel-management-application
   ```

2. **Configure Database**
   Update the `application.properties` file with your MySQL database details:

   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/your_database
   spring.datasource.username=your_username
   spring.datasource.password=your_password
   spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
   spring.jpa.hibernate.ddl-auto=update
   ```

3. **Build the Application**

   ```
   mvn clean install
   ```

4. **Run the Application**

   ```
   mvn spring-boot:run
   ```

5. **Access the Application**

   * Open your browser and navigate to `http://localhost:8080/restaurants` to test the APIs.

## API Endpoints

| Method | Endpoint                 | Description                   |
| ------ | ------------------------ | ----------------------------- |
| GET    | `/restaurants`           | Retrieve all restaurants      |
| POST   | `/addRestaurant`         | Add a new restaurant          |
| PUT    | `/updateRestaurant/{id}` | Update an existing restaurant |
| DELETE | `/deleteRestaurant/{id}` | Delete a restaurant by ID     |

## Dependencies

The following dependencies are defined in the `pom.xml` file:

* **Spring Boot Starter Data JPA**: For database interactions.
* **Spring Boot Starter Web**: For building web applications.
* **Spring Boot DevTools**: For development utilities.
* **MySQL Connector**: For MySQL database connectivity.
* **Lombok**: To reduce boilerplate code (optional).
* **Spring Boot Starter Test**: For writing tests.

## Contribution

Contributions are welcome! Feel free to fork the repository and submit pull requests. For major changes, please open an issue to discuss your proposed changes.

## License

This project is licensed under the [MIT License](LICENSE).

## Acknowledgments

* Spring Boot Documentation: [https://spring.io/projects/spring-boot](https://spring.io/projects/spring-boot)
* MySQL Documentation: [https://dev.mysql.com/doc/](https://dev.mysql.com/doc/)
