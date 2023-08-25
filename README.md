# Speaking Clock
There is two controller to full fill the requirements.
1. first controller is TimeTalkingController
	TimeTalkingController converts the current time into words. 
2. DayController
	It allows users to input the time in a 24-hour clock format and receive the corresponding time in words.
	It is checking the enterd time is mid day or mid day also.

## Technologies Used

- Java 11
- Spring Boot
- Gradle Wrapper
- Swagger

## Prerequisites

- Java 11 or higher installed on your machine
- Gradle Wrapper included in the project

## Getting Started

Follow the steps below to get started with the Speaking Clock project:

1. Access the application:

   Open a web browser and go to [http://localhost:8080](http://localhost:8080)

## API Endpoints

The Speaking Clock project provides the following API endpoints:

- `GET /current-time`: Converts the given time in a 24-hour clock format to words.
  - Request Parameter:
    - `time`: The time to convert (e.g., "08:34").
  - Example: `GET /current-time?time=08:34`
  
 
  - `GET /middaynight`: Converts the given time in a 24-hour clock format to check it is Mid day's or Mid night's.
  - Request Parameter:
    - `time`: The time to check mid day or mid night (e.g., "12:00").
  - Example: `GET /middaynight?time=12:00
    

## Authors

- Rupesh kumar