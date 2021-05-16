# NghiaTrongTran_JBehave
NghiaTrongTran QAExercies with JBehave
Envrironment:
 - Open JDK 14.0.2
 - IntelliJ 2021.1.1 (Comminity Edition)

Execute Test:
 1. Open Project With IntelliJ
 2. Wait for Maven import all necessary Libraries and Dependencies
 3. Execute Test:
    - From Story: 
      1. Open GoogleSearch.story class under path '/src/test/resource/stories'
      2. Click play icon at line 6 then select "run 'Scenario Google Search with JBehave keyword'"
    - From Class:
      1. Right click AcceptanceTest class under path '/src/test/java/com/google/stepsdefinition'
      2. Select "run 'AcceptanceTest'"
    - From mvn:
      1. Click Maven
      2. Click 'm' icon ('Execute Maven Goal')
      3. Select 'mvn clean'
      4. Repeat step 1 to 2 and select 'mvn verify'
4. Test report will be generated under '/target/site/serenity/index.html' and '/target/jbehave/view/index.html'. Right click index.html. Open In > Browser > Select your expected browser (ex. 'Chrome')
