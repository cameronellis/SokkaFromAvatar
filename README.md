# Sokka from Avatar - Amazon Alexa Skill

Ever wanted to ask Sokka from the popular television series Avatar: The Last Airbender a question? Well, now you can!

![Sokka from Avatar YouTube Thumbnail](https://i.imgur.com/pHuaCP5.jpg)

Motivation from this viral YouTube video: [Amazon Echo: Sokka Style ( Avatar: The Last Airbender )](https://www.youtube.com/watch?v=MbS-keXO7fY)

## Questions you can ask Sokka
- “Alexa, ask Sokka from avatar what he can do”
- “Alexa, ask Sokka from avatar to play rock music”
- “Alexa, ask Sokka from avatar what time it is”
- “Alexa, ask Sokka from avatar how tall Mt. Everest is”
- “Alexa, ask Sokka from avatar to add wrapping paper to the shopping list”
- “Alexa, ask Sokka from avatar how many teaspoons there are in a tablespoon”
- “Alexa, ask Sokka from avatar to give me my flash news briefing”
- “Alexa, ask Sokka from avatar to tell me a joke”
- “Alexa, ask Sokka from avatar to spell cantaloupe”
- “Alexa, ask Sokka from avatar to play my dance mix”
- “Alexa, ask Sokka from avatar to define annoying”
- "Alexa, what are some questions I can ask Sokka from Avatar?"

## Announcements 
This project is still in development!

You're now able to get responses from Sokka!

The next steps are iron out any wrinkles in making the user experience as smooth as possible, review certification requirements to publish this skill on the Alexa marketplace, and to publicize this skill

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

- An Amazon Developer account
- An Amazon Web Services (AWS) account
- Java 8 SDK
- Maven 3.3.9 (or higher)

### Installing

A step by step series of examples that tell you have to get a development env running

1. Clone the project to your local computer
```
git clone https://github.com/cameronellis/SokkaFromAvatar.git
```

### Building and Running the Project

1. Check that the code compiles properly by running the following command
```
mvn clean install
```
2. From the root of the 'AkexaSkillAskSokka' folder where there is a ```pom.xml``` file, build the code into a package to prepare it for upload to AWS S3 by running the following command. It produces a ```AlexaSkillAskSokka-1.0-SNAPSHOT-jar-with-dependencies.jar``` file in the ```target``` directory.
```
mvn org.apache.maven.plugins:maven-assembly-plugin:2.6:assembly -DdescriptorId=jar-with-dependencies package
```
3. Uploading the skill to AWS Lambda

   1. If you do not already have an account on AWS, go to [Amazon Web Services](http://aws.amazon.com/) and create an account.
   2. Log in to the [AWS Management Console](http://aws.amazon.com/) and navigate to AWS Lambda.
   3. Click the region drop-down in the upper-right corner of the console and select one of the regions supported for Alexa skills: Asia Pacific (Tokyo), EU (Ireland), US East (N. Virginia), or US West (Oregon).
   4. If you have no Lambda functions yet, click Get Started Now. Otherwise, click Create function.
   5. Make sure to confirm that "Author from scratch" option is selected.
   6. Enter a Name for the function.
   7. Select the Role for the function. This defines the AWS resources the function can access.   
       1. To use an existing role, select the role under Existing role.
       2. To create a new role, see [Defining a new Role for the Function](https://developer.amazon.com/en-US/docs/alexa/custom-skills/host-a-custom-skill-as-an-aws-lambda-function.html#define-new-role).
   8. Select the language you want to use for the Runtime which is Java 8 in our case.
   9. Click "Create function".
   10. Configure the Alexa Skills Kit trigger for the function as [described here](https://developer.amazon.com/en-US/docs/alexa/custom-skills/host-a-custom-skill-as-an-aws-lambda-function.html#configuring-the-alexa-skills-kit-trigger). Make sure you have completed [adding an Alexa Skills Kit Trigger](https://developer.amazon.com/en-US/docs/alexa/custom-skills/host-a-custom-skill-as-an-aws-lambda-function.html#add-ask-trigger).
   11. Upload the JAR file produced in the previous step under Function code.
   12. Fill in the Handler information with fully qualified class name of your stream handler class.
   13. Finally, copy the ARN of your AWS Lambda function because you will need it when configuring your skill in the Amazon Developer console. You can find this on the top right corner.

4. Configuring the skill
    1. First, navigate to the [Alexa Skills Kit Developer Console](https://developer.amazon.com/alexa/console/ask).
    2. Click the "Create Skill" button in the upper right. 
    3. Enter "Sokka from Avatar" as the skill name.
    4. On the next page, select "Custom" and click "Create skill".
    5. Copy the JSON schema provided in this repo and upload it to the website
    6. Under "Intents", click "Save Model". Once complete, click "Build Model"
    7. Under "Endpoint" select "AWS Lambda ARN" and paste in the ARN of the function you created previously.
    8. Click "Save Endpoints"
    
5. Testing the skill
    1. Finally, in the "Test" tab of the developer console, you can simulate requests in text and voice form to the skill

## Built With

* [Java 8](http://www.oracle.com/technetwork/java/javase/downloads/index-jsp-138363.html)
* [AWS Lambda](https://aws.amazon.com/lambda/)
* [AWS IAM](https://aws.amazon.com/iam/)
* [AWS S3](https://aws.amazon.com/s3/)
* [Maven 3.3.9](https://maven.apache.org/)
* [Alexa Skills Kit SDK for Java](https://github.com/alexa/alexa-skills-kit-sdk-for-java)

## Authors

* **Cameron Ellis** - *Initial work*

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## References
* [Official Amazon Alexa instructions for building a skill](https://developer.amazon.com/en-US/docs/alexa/alexa-skills-kit-sdk-for-java/develop-your-first-skill.html#building-the-skill)
* [Official Amazon Alexa instructions for uploading your skill to AWS Lambda](https://developer.amazon.com/en-US/docs/alexa/alexa-skills-kit-sdk-for-java/develop-your-first-skill.html#uploading-your-skill-to-aws-lambda)
* [Official Amazon Alexa instructions for configuring and testing your skill]()



