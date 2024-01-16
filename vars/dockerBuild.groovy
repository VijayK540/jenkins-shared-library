def call(String dockerHubUsername, String imageName) {
    // Build the Docker image
    sh "docker build --build-arg REACT_APP_RAPID_API_KEY=f0ee5dc94fc7msh25e89f400a13291p136509jsn41c6bea4ca1a -t ${imageName} ."
     // Tag the Docker image
    sh "docker tag ${imageName} ${dockerHubUsername}/${imageName}:latest"
    // Push the Docker image
    withDockerRegistry([url: 'https://index.docker.io/v1/', credentialsId: 'Docker-jenkins']) {
        sh "docker push ${dockerHubUsername}/${imageName}:latest"
    }
}
