Project structure:I have used multi modular framework where we have one core framework and on the top of that RespondUITest are written

Core framework: Core framework is where i have wrapped all the functions that selenium has so that it will easy for other memebers in the team to use those functions as a wrapper RespondUITest: Ui test contain all the UI test where all the wrapper functions defined in core framework are used.I have used it so that every memeber in the team have same coding format and can use reusable functions defined in core framework

Framework strcuture used: 1.Selenium with java- For Ui automation 2.Maven-For build,dependencies and project management 3.Page factory:For organinsing code 4.testng:To run code systematically 5.Extent reports:To generate reports 6.Json and dataprovider:To make it data driven and used json to read data as it is fast and dont have much issues

To run the setup in local: 1.Take a pull from master 2.Run core framework as maven clean and install(for running via command line mvn clean install 3.Run RespondUITest as maven clean and install(For running via command line mvn clean install

To run it via workflows: To ease it a bit have also created workflows where i have defined actions and build will get run in every push to run it without pushing you can go to actions and re run job and test will start running via github actions
