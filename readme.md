Selenium Practice
===========
# Installation
1. JDK: It stands for Java Development Kit. You need it to compile and run the code (since it's written in Java :D). Here's the [link](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) to download it.
2. Maven: Maven is a tool to manage the program lifecycle and dependencies. In this framework, its main purpose is to manage dependencies. You can download it [here](https://maven.apache.org/download.cgi) and find the installation guide [here](https://maven.apache.org/install.html). In case you don't know how to set environment variables, you can find the instruction [here](https://www.java.com/en/download/help/path.xml)
3. Git: Git is a version control tool. It helps us to manage our code version easier. You can find way to download its [here](https://git-scm.com/). For ones that don't know how to use Git, don't worry since in this framework you just need to know very few Git commands, which will be listed in below section. If you want to learn seriously about Git, One recommended course is [here](https://www.datacamp.com/courses/introduction-to-git-for-data-science) in DataCamp.

Optional:

1. IDE: You'll need an editor for coding. If you want a full support from writing code to compiling and running, IDE (Integrated Development Environment) is here to help. It provides you an editor and some tools to code easier, as well as compile and run the code. There're many IDEs out there, so you can choose which suites you best. Two recommended ones are [IntelliJ](https://www.jetbrains.com/idea/download/#section=windows) and [Eclipse](https://www.eclipse.org/downloads/packages/eclipse-ide-java-developers/oxygen2). As this project is written with IntelliJ, so it might be better if you use that IDE. Beside that, there're some lightweight editors (which only help you to edit your code, no more no less) like: Visual Studio Code, Sublime, Notepad++, Notepad, etc.
2. Git GUI: If you don't want to remember Git commands like `git commit` or `git pull`, you may want to use some tools that transform these commands to GUI button, text, etc. You may want to try [SourceTree](https://www.sourcetreeapp.com/) or [Git Desktop](https://desktop.github.com/).


# Download the code
1. Ask Thi Nguyen (thitknguyen@kms-technology.com) to give you access to training git site of KMS. Contact course trainer so that they can add you to the course repository.
2. Fork the project to your own repository (Using Fork button in the project page)
3. Open the File Explore, navigate to the parent folder of the folder which you want to store the code (Ex: D:\Learning\Selenium). Click on the Address bar and type `cmd`. A terminal will appear.
4. On this terminal, type `git clone [your git repository link] [the name of the folder you want to store the code]`. Please remember to give **your** repository link, not the original one. Example: https://tgit.kms-technology.com/phuonglam/test-202-introducing-selenium.git not https://tgit.kms-technology.com/fundamentals/test-202-introducing-selenium.git
5. Pull new code from the original repo: Sometimes, the course owner may want to update the original repo of the course (Example: To provide some utilities so that writing test can be easier), and you must sync the changes from original repo to your repo. To do that: 
    1. First add the original repo as your remote, follow the link [here](https://help.github.com/articles/configuring-a-remote-for-a-fork/). 
    2. Then, sync it using the instruction [here](https://help.github.com/articles/syncing-a-fork/). 

Note: You just need to open the terminal, not the Git bash. After doing the instructions, only your local repository is synced, you must push the change to your remote repository.

# Compile and run with IntelliJ
1. Open the project: File > Open > Navigate to project location
2. Add JDK to IntelliJ: File > Project Structure > Platform Settings > SDKs > Click on Add button at the top of popup > JDK > Navigate to JDK home (Example: C:\Program Files\Java\jdk1.8.0_152)
3. Set JDK for the project: On the Project Structure popup > Project Settings > Project SDK > Select above JDK
4. Set project language level: On the Project Structure popup > Project Settings > Project Language Level > Select level 8. The go to Module section > Language Level > Select level 8
5. Set Target byte code version: File > Settings > Build, Execution, Deployment > Compiler > Java Compiler > On the SeleniumPractice module's target byte code version, select 1.8
5. Add Run Configuration: Run > Edit Configurations > Click on Add button > JUnit > Name it "Run test" > On the "Test Type" field select "All in package" > On the "Package" field type "vn.kms.course.selenium.tests"
6. Select above configuration and run
  

# Write tests
These cases are to test the Saleor system, it's deployed at http://demo.getsaleor.com.
## Login successfully
1. Navigate user to login page
2. Fill in username/password fields with valid credentials: admin@sample.com/Kms@2017
3. Click Login btn. Expected result: 
  * User is navigated to Home page. 
  * On the top-right corner, there're three items: DASHBOARD, YOUR ACCOUNT and LOG OUT
4. Click Log out btn. Expected result: 
   * User is navigated to Home page. 
   * On the top-right corner, there're two items: REGISTER, LOGIN. 
   * The message "You have been successfully logged out." is displayed

## Validate add to cart feature
1.  Navigate to Accessories page
2. Select a random product, click on it
3. Enter a random quantity number
4. Click add to cart
5. Navigate to Groceries page
6. Select a random product, click on it
7. Enter a random quantity number
8. Click add to cart
9. Navigate to cart page. Expected result:
    - Number of products is correct
    - Product information (Name, quantity, price) is correct
    - Subtotal is correct


After finishing those test cases, if you still want to practice more, write out some test cases for the Saleor, including the detailed test steps and validation points (I think it's easy since... you're testers, right? Writing test cases is what you do in your daily job) and then try to automate them.
   
# Some suggestion

* Apply POM to manage your code
* Try to avoid duplicate code (Tips: When you're using Ctrl+C/Ctrl+V, maybe you're duplicating code)

# Commit code
* Commit your code and push it to your repository (`git add .`, `git commit` and `git push` )
* Add course trainer to your project with developer role: On the project page, click on Setting button > Members > Search for trainer name > Select "Developer" for "Project Access" field > Click on Add users to project
* Submit an [evaluation request](https://klms.kms-technology.com/mod/quiz/view.php?id=1847) on KMLS 


