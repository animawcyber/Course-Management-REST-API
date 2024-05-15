# Course-Management-REST-API
Course Management REST API
This Spring Boot project is using RESTful API for managing courses. It offers CRUD (Create, Read, Update, Delete) operations for a 'Course' entity.

Technologies Used
Java
Spring Boot
Spring Data JPA
Mysql Database 

Setup
Clone the repository: [git clone https://github.com/animawcyber/course-management.git](https://github.com/animawcyber/Course-Management-REST-API.git)
Navigate to the project directory: cd course-management
Build the project: mvn clean install
Run the application: java -jar target/course-management-1.0.jar

GET /courses: Retrieve all courses
GET /courses/{id}: Retrieve a course by ID
POST /courses: Create a new course
PUT /courses/{id}: Update an existing course
DELETE /api/courses/{id}: Delete a course by ID
Example JSON for Course Entity
{
   "course_code": "SE333",
  "title": "Web technology II",
  "crhrs": 3,
 
}
Usage
Use your favorite API development tool ( example in the classroom we use: Postman) 
Replace {id} in the endpoints with the ID of the course you want to interact with.
Sample Request (using cURL)
Create a new course

curl -X POST -H "Content-Type: application/json" -d '{
  "course_code": "SE333",
  "title": "Web technology II",
  "crhrs": 3,
}' http://localhost:8080/courses

my database configuration in application.properties is as follows:
spring.datasource.url=jdbc:mysql://localhost:3306/course
spring.datasource.username=root
spring.datasource.password=
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true            

