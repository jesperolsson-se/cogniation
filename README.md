Being able to make mental connections between concepts, events or mental
states - cognitive associations - are crucial to e.g., memory and learning.
Strokes and other medical conditions can severely damage this ability, and
require training or rehabilitation. This project packages such exercises in
a web service, thus making the treatment easily accessible and the patient
more independent.

# Use cases

Cogniation aims to be a tool that primarily facilitates home rehabilitation for stroke patients. The software should be considered complementary to traditional health care, and not a replacement.

## Patient independence

Andrew is a stroke patient suffering reduced cognitive capacity and is in need of rehabilitation. Being aware of these limitations, he thinks of himself as "dumb" and feels embarrassed and vulnerable. Because of this, Andrew is reluctant to ask his family for help in administrating his exercises. _Cogniation_ would give Andrew the amount of privacy and control he needs to keep pace with his treatment.

## Accessible at a moment's notice

Beatrice has almost finished her stroke rehabilitation and life has mostly returned to normal. In spite of this, she sometimes notices problems in recalling certain words or past events. Hence, Beatrice takes whatever opportunities she can to continue her training e.g., when waiting in a line. With _Cogniation_, Beatrice doesn't have to bring her old exercise sheets with her but can instead rely her phone's web browser.

# Usage

Pull the latest image from Docker Hub.

```bash
docker pull jesperolssonse/cogniation:latest
```

Next, instantiate a container and forward it to, e.g., port 8080.

```bash
docker run -d --rm -p 8080:8080 -e LANGUAGE=en_us jesperolssonse/cogniation:latest
```

Finally, point a web browser to said port.

```bash
curl http://localhost:8080
```

# How to contribute

Thank you for considering to contribute to this project. We appreciate all
efforts to improve Cogniation, no matter how small. Please fork the repo, make
your changes, and submit a pull request.

Small pull request will be processed much faster and are less likely to be
rejected. Please also observe that the static code analysis is _very_ strict,
so you'll most likely want to ensure that your changes pass the checks locally. 

```bash
./mvnw -Pdev clean verify`
```
