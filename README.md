# gradle-crosskey-banking-solution
## About this project
This project is my solution to the Crosskey Trainee Code Test 2022. 

The application reads in from a file called prospects.txt and calculates how much a customer needs to pay each month over a specific 
period of time.


## Requirements
The given requirement is as follows:

"Given a total loan of X € and a fixed yearly interest rate of Y %. The customer wants to pay the same amount
each month for Z years. How much should the customer pay each month to pay off the whole debt?"

## Expected Output
"CustomerName wants to borrow X € for a period of Z years and pay E € each month"

## How to Run using Gradle
To run the application folow the steps below:
1. Ensure you are in the gradle-crosskey-banking-solution directory
2. Build the application using ` gradlew build`
3. Run `java -jar build/libs/gradle-crosskey-banking-solution.jar`

## How to run using Docker image
I have created a docker image that runs the java application and outputs the resired result. Follow the steps below to pull and run the docker image
1. Run `docker pull taylorroberts/mortgage-calculator`
2. Run ` docker run [image id]`
