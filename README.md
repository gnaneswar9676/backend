# Online Art Gallery Platform

An innovative platform providing artists with a global stage to showcase their art, enriched with interactive 3D tours and detailed cultural context for visitors. This platform combines **React** for the frontend, **Spring Boot** for the backend, and **MySQL** as the database to deliver an immersive and dynamic experience.

## Features

- **Interactive 3D Virtual Tours**: Explore art galleries in a realistic, engaging way.
- **Artist Dashboard**: Upload, manage, and sell artwork effortlessly.
- **Curator Tools**: Organize and display exhibits dynamically.
- **Educational Context**: Learn the cultural significance behind each piece.

## Tech Stack

### Frontend
- **Framework**: React
- **Libraries**: React Router, Axios, Three.js or Babylon.js (for 3D rendering)

### Backend
- **Framework**: Spring Boot
- **Language**: Java
- **REST API**: Exposes endpoints for CRUD operations
- **Security**: Spring Security (JWT-based authentication)

### Database
- **Database**: MySQL
- **ORM**: Hibernate (JPA)

## Getting Started

Follow these steps to set up the project locally.

### Prerequisites

Ensure you have the following installed:

- **Frontend**:
  - [Node.js](https://nodejs.org/)
  - npm (comes with Node.js)
  
- **Backend**:
  - [Java 17](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html)
  - [Spring Boot](https://spring.io/projects/spring-boot)
  - [MySQL](https://dev.mysql.com/downloads/)

### Installation

#### 1. Clone the Repository
   ```bash
   git clone https://github.com/gnaneswar9676/backend.git
   cd online-art-gallery

2. Set Up the Frontend
Navigate to the frontend directory:


cd frontend
Install dependencies:

npm install
Start the React development server:


npm start
Open your browser and navigate to http://localhost:3000.

3. Set Up the Backend
Navigate to the backend directory:


cd ../backend
Update the database configuration in src/main/resources/application.properties:


spring.datasource.url=jdbc:mysql://localhost:3306/online_art_gallery
spring.datasource.username=your-username
spring.datasource.password=your-password
spring.jpa.hibernate.ddl-auto=update
Build the Spring Boot application:


./mvnw clean install
Run the application:


./mvnw spring-boot:run
The backend API will be available at http://localhost:8080.

Database Schema
Here is an overview of the MySQL schema:

Artists: Stores artist details (id, name, bio, profile image, etc.).
Artworks: Stores details about artwork (id, title, description, price, artist_id, image_url).
Exhibits: Stores exhibit data (id, name, description, start_date, end_date).
Users: Manages users (id, name, email, password, role).
