Being able to make mental connections between concepts, events or mental
states - cognitive associations - are crucial to e.g., memory and learning.
Strokes and other medical conditions can severely damage this ability, and
require training or rehabilitation. This project packages such exercises in
a web service, thus making the treatment easily accessible and the patient
more independent.

# Usage

Start by installing Cogniation through Maven.

`mvn clean package`

This creates a JAR file, which can then be executed and forwarded to port 8080.

`java -cp ./target/cogniation-0.1.jar:./target/deps/* se.jesperolsson.cogniation.Main`

Finally, point a web browser to said port.

`curl http://localhost:8080`

# How to contribute

Thank you for considering to contribute to this project. We appreciate all
efforts to improve Cogniation, no matter how small. Please fork the repo, make
your changes, and submit a pull request.

Small pull request will be processed much faster and are less likely to be
rejected. Please also observe that the static code analysis is _very_ strict,
so you'll most likely want to ensure that your changes pass the checks locally. 

`mvn -Pdev clean verify`
