# Weather API Project

## Overview
This project is a simple weather application that provides weather information for a specified city. It consists of:
- A **backend** built with Java and Spring Boot.
- A **frontend** using HTML, CSS, and JavaScript.

The backend serves mock weather data and can be extended to integrate with real-world weather APIs like OpenWeatherMap.

---

## Features
- Fetch weather data for a given city.
- Mock data for demonstration purposes.
- Frontend UI to display weather information.

---

## Setup Instructions

### Backend Setup
1. **Requirements**:
   - Java 17 or higher
   - Maven
2. **Run Instructions**:
   - Navigate to the `backend` folder:
     ```bash
     cd backend
     ```
   - Build and run the backend:
     ```bash
     mvn clean install
     mvn spring-boot:run
     ```

   The backend will be available at `http://localhost:8080`.

---

### Frontend Setup
1. **Requirements**:
   - Any HTTP server (e.g., Live Server for VS Code)
2. **Run Instructions**:
   - Open the `frontend` folder in your editor.
   - Serve the files using Live Server or any HTTP server:
     ```bash
     cd frontend
     # Use your preferred method to serve files
     ```
   - Open `index.html` in your browser.

---

## API Endpoints
- **GET** `/api/weather/{city}`:
  - Retrieves weather data for the given city.
  - Mock data examples:
    - `london` -> Partly Cloudy, 15.5°C
    - `new york` -> Sunny, 22.3°C

---

## Future Improvements
- Integrate real-world weather APIs.
- Add error handling for invalid cities.
- Enhance the frontend UI.

---

## Author
- **Your Name**
